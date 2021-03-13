package Principal.Persistencia;

import Principal.Model.ModelCliente;
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

public class PersistenciaCliente {
    
        /**
         * @param Array Cliente
         */
    	public static void exporta(ArrayList<ModelCliente> aCliente) {
                try {
                GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
                    FileWriter writer = new FileWriter("gson/arquivos/cliente.json");
                    writer.write(gson.toJson(aCliente));
		writer.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Não foi possível salvar o Cliente!");
                }

	}
        
        /**
         * @return Array Cliente
         */
	public static ArrayList<ModelCliente> importa(){ 																											// CLIENT
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("gson/arquivos/cliente.json"));
			Type listType = new TypeToken<ArrayList<ModelCliente>>() {
			}.getType();
			return new Gson().fromJson(bufferedReader, listType);
		} catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(null, "Não foi possível carregar os Clientes!");
                    return new ArrayList<ModelCliente>();
		}
	}
}
