package Principal.Model;

import Principal.Persistencia.PersistenciaVaga;
import java.util.ArrayList;

public class ModelVaga {

    public int     numero;
    public boolean livre;
    public boolean permissao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isPermissao() {
        return permissao;
    }

    public void setPermissao(boolean permissao) {
        this.permissao = permissao;
    } 

    public boolean isLivre() {
        return livre;
    }

    public void setLivre(boolean livre) {
        this.livre = livre;
    }
    
    public String getListaLivre(){
        if(this.livre == false){
            return "ocupada";
        }else{
            return "livre";
        }
    }
    
    public String getListaPermissao(){
        if(this.permissao == false){
            return ", porém não permite ser utilizada!";
        }else{
            return " e permite ser utilizada!";
        }
    }
    
    public static ArrayList<ModelVaga> busca(){
          return PersistenciaVaga.importa();
    }
    
    public void salva(ModelVaga oVaga) {        
        ArrayList<ModelVaga> aVaga = this.busca();
        aVaga.add(oVaga);
        PersistenciaVaga.exporta(aVaga); 
    }
    
    public ModelVaga alteraVaga(){
        ArrayList<ModelVaga> aVaga = this.busca();
        
        if(this.livre){
            this.livre = false;
        }
        else {
            this.livre = true;
        }
         
        for(ModelVaga vaga: aVaga){
            if(this.getNumero() == vaga.numero){
                vaga.livre = this.livre;
                break;
            }
        }
        PersistenciaVaga.exporta(aVaga); 
        return this;
    }
    
    public static ModelVaga getFirstVagaLivre(){
        ModelVaga oVaga = new ModelVaga();
        for(ModelVaga vaga: busca()){
            if(vaga.permissao == true && vaga.livre == true){
                oVaga = vaga;
                break;
            }
        }
        return oVaga;
    }

    @Override
    public String toString() {
        return "Vaga " + numero + " está " + this.getListaLivre() + this.getListaPermissao();
    }   

}
