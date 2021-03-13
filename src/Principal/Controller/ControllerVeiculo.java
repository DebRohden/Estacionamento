package Principal.Controller;

import Principal.Model.ModelCliente;
import Principal.Model.ModelMarca;
import Principal.Model.ModelModelo;
import Principal.Model.ModelVeiculo;
import Principal.View.Principal;
import Principal.View.ViewVeiculo;
import javax.swing.JOptionPane;

public class ControllerVeiculo {

    protected Principal   Principal;
    protected ViewVeiculo Tela;
    
    public ControllerVeiculo(Object View){
        Tela = (ViewVeiculo) View;
    }
    
    public void cadastroVeiculo(){   
        boolean bCliente         = false;
        boolean bPlacaValida     = false;
        boolean bPlacaCadastrada = false;
        
        String sCor    = this.Tela.campoCor   .getText();
        String sPlaca  = this.Tela.campoPlaca .getText();
        String sMarca  = this.Tela.campoMarca .getText();
        String sModelo = this.Tela.campoModelo.getText();
        String sNome   = this.Tela.campoNome  .getText();
        String sEmail  = this.Tela.campoEmail .getText();
        
        if(sCor.equals("") || sPlaca.equals("") || sMarca.equals("") || sModelo.equals("") || sNome.equals("") || sEmail.equals("")){
            JOptionPane.showMessageDialog(null, "Preecha todos os campos!");
        }else{  
            
            if(ControllerCliente.verificaCliente(sNome, sEmail)){
                bCliente = true;
            }else{
                JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
            }
            
            if(this.verificaPlaca(sPlaca)){
                bPlacaValida = true;
            }else{
                JOptionPane.showMessageDialog(null, "Placa inválida");
            }
            
            if(this.verificaPlacaCadastrada(sPlaca)){
                JOptionPane.showMessageDialog(null, "Placa já cadastrada!");
            }
            
            if(bCliente && bPlacaValida && !bPlacaCadastrada){
                
                ModelCliente oCliente = new ModelCliente();
                oCliente.setNome(sNome);
                oCliente.setEmail(sEmail);
                
                ModelMarca oMarca = new ModelMarca();
                oMarca.setDescricao(sMarca);
                
                ModelModelo oModelo = new ModelModelo();
                oModelo.setMarca(oMarca);
                oModelo.setDescricao(sModelo);
                        
                ModelVeiculo oVeiculo = new ModelVeiculo();
                oVeiculo.setCor(sCor);
                oVeiculo.setPlaca(sPlaca);
                oVeiculo.setModelo(oModelo);
                oVeiculo.setProprietario(oCliente);
                oVeiculo.salva(oVeiculo);
                
            }
        }
        
    }
    
    public boolean verificaPlaca(String sPlaca) {
        String[] aPlacaVeiculo = sPlaca.split("");

        if ((aPlacaVeiculo.length == 7) && (aPlacaVeiculo[0].matches("[A-Z]")) && (aPlacaVeiculo[1].matches("[A-Z]"))
                && (aPlacaVeiculo[2].matches("[A-Z]")) && (aPlacaVeiculo[4].matches("[0-9]"))
                && (aPlacaVeiculo[5].matches("[0-9]")) && (aPlacaVeiculo[6].matches("[0-9]"))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verificaPlacaCadastrada(String sPlaca) {
        for (ModelVeiculo Veiculo : ModelVeiculo.busca()) {
            if ((sPlaca.equals(Veiculo.getPlaca()))) {
                return true;
            }
        }
        return false;
    }
    
}
