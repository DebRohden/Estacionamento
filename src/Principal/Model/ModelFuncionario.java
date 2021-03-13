package Principal.Model;

import Principal.Persistencia.PersistenciaFuncionario;
import java.util.ArrayList;

public class ModelFuncionario extends ModelPessoa {

    private String senha;

    public ModelFuncionario() {

    }

    public ModelFuncionario(String nome, String email, String telefone) {
        super(nome, email, telefone);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public static ArrayList<ModelFuncionario> busca(){
        return PersistenciaFuncionario.importa();
    }
    
    public void salva(ModelFuncionario oFuncionario) {        
        ArrayList<ModelFuncionario> aFuncionario = this.busca();
        aFuncionario.add(oFuncionario);
        PersistenciaFuncionario.exporta(aFuncionario); 
    }

}
