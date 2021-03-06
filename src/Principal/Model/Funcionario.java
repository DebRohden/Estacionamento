package Principal.Model;

public class Funcionario extends Pessoa {

    private String senha;

    public Funcionario() {

    }

    public Funcionario(String nome, String email, String telefone) {
        super(nome, email, telefone);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
