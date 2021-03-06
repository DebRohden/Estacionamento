package Principal.Model;

import java.util.Date;

public class Ticket {

	private   Date        horaEntrada;
	private   Date        horaSaida;
        protected Vaga        Vaga;
        protected Veiculo     Veiculo;
        protected Cliente     Proprietario;
	protected Funcionario FuncionarioEntrada;

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Date horaSaida) {
        this.horaSaida = horaSaida;
    }

    public Vaga getVaga() {
        return Vaga;
    }

    public void setVaga(Vaga Vaga) {
        this.Vaga = Vaga;
    }

    public Veiculo getVeiculo() {
        return Veiculo;
    }

    public void setVeiculo(Veiculo Veiculo) {
        this.Veiculo = Veiculo;
    }

    public Cliente getProprietario() {
        return Proprietario;
    }

    public void setProprietario(Cliente Proprietario) {
        this.Proprietario = Proprietario;
    }

    public Funcionario getFuncionarioEntrada() {
        return FuncionarioEntrada;
    }

    public void setFuncionarioEntrada(Funcionario FuncionarioEntrada) {
        this.FuncionarioEntrada = FuncionarioEntrada;
    }

    public void setHoraSaida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     

}
