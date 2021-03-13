package Principal.Model;

import Principal.Persistencia.PersistenciaCliente;
import Principal.Persistencia.PersistenciaTicket;
import java.util.ArrayList;
import java.util.Date;

public class ModelTicket {

    private   long             horaEntrada;
    private   long             horaSaida;
    protected ModelVaga        Vaga;
    protected ModelVeiculo     Veiculo;
    protected ModelCliente     Proprietario;
    protected ModelFuncionario FuncionarioEntrada;

    public long getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(long horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public long getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(long horaSaida) {
        this.horaSaida = horaSaida;
    }

    public ModelVaga getVaga() {
        return Vaga;
    }

    public void setVaga(ModelVaga Vaga) {
        this.Vaga = Vaga;
    }

    public ModelVeiculo getVeiculo() {
        return Veiculo;
    }

    public void setVeiculo(ModelVeiculo Veiculo) {
        this.Veiculo = Veiculo;
    }

    public ModelCliente getProprietario() {
        return Proprietario;
    }

    public void setProprietario(ModelCliente Proprietario) {
        this.Proprietario = Proprietario;
    }

    public ModelFuncionario getFuncionarioEntrada() {
        return FuncionarioEntrada;
    }

    public void setFuncionarioEntrada(ModelFuncionario FuncionarioEntrada) {
        this.FuncionarioEntrada = FuncionarioEntrada;
    }
    
    public static ArrayList<ModelTicket> busca(){
        return PersistenciaTicket.importa();
    }
    
    public void salva(ModelTicket oTicket){
        ArrayList<ModelTicket> aTicket = this.busca();
        aTicket.add(oTicket);
        PersistenciaTicket.exporta(aTicket); 
    }
    
    public static ModelTicket getTicketFromPlaca(String sPlaca){
        ModelTicket oTicket = new ModelTicket();
        
        for(ModelTicket ticket: busca()){
            if(ticket.getVeiculo().getPlaca().equals(sPlaca)){
                oTicket = ticket;
                break;
            }
        }
        return oTicket;
    }

}
