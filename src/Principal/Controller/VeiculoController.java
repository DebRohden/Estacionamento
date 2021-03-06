package Principal.Controller;

import javax.swing.JOptionPane;

public class VeiculoController {
    
        public boolean verificaPlaca(String placa) {

        String[] placaVeiculo = placa.split("");

        if ((placaVeiculo.length == 7) && (placaVeiculo[0].matches("[A-Z]")) && (placaVeiculo[1].matches("[A-Z]"))
                && (placaVeiculo[2].matches("[A-Z]")) && (placaVeiculo[4].matches("[0-9]"))
                && (placaVeiculo[5].matches("[0-9]")) && (placaVeiculo[6].matches("[0-9]"))) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Placa Inválida!");
            return false;
        }
    }
}
