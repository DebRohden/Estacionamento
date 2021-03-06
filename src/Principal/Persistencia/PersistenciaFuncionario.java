package Principal.Persistencia;

import Principal.Model.Funcionario;
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

public class PersistenciaFuncionario {
    
    
    	public void exportaFuncionario(ArrayList<Funcionario> Funcionario) throws IOException {

		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("gson/arquivos/funcionario.json");
		writer.write(gson.toJson(Funcionario));
		writer.close();
	}

	public ArrayList<Funcionario> importaFuncionario(ArrayList<Funcionario> funcionario) throws FileNotFoundException {

		try {

			BufferedReader bufferedReader = new BufferedReader(new FileReader("gson/arquivos/funcionario.json"));
			Type listType = new TypeToken<ArrayList<Funcionario>>() {
			}.getType();
			return new Gson().fromJson(bufferedReader, listType);
		} catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(null, "Não foi possível carregar os Funcionários!");
			return null;
		}
	}
}
