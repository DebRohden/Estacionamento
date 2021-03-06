package Principal.Model;

import Principal.Persistencia.PersistenciaCliente;
import java.io.IOException;
import java.util.ArrayList;

public class Cliente extends Pessoa {

    public Cliente() {

    }

    public Cliente(String nome, String email, String telefone) {
        super(nome, email, telefone);
    }
    
    public void salva(Cliente Cliente) throws IOException{
        ArrayList<Cliente> Clientes = PersistenciaCliente.importaCliente();
        
        Clientes.add(Cliente);
        PersistenciaCliente.exportaCliente(Clientes);
    }

}
