package Principal.Persistencia;

import Principal.Model.ModelVaga;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PersistenciaVaga {
    
    public static void exporta(ArrayList<ModelVaga> Vaga) {
        try {
            GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("gson/arquivos/vaga.json");
		writer.write(gson.toJson(Vaga));
		writer.close();
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null, "Não foi possível salvar a Vaga!");
        }
    }

    public static ArrayList<ModelVaga> importa() {
        try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader("gson/arquivos/vaga.json"));
                Type listType = new TypeToken<ArrayList<ModelVaga>>() {
                }.getType();
                return new Gson().fromJson(bufferedReader, listType);
        } catch (java.io.FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Não foi possível carregar as Vagas!");
                return null;
        }
    }
}
