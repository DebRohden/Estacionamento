package Principal.Model;

public class ModelModelo {

    protected ModelMarca  Marca;
    private   String descricao;

    public ModelMarca getMarca() {
        return Marca;
    }

    public void setMarca(ModelMarca marca) {
        this.Marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Modelo [marca=");
        builder.append(Marca);
        builder.append(", modelo=");
        builder.append(descricao);
        builder.append("]");
        return builder.toString();
    }
}
