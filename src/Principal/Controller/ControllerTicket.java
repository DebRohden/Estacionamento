package Principal.Controller;

import java.io.IOException;
import java.util.Date;
import Principal.Model.ModelFuncionario;
import Principal.Model.ModelTicket;
import Principal.Model.ModelValor;
import Principal.Model.ModelVeiculo;
import Principal.Model.ModelVaga;
import Principal.Persistencia.PersistenciaTicket;
import Principal.View.Principal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControllerTicket {

    protected Principal Principal;
    private   String sTicket;

    public ControllerTicket(Principal Principal) {
        this.Principal = Principal;
        this.geraTicket();
    }

    public void geraTicket() {
        this.sTicket                  = "";
        ModelFuncionario oFuncionario = this.Principal.getFuncionario();
        
        try { 
            String sPlaca         = JOptionPane.showInputDialog(null, "Placa do Veículo: ");
            boolean bAchouTicket  = false;
            if(ModelVeiculo.buscaVeiculoFromPlaca(sPlaca) != null){
                for (ModelTicket Ticket : ModelTicket.busca()) {
                    if (Ticket.getVeiculo().getPlaca().equals(sPlaca)) {
                        try {
                            this.saidaTicket(Ticket, oFuncionario);
                        } catch (IOException ex) {
                            Logger.getLogger(ControllerTicket.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        bAchouTicket = true;
                    }
                }

                if(!bAchouTicket){
                    try {
                        this.entradaTicket(sPlaca, oFuncionario);
                    } catch (IOException ex) {
                        Logger.getLogger(ControllerTicket.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            else {
                this.Principal.dispose();
                this.Principal.show();
                JOptionPane.showMessageDialog(null, "Placa não cadastrada.");
            }
        }
        catch (java.lang.NullPointerException e) {
            this.Principal.dispose();
            this.Principal.show();
            this.Principal.entradaCarro.setText(this.sTicket);
        }
    }

    public void entradaTicket(String sPlaca, ModelFuncionario oFuncionario) throws IOException {
        ModelVeiculo oVeiculo = ModelVeiculo.buscaVeiculoFromPlaca(sPlaca);
        ModelVaga    oVaga    = ModelVaga.getFirstVagaLivre();
        oVaga                 = oVaga.alteraVaga();
        
        ModelTicket oTicket   = new ModelTicket();
        oTicket.setHoraEntrada(getDate());
        oTicket.setVeiculo(oVeiculo);
        oTicket.setProprietario(oVeiculo.getProprietario());
        oTicket.setVaga(oVaga);
        oTicket.setFuncionarioEntrada(oFuncionario);
        oTicket.salva(oTicket);
        this.imprimeTicketEntrada(oTicket);
        
        JOptionPane.showMessageDialog(null, "Ticket de entrada a ser impresso.");
    }
    
    public void saidaTicket(ModelTicket oTicket, ModelFuncionario oFuncionario) throws IOException {
        ModelValor oValor = ModelValor.buscaUltimoValor();
        oTicket.getVaga().alteraVaga();
       
        this.imprimeTicketSaida(oTicket, oValor, oFuncionario);
        
        PersistenciaTicket persistencia = new PersistenciaTicket();
        persistencia.deleteTicket(oTicket);
        
        JOptionPane.showMessageDialog(null, "Ticket de saida a ser impresso.");
    }

    private void imprimeTicketEntrada(ModelTicket oTicket) {

        String imprimir;

        imprimir = "    ESTACIONAMENTO - TICKET DE ENTRADA \n\r"
                + "------------------------------------- \n\r"
                + "HORÁRIO ENTRADA : " + oTicket.getHoraEntrada() + "\n\r"
                + "PROPRIETARIO " + oTicket.getVeiculo().getProprietario().getNome() + "\n\r"
                + "PLACA " + oTicket.getVeiculo().getPlaca() + "\n\r"
                + "COR " + oTicket.getVeiculo().getCor() + "\n\r"
                + "VAGA " + oTicket.getVaga().getNumero() + "\n\r"
                + "FUNCIONÁRIO ENTRADA " + oTicket.getFuncionarioEntrada().getNome()
                + "\n\r "
                + "\n\r"
                + "\n\r"
                + "\n\r"
                + "\n\r"
                + "\n\r"
                + "\n\r"
                + "\n\r"
                + "\n\r"
                + "\n\r"
                + "" + "\f";
        ControllerImpressao.imprimir(imprimir);
        this.sTicket = imprimir;
    }

    public void imprimeTicketSaida(ModelTicket oTicket, ModelValor oValor, ModelFuncionario oFuncionario) {

        String imprimir;

        imprimir = "ESTACIONAMENTO - TICKET DE SAÍDA \n\r"
                + "------------------------------------- \n\r"
                + "HORÁRIO ENTRADA : " + oTicket.getHoraEntrada() + "\n\r"
                + "HORÁRIO SAÍDA : " + oTicket.getHoraSaida() + "\n\r"
                + "PROPRIETARIO " + oTicket.getVeiculo().getProprietario().getNome() + "\n\r"
                + "PLACA " + oTicket.getVeiculo().getPlaca() + "\n\r"
                + "COR " + oTicket.getVeiculo().getCor() + "\n\r"
                + "VAGA " + oTicket.getVaga().getNumero() + "\n\r"
                + "FUNCIONARIO ENTRADA " + oTicket.getFuncionarioEntrada().getNome() + "\n\r"
                + "FUNCIONARIO SAIDA "   + oFuncionario.getNome() + "\n\r"
                + "VALOR P/HORA : R$ " + oValor.getValor() + "\n\r"
                + "VALOR A PAGAR : R$ " + getValorTotal(oTicket, oValor) + "\n\r"
                + "\n\r"
                + "\n\r"
                + "\n\r"
                + "\n\r"
                + "\n\r"
                + "" + "\f";
            ;
        ControllerImpressao.imprimir(imprimir);
        this.sTicket = imprimir;
    }
    
    private double getValorTotal(ModelTicket oTicket, ModelValor oValor){
        long entradS = oTicket.getHoraEntrada();
        long dif     = (getDate() - entradS);
        dif = ((dif / 1000) / 60);
        double valorTotal = ((dif) * ( oValor.getValor() / 60));
        return valorTotal;
    }
    
    private long getDate(){
        Date oData = new Date();
        long data = oData.getTime();
        return data;
    }

}
