package Principal.Controller;

import Principal.Model.ModelValor;
import Principal.View.Principal;
import java.util.Date;
import javax.swing.JOptionPane;

public class ControllerValor {
    
    protected Principal Principal;
    
    public ControllerValor(Principal Principal){
        this.Principal = Principal;
    }

    public ControllerValor() {

    }
    
    public void mostraValor(){
        if(ModelValor.busca().isEmpty()){
            this.Principal.campoHistoricoValor.setText("Não há histórico de valores a serem mostrados!");
        }else{
            this.Principal.campoHistoricoValor.setText("");
            for(ModelValor Valor : ModelValor.busca()){
                this.Principal.campoHistoricoValor.setText(this.Principal.campoHistoricoValor.getText() + Valor.toString() + "\n");
            }
        }
    }
    
    public void cadastroValor(){        
            ModelValor oValor = new ModelValor();
            oValor.setData(new Date());
            oValor.setValor(Double.parseDouble(JOptionPane.showInputDialog("Valor")));
            oValor.salva(oValor);
            this.mostraValor();
    }
}
