package Principal.Model;

import Principal.Persistencia.PersistenciaValor;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ModelValor {

    private double valor;
    private Date data;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public static ArrayList<ModelValor> busca(){
        return PersistenciaValor.importa();
    }
    
    public static ModelValor buscaUltimoValor(){
        return busca().get(busca().size() - 1);
    }
    
    public void salva(ModelValor oValor) {        
        ArrayList<ModelValor> aValor = this.busca();
        aValor.add(oValor);
        PersistenciaValor.exporta(aValor); 
    }
 
    @Override
    public String toString() {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        return "Data: " + formatDate.format(data) + " Valor: R$ " + valor;
    }  

}
