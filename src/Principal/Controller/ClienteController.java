package Principal.Controller;

import Principal.Model.Cliente;
import Principal.Model.Veiculo;

import Principal.View.ViewCliente;
import Principal.View.Principal;
import classesUteis.VerificadorEmail;

import java.io.IOException;
import javax.swing.JOptionPane;

public class ClienteController{
       
    private ViewCliente Tela;
    
    public void cadastroCliente(Object View){
        
        Tela = (ViewCliente) View;     
        
        Cliente oCliente = new Cliente();
        Veiculo oVeiculo = new Veiculo();    
        
        String sNome     = this.Tela.campoNome.getText();
        String sEmail    = this.Tela.campoEmail.getText();
        String sTelefone = this.Tela.campoTelefone.getText();

        //ArrayList<Veiculo> Veiculos = PersistenciaVeiculo.importaVeiculo();   

        if ((sNome.equals("") || (sEmail.equals("")) || (sTelefone.equals("")))) {
            JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos!");
        } else {
            if (VerificadorEmail.verificaEmail(sEmail)) {

                oCliente.setNome(sNome);
                oCliente.setEmail(sEmail);  
                oCliente.setTelefone(sTelefone);
                
                try {
                    oCliente.salva(oCliente);
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                    this.callSistema();          
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao realizar o cadastro!");        
                }

                /*
                (oVeiculo.verificaPlaca(placaVeiculo)) && (
                || (marcaVeiculo.equals(""))
                || (corVeiculo.equals("")) || (modeloVeiculo.equals("")) || (placaVeiculo.eqequals("")) || (marcaVeiculo.equals(""))
                || (corVeiculo.equals("")) || (modeloVeiculo.equals(""))uals("")))
                
                novoVeiculo.setModelo(modelo);
                novoVeiculo.setPlaca(placaVeiculo);
                novoVeiculo.setCor(corVeiculo);
                novoVeiculo.setProprietario(cliente);
                veiculo.add(novoVeiculo);

                adicionaMarca(marca);

                json.exportaVeiculo(veiculo);*/

            }
        }
    } 
    
    public void callSistema(){
        Principal oPrincipal = new Principal();
        oPrincipal.setVisible(true);
        this.Tela.dispose();
    }
}
