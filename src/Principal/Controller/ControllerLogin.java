package Principal.Controller;

import Principal.Model.ModelFuncionario;

import Principal.View.Principal;
import Principal.View.ViewLogin;

import javax.swing.JOptionPane;

public class ControllerLogin {
    
    private ViewLogin Tela;
    
    public ControllerLogin(Object View) {
        this.verificaLogin(View);
    }
    
    private void verificaLogin(Object View){
        Tela = (ViewLogin) View;
        boolean bAchou = false;
        
        if(!this.Tela.campoUsuario.getText().equals("")){
            String sEmail = this.Tela.campoUsuario.getText();
            String sSenha = ControllerCriptografia.stringHexa(ControllerCriptografia.criptografa(String.valueOf(this.Tela.campoSenha.getPassword())));

            if(sEmail.equals("") || String.valueOf(this.Tela.campoSenha.getPassword()).equals("")){
                JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos!");
            }else{
                for (ModelFuncionario Funcionario : ModelFuncionario.busca()) {
                    if ((Funcionario.getEmail().equals(sEmail)) && (Funcionario.getSenha().equals(sSenha))) {
                        bAchou = true;

                        ModelFuncionario oFuncionario = new ModelFuncionario();
                        oFuncionario.setEmail(Funcionario.getEmail());
                        oFuncionario.setNome(Funcionario.getNome());

                        Principal Principal = new Principal(oFuncionario);
                        Principal.setVisible(true);
                        this.Tela.dispose();
                    }
                }
            }
        }

        if (!bAchou) {
            JOptionPane.showMessageDialog(null, "Usuário e/ou senha incorreto!");
        }
    }
}