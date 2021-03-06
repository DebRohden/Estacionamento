package Principal.Persistencia;

import Principal.Model.Valor;
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

public class PersistenciaValor {
    
    public void exportaValor(ArrayList<Valor> Valor) throws IOException {

		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("gson/valor.json");
		writer.write(gson.toJson(Valor));
		writer.close();
	}

    public ArrayList<Valor> importaValor(ArrayList<Valor> Valor) throws FileNotFoundException {

	try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("gson/valor.json"));
            Type listType = new TypeToken<ArrayList<Valor>>() {
            }.getType();
            return new Gson().fromJson(bufferedReader, listType);
	} catch (FileNotFoundException e) {
            return null;
	}
        
    }
}
