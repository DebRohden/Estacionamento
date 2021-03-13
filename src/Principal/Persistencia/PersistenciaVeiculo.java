package Principal.Persistencia;

import Principal.Model.ModelVeiculo;
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

public class PersistenciaVeiculo {
    
    	public static void exporta(ArrayList<ModelVeiculo> aVeiculo) { 
                try {
                   GsonBuilder builder = new GsonBuilder();
                    Gson gson = builder.create();
                    FileWriter writer = new FileWriter("gson/arquivos/veiculo.json");
                    writer.write(gson.toJson(aVeiculo));
                    writer.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Não foi possível salvar o Veículo!");
                }

	}
        
        	public static ArrayList<ModelVeiculo> importa() { 
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("gson/arquivos/veiculo.json"));
			Type listType = new TypeToken<ArrayList<ModelVeiculo>>() {
			}.getType();
			return new Gson().fromJson(bufferedReader, listType);
		} catch (FileNotFoundException e) {
                        JOptionPane.showMessageDialog(null, "Não foi possível carregar os Veículos!");
			return null;
		}
	}
    
}
