package Principal.Model;

import Principal.Persistencia.PersistenciaCliente;
import java.util.ArrayList;

public class ModelCliente extends ModelPessoa {

    public ModelCliente() {

    }

    public ModelCliente(String nome, String email, String telefone) {
        super(nome, email, telefone);
    }
    
    public static ArrayList<ModelCliente> busca(){
        return PersistenciaCliente.importa();
    }
    
    public void salva(ModelCliente oCliente) {        
        ArrayList<ModelCliente> aCliente = this.busca();
        aCliente.add(oCliente);
        PersistenciaCliente.exporta(aCliente); 
    }

}
