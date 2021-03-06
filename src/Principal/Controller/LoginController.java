package Principal.Controller;

import Principal.Model.Funcionario;
import Principal.Persistencia.PersistenciaFuncionario;
import Principal.View.Principal;
import Principal.View.ViewLogin;
import classesUteis.Criptografa;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LoginController {
    
    private ViewLogin Tela;
    
    public LoginController(Object View) throws FileNotFoundException, IOException, NoSuchAlgorithmException{
        
        Tela = (ViewLogin) View;
        
        ArrayList<Funcionario> Funcionario = new ArrayList<Funcionario>();
        Criptografa cript = new Criptografa();
        
        PersistenciaFuncionario persistenciaFuncionario = new PersistenciaFuncionario();
        
        Funcionario = persistenciaFuncionario.importaFuncionario(Funcionario);
        boolean achou = false;

        String sEmail = this.Tela.caixaTextoUsuario.getText();
        String sSenha = cript.stringHexa(cript.criptografa(String.valueOf(this.Tela.caixaTextoSenha.getPassword())));

        for (Funcionario fun : Funcionario) {
            if ((fun.getEmail().equals(sEmail)) && (fun.getSenha().equals(sSenha))) {
                achou = true;
                this.Tela.nomeFuncionario = fun.nome;
                this.Tela.fun = fun;

                Principal menu = new Principal();
                menu.setVisible(true);
                this.Tela.dispose();
            }
        }
        
        if (!achou) {
            JOptionPane.showMessageDialog(null, "Usuário e/ou senha incorreto!");
        }
    }
}