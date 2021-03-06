package Principal.View;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import Principal.Persistencia.ExportaImportaArquivosJson;
import Principal.Model.model_cliente;
import Principal.Model.Marca;
import Principal.Model.Modelo;
import Principal.Model.Veiculo;
import estacionamento.cadastros.MarcaCadastradas;


/**
 *
 * @author Débora
 */
public class CadVeiculo extends javax.swing.JFrame {

    menuPrincipal menu = new menuPrincipal();
    ArrayList<model_cliente> cliente = new ArrayList<model_cliente>();
    ArrayList<Veiculo> veiculo = new ArrayList<Veiculo>();
    ArrayList<MarcaCadastradas> marcasSistema = new ArrayList<MarcaCadastradas>();

    public CadVeiculo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        TextPlaca = new javax.swing.JLabel();
        caixaPlaca = new javax.swing.JTextField();
        TextMarca = new javax.swing.JLabel();
        TextCor = new javax.swing.JLabel();
        caixaMarca = new javax.swing.JTextField();
        caixaCor = new javax.swing.JTextField();
        textModelo = new javax.swing.JLabel();
        caixaModelo = new javax.swing.JTextField();
        botaoVoltar = new javax.swing.JToggleButton();
        botaoCadastrarVeiculo = new javax.swing.JToggleButton();
        caixaEmail = new javax.swing.JTextField();
        TextEmail = new javax.swing.JLabel();
        CadastramentoVeiculo = new javax.swing.JLabel();
        TextProprietario = new javax.swing.JLabel();
        caixaNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextPlaca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextPlaca.setText("Placa");

        caixaPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaPlacaActionPerformed(evt);
            }
        });

        TextMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextMarca.setText("Marca");

        TextCor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextCor.setText("Cor");

        caixaMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaMarcaActionPerformed(evt);
            }
        });

        caixaCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaCorActionPerformed(evt);
            }
        });

        textModelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textModelo.setText("Modelo");

        caixaModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaModeloActionPerformed(evt);
            }
        });

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoCadastrarVeiculo.setText("CADASTRAR");
        botaoCadastrarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarVeiculoActionPerformed(evt);
            }
        });

        caixaEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaEmailActionPerformed(evt);
            }
        });

        TextEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextEmail.setText("Email proprietario");

        CadastramentoVeiculo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CadastramentoVeiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CadastramentoVeiculo.setText("CADASTRAMENTO VEICULO");

        TextProprietario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextProprietario.setText("Nome proprietario");

        caixaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(CadastramentoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextCor)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textModelo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(caixaModelo)
                                    .addComponent(caixaMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(caixaPlaca)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TextMarca)
                                            .addComponent(TextPlaca))
                                        .addGap(0, 161, Short.MAX_VALUE))
                                    .addComponent(caixaCor))
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(caixaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caixaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextEmail)
                            .addComponent(TextProprietario)
                            .addComponent(botaoCadastrarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(CadastramentoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextPlaca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextProprietario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caixaPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caixaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caixaMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(textModelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caixaModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextCor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caixaCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar)
                    .addComponent(botaoCadastrarVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        menu.setVisible(true);
        dispose();
    }

    private void caixaEmailActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void botaoCadastrarVeiculoActionPerformed(java.awt.event.ActionEvent evt) throws IOException {

        Veiculo novoVeiculo = new Veiculo();
        Marca marca = new Marca();
        Modelo modelo = new Modelo();
        ExportaImportaArquivosJson json = new ExportaImportaArquivosJson();

        cliente = json.importaJsonCliente(cliente);
        veiculo = json.importaJsonVeiculo(veiculo);

        boolean achou = false;
        boolean preencheu = false;
        String modeloVeiculo = caixaModelo.getText();
        String marcaVeiculo = caixaMarca.getText();
        String corVeiculo = caixaCor.getText();
        String placaVeiculo = caixaPlaca.getText();
        String nomeProprietario = caixaNome.getText();
        String emailProprietario = caixaEmail.getText();

        if ((modeloVeiculo.equals("") || (marcaVeiculo.equals("")) || (corVeiculo.equals(""))
                || (placaVeiculo.equals("")) || (nomeProprietario.equals("")) || (emailProprietario.equals("")))) {
            JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos");
            preencheu = true;
        } 
        else {
            if ((verificaPlacaModelo(placaVeiculo)) && (verificaPlacaIgual(placaVeiculo))) {
                for (model_cliente proprietario : cliente) {
                    if ((proprietario.getNome().equals(nomeProprietario)) && (proprietario.getEmail().equals(emailProprietario))) {
                        marca.setMarca(marcaVeiculo);
                        modelo.setMarca(marca);
                        modelo.setModelo(modeloVeiculo);
                        novoVeiculo.setModelo(modelo);
                        novoVeiculo.setPlaca(placaVeiculo);
                        novoVeiculo.setCor(corVeiculo);
                        novoVeiculo.setProprietario(proprietario);
                        veiculo.add(novoVeiculo);
                        adicionaMarca(marca);
                        json.exportaVeiculo(veiculo);
                        achou = true;
                        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");

                        menu.setVisible(true);
                        dispose();
                    }
                }
            }
        }

        if ((!achou) && (!preencheu)) {
            JOptionPane.showMessageDialog(null, "Cliente nao encontrado");
            CadCliente cad = new CadCliente();
            cad.setVisible(true);
            dispose();
        }
    }

    public boolean verificaPlacaModelo(String placa) {

        String[] placaVeiculo = placa.split("");

        if ((placaVeiculo.length == 7) && (placaVeiculo[0].matches("[A-Z]")) && (placaVeiculo[1].matches("[A-Z]"))
                && (placaVeiculo[2].matches("[A-Z]")) && (placaVeiculo[3].matches("[0-9]")) && (placaVeiculo[4].matches("[0-9]"))
                && (placaVeiculo[5].matches("[0-9]")) && (placaVeiculo[6].matches("[0-9]"))) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Placa Inv�lida!");
            return false;
        }
    }

    public boolean verificaPlacaIgual(String placa) {

        for (Veiculo v : veiculo) {
            if (placa.equals(v.getPlaca())) {
                JOptionPane.showMessageDialog(null, "Placa Repetida!");
                return false;
            }
        }
        return true;
    }

    public boolean adicionaMarca(Marca marca) throws IOException {

        MarcaCadastradas marcasAdd = new MarcaCadastradas();
        boolean achou = true;
        ExportaImportaArquivosJson json = new ExportaImportaArquivosJson();

        marcasSistema = json.importaMarcas(marcasSistema);

        if (marcasSistema.size() == 0) {
            marcasAdd.setMarca(marca);
            marcasAdd.setTotalMarca(1);
            marcasSistema.add(marcasAdd);
        } else {
            for (MarcaCadastradas MarcaAComparar : marcasSistema) {
                if (marca.getMarca().equals(MarcaAComparar.getMarca().getMarca())) {
                    MarcaAComparar.setTotalMarca(MarcaAComparar.getTotalMarca() + 1);
                    achou = false;
                    break;
                }
            }
            if (achou) {
                marcasAdd.setMarca(marca);
                marcasAdd.setTotalMarca(1);
                marcasSistema.add(marcasAdd);
            }
        }
        json.exportaMarca(marcasSistema);
        return true;
    }

    private void caixaMarcaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_caixaMarcaActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_caixaMarcaActionPerformed

    private void caixaPlacaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_caixaPlacaActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_caixaPlacaActionPerformed

    private void caixaCorActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_caixaCorActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_caixaCorActionPerformed

    private void caixaModeloActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_caixaModeloActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_caixaModeloActionPerformed

    private void caixaNomeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CadastramentoVeiculo;
    private javax.swing.JLabel TextCor;
    private javax.swing.JLabel TextEmail;
    private javax.swing.JLabel TextMarca;
    private javax.swing.JLabel TextPlaca;
    private javax.swing.JLabel TextProprietario;
    private javax.swing.JToggleButton botaoCadastrarVeiculo;
    private javax.swing.JToggleButton botaoVoltar;
    private javax.swing.JTextField caixaCor;
    private javax.swing.JTextField caixaEmail;
    private javax.swing.JTextField caixaMarca;
    private javax.swing.JTextField caixaModelo;
    private javax.swing.JTextField caixaNome;
    private javax.swing.JTextField caixaPlaca;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel textModelo;
    // End of variables declaration//GEN-END:variables
}
