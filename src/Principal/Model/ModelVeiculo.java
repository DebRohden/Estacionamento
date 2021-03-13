package Principal.Model;

import Principal.Persistencia.PersistenciaVeiculo;
import java.util.ArrayList;

public class ModelVeiculo {

    private   String  cor;
    private   String  placa;
    protected ModelModelo  Modelo;
    protected ModelCliente Proprietario;

    public String getCor() {
            return cor;
    }

    public void setCor(String cor) {
            this.cor = cor;
    }

    public ModelModelo getModelo() {
            return Modelo;
    }

    public void setModelo(ModelModelo modelo) {
            this.Modelo = modelo;
    }

    public String getPlaca() {
            return placa;
    }

    public void setPlaca(String placa) {
            this.placa = placa;
    }

    public ModelCliente getProprietario() {
            return Proprietario;
    }

    public void setProprietario(ModelCliente proprietario) {
            this.Proprietario = proprietario;
    }

    public static ArrayList<ModelVeiculo> busca(){
        return PersistenciaVeiculo.importa();
    }

    public static ModelVeiculo buscaVeiculoFromPlaca(String sPlaca){
        for(ModelVeiculo Veiculo : busca()){
            if(Veiculo.getPlaca().equals(sPlaca)){
                return Veiculo;
            }
        }
        return new ModelVeiculo();
    }

    public void salva(ModelVeiculo oVeiculo){
        ArrayList<ModelVeiculo> aVeiculo = new ArrayList<ModelVeiculo>();
        aVeiculo.add(oVeiculo);
        PersistenciaVeiculo.exporta(aVeiculo);
    }

}
