package Principal.Persistencia;

import Principal.Model.Vaga;
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
    
    public void exportaVaga(ArrayList<Vaga> vaga) throws IOException {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("gson/vaga.json");
		writer.write(gson.toJson(vaga));
		writer.close();
	}

	public ArrayList<Vaga> importaVaga() throws IOException {
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("gson/vaga.json"));
			Type listType = new TypeToken<ArrayList<Vaga>>() {
			}.getType();
			return new Gson().fromJson(bufferedReader, listType);
		} catch (java.io.FileNotFoundException e) {
                        JOptionPane.showMessageDialog(null, "Não foi possível carregar as Vagas!");
			return null;
		}
	}
}
