package Principal.Persistencia;

import Principal.Model.Marca;
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

public class PersistenciaMarca {
    
    	public void exportaMarca(ArrayList<Marca> Marca) throws IOException {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("gson/marca.json");
		writer.write(gson.toJson(Marca));
		writer.close();
	}

	public ArrayList<Marca> importaMarca(ArrayList<Marca> Marca) throws FileNotFoundException {
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("gson/marca.json"));
			Type listType = new TypeToken<ArrayList<Marca>>() {
			}.getType();
			return new Gson().fromJson(bufferedReader, listType);
		} catch (FileNotFoundException e) {
                        JOptionPane.showMessageDialog(null, "Não foi possível carregar as Marcas!");
			return null;
		}
	}
}
