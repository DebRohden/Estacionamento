package Principal.Model;

public class Pessoa {

    public String nome;
    public String email;
    public String telefone;

    public Pessoa() {

    }

    public Pessoa(String nome, String email, String telefone) {
        this.nome     = nome;
        this.email    = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Pessoa [nome=");
        builder.append(nome);
        builder.append(", email=");
        builder.append(email);
        builder.append(", telefone=");
        builder.append(telefone);
        builder.append("]");
        return builder.toString();
    }

}
