package Principal.Persistencia;

import Principal.Model.Veiculo;
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
    
    	public static void exportaVeiculo(ArrayList<Veiculo> Veiculo) throws IOException { 

		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("gson/arquivos/veiculo.json");
		writer.write(gson.toJson(Veiculo));
		writer.close();
	}
        
        	public static ArrayList<Veiculo> importaVeiculo() throws FileNotFoundException { 
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("gson/arquivos/veiculo.json"));
			Type listType = new TypeToken<ArrayList<Veiculo>>() {
			}.getType();
			return new Gson().fromJson(bufferedReader, listType);
		} catch (FileNotFoundException e) {
                        JOptionPane.showMessageDialog(null, "Não foi possível carregar os Veículos!");
			return null;
		}
	}
    
}
