package Principal.Model;

public class Veiculo {

	private   String  cor;
        private   String  placa;
	protected Modelo  Modelo;
	protected Cliente Proprietario;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Modelo getModelo() {
		return Modelo;
	}

	public void setModelo(Modelo modelo) {
		this.Modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Cliente getProprietario() {
		return Proprietario;
	}

	public void setProprietario(Cliente proprietario) {
		this.Proprietario = proprietario;
	}

	@Override
	public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("Veiculo [cor=");
            builder.append(cor);
            builder.append(", modelo=");
            builder.append(Modelo);
            builder.append(", placa=");
            builder.append(placa);
            builder.append(", proprietario=");
            builder.append(Proprietario);
            builder.append("]");
            return builder.toString();
	}

}
