package Principal.Controller;

import Principal.Model.ModelFuncionario;
import Principal.View.Principal;
import Principal.View.ViewCliente;
import Principal.View.ViewVaga;
import Principal.View.ViewVeiculo;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ControllerPrincipal {

    protected Principal Tela;
    protected ControllerVaga ControllerVaga;

    /**
     * Chamado pelo ControllerLogin para receber um Funcionario no Principal
     *
     * @param Funcionario oFuncionario
     * @param Principal   View
     */
    public ControllerPrincipal(ModelFuncionario oFuncionario, Object View) {
        Tela = (Principal) View;
        this.trataFuncionalidades(oFuncionario);
    }

    /**
     * Deve ser invocado quando é necessário fechar um Jframe sem ser o
     * Principal
     *
     * @param Principal View
     */
    public ControllerPrincipal(Object View) {
        Tela = (Principal) View;
        this.closeWindow();
    }

    private void trataFuncionalidades(ModelFuncionario oFuncionario) {
        this.setUsuario(oFuncionario.getNome());
        this.setHora();
        this.setVagasDisponiveis();
        this.setVagasOcupadas();
        this.setValores();
        this.setFuncionario(oFuncionario);
    }
    
    private void setFuncionario(ModelFuncionario oFuncionario){
        this.Tela.setFuncionario(oFuncionario);
    }

    private void setUsuario(String sNome) {
        this.Tela.labelFuncionario.setText("Funcionário: " + sNome);
    }

    private void setHora() {
        Date data = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.Tela.labelData.setText(dateFormat.format(data));
    }

    private void setVagasDisponiveis() {
        ControllerVaga = new ControllerVaga();
        this.Tela.labelVagasDisponiveis.setText("Vagas Disponíveis: " + ControllerVaga.vagasDisponiveis());
    }

    private void setVagasOcupadas() {
        ControllerVaga = new ControllerVaga();
        this.Tela.labelVagasOcupadas.setText("Vagas Ocupadas: " + ControllerVaga.vagasOcupadas());
    }

    private void setValores() {
        ControllerValor ControllerValor = new ControllerValor(this.Tela);
        ControllerValor.mostraValor();
    }

    public void callView() {
        ViewVaga View = new ViewVaga(this.Tela);
        View.setVisible(true);
        this.Tela.setEnabled(false);
    }

    public void callViewCliente() {
        ViewCliente View = new ViewCliente(this.Tela);
        View.setVisible(true);
        this.Tela.setEnabled(false);
    }
    
    public void callViewVeiculo(){
        ViewVeiculo View = new ViewVeiculo(this.Tela);
        View.setVisible(true);
        this.Tela.setEnabled(false);
    }

    /**
     * Método chamado no dispose do JFrame
     */
    private void closeWindow() {
        this.Tela.setEnabled(true);
    }

}
