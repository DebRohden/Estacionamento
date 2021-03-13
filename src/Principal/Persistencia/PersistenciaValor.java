package Principal.Persistencia;

import Principal.Model.ModelValor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PersistenciaValor {
    
    public static void exporta(ArrayList<ModelValor> aValor){

        try {
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            FileWriter writer = new FileWriter("gson/arquivos/valor.json");
            writer.write(gson.toJson(aValor));
            writer.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível salvar o Valor!");
        }
    }

    public static ArrayList<ModelValor> importa() {

	try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("gson/arquivos/valor.json"));
            Type listType = new TypeToken<ArrayList<ModelValor>>() {
            }.getType();
            return new Gson().fromJson(bufferedReader, listType);
	} catch (FileNotFoundException e) {
            return new ArrayList<ModelValor>();
	}
        
    }
}
