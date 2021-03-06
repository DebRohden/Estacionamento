package Principal.Model;

public class Vaga {

    public int     numero;
    public boolean livre;
    public boolean permicao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isPermicao() {
        return permicao;
    }

    public void setPermicao(boolean permicao) {
        this.permicao = permicao;
    }

    public boolean isLivre() {
        return livre;
    }

    public void setLivre(boolean livre) {
        this.livre = livre;
    }

}
