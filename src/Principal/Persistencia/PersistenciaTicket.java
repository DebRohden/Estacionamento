package Principal.Persistencia;

import Principal.Model.Ticket;
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

public class PersistenciaTicket {
    
    public void exportaTicket(ArrayList<Ticket> Ticket) throws IOException {

		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("gson/arquivos/ticket.json");
		writer.write(gson.toJson(Ticket));
		writer.close();
	}

	public ArrayList<Ticket> importaTicket(ArrayList<Ticket> Ticket) throws FileNotFoundException {

		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("gson/arquivos/ticket.json"));
			Type listType = new TypeToken<ArrayList<Ticket>>() {
			}.getType();
			return new Gson().fromJson(bufferedReader, listType);
		} catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(null, "Não foi possível carregar os Ticket's");
                    return null;
		}

	}
}
