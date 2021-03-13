package Principal.Controller;

import Principal.Model.ModelCliente;
import Principal.Model.ModelVeiculo;

import Principal.View.ViewCliente;

import javax.swing.JOptionPane;

public class ControllerCliente{
       
    protected ViewCliente Tela;
    
    public ControllerCliente(Object View){
        Tela = (ViewCliente) View; 
    }
    
    public void cadastroCliente(){        
        String sNome     = this.Tela.campoNome.getText();
        String sEmail    = this.Tela.campoEmail.getText();
        String sTelefone = this.Tela.campoTelefone.getText();   

        if (sNome.equals("") || sEmail.equals("") || sTelefone.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos!");
        } else {
            if (ControllerVerificadorEmail.verificaEmail(sEmail)) {

                ModelCliente oCliente = new ModelCliente(); 
                oCliente.setNome(sNome);
                oCliente.setEmail(sEmail);  
                oCliente.setTelefone(sTelefone);
                oCliente.salva(oCliente);       
            }
        }
    }
    
    public static boolean verificaCliente(String sNome, String sEmail){
        boolean bExiste = false;
        for(ModelCliente Cliente : ModelCliente.busca()){
            if(sNome.equals(Cliente.getNome()) && sEmail.equals(Cliente.getEmail())){
                bExiste = true;
            }
        }
        return bExiste;
    }
    
}
