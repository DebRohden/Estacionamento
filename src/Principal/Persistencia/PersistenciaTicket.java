package Principal.Persistencia;

import Principal.Model.ModelTicket;
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

    public static void exporta(ArrayList<ModelTicket> aTicket) {
        try {
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            FileWriter writer = new FileWriter("gson/arquivos/ticket.json");
            writer.write(gson.toJson(aTicket));
            writer.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível salvar os Ticket!");
        }
    }

    public static ArrayList<ModelTicket> importa() {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("gson/arquivos/ticket.json"));
            Type listType = new TypeToken<ArrayList<ModelTicket>>() {
            }.getType();
            return new Gson().fromJson(bufferedReader, listType);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível carregar os Ticket's");
            return new ArrayList<ModelTicket>();
        }
    }
    
    public void deleteTicket(ModelTicket oTicket){
        ArrayList<ModelTicket> aTicket = importa();
        int posicao = 0;
        
        for(ModelTicket ticket: aTicket){
            if(ticket.getVaga().getNumero() == oTicket.getVaga().getNumero()){
                break;
            }
            posicao++;
        }
        aTicket.remove(posicao);
        exporta(aTicket);
    }
}
