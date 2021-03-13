package Principal.Controller;

import Principal.Model.ModelVaga;
import Principal.Persistencia.PersistenciaVaga;
import Principal.View.Principal;
import Principal.View.ViewVaga;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControllerVaga {

    protected Principal Principal;
    protected ViewVaga  Tela;

    public ControllerVaga() {}
    
    public ControllerVaga(Object ViewPrincipal, Object View) {
        Principal = (Principal) ViewPrincipal;
        Tela      = (ViewVaga) View;
        this.mostraVaga();
    }   

    private void mostraVaga() {
        this.Tela.campoHistorico.setText("");
        for (ModelVaga Vaga : ModelVaga.busca()) {
            this.Tela.campoHistorico.setText(this.Tela.campoHistorico.getText() + Vaga.toString() + "\n");
        }
    }

    public void cadastroVaga() {
        if (this.Tela.campoQuantidade.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informa a quantidade a ser cadastrada!");
        } else {
            for (int i = 1; i <= Integer.parseInt(this.Tela.campoQuantidade.getText()); i++) {
                ModelVaga oVaga = new ModelVaga();
                oVaga.setNumero(oVaga.busca().size() + 1);
                oVaga.setLivre(true);
                oVaga.setPermissao(true);
                oVaga.salva(oVaga);
            }
            this.mostraVaga();
            this.alteraPrincipal();
        }
    }

    public boolean verificaVagaLivre() {
        boolean bLivre = false;

        for (ModelVaga Vaga : ModelVaga.busca()) {
            if (Vaga.isLivre() || Vaga.isPermissao()) {
                bLivre = true;
                break;
            }
        }
        return bLivre;
    }

    public void alteraVaga() {
        boolean bExiste = false;  
        ArrayList<ModelVaga> vagas = new ArrayList<ModelVaga>();
        vagas = ModelVaga.busca();
        
        for (ModelVaga Vaga : vagas) {
            if (Vaga.getNumero() == Integer.parseInt(this.Tela.campoNumeroVaga.getText())) {
                bExiste = true;
                if (Vaga.isPermissao()) {
                    Vaga.setPermissao(false); 
                } else {
                    Vaga.setPermissao(true);
                }
                
                break;
            }
        }
        if(bExiste){ 
            PersistenciaVaga persistencia = new PersistenciaVaga();
            persistencia.exporta(vagas);
        }
        
        if (!bExiste) {
            JOptionPane.showMessageDialog(null, "Vaga não encontrada!");
        }
        this.mostraVaga();
        this.alteraPrincipal();
    }

    public int vagasDisponiveis() {
        int cont = 0;
        for (ModelVaga Vaga : PersistenciaVaga.importa()) {
            if (Vaga.isLivre() && Vaga.isPermissao()) {
                cont++;
            }
        }
        return cont;
    }

    public int vagasOcupadas() {
        int cont = 0;
        for (ModelVaga Vaga : ModelVaga.busca()) {
            if (!Vaga.isLivre()) {
                cont++;
            }
        }
        return cont;
    }

    public void alteraPrincipal() {
        this.Principal.labelVagasDisponiveis.setText("Vagas Disponíveis: " + this.vagasDisponiveis());
        this.Principal.labelVagasOcupadas.setText("Vagas Ocupadas: " + this.vagasOcupadas());
    }

}
