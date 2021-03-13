package Principal.View;

import Principal.Controller.ControllerPrincipal;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import Principal.Model.ModelMarca;
import Principal.Model.ModelModelo;
import Principal.Model.ModelVeiculo;

import Principal.Controller.ControllerVeiculo;

import javax.swing.JFrame;

public class ViewVeiculo extends JFrame {

    protected ControllerVeiculo   ControllerVeiculo;
    protected ControllerPrincipal ControllerPrincipal;
    protected Principal Principal;
    
    public ViewVeiculo(Principal Principal) {
        initComponents();
        this.Principal = Principal;
    }
    
    public ViewVeiculo(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPlaca = new javax.swing.JLabel();
        campoPlaca = new javax.swing.JTextField();
        labelMarca = new javax.swing.JLabel();
        labelCor = new javax.swing.JLabel();
        campoMarca = new javax.swing.JTextField();
        campoCor = new javax.swing.JTextField();
        labelModelo = new javax.swing.JLabel();
        campoModelo = new javax.swing.JTextField();
        botaoVoltar = new javax.swing.JButton();
        botaoCadastro = new javax.swing.JButton();
        campoEmail = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        labelCadastroVeiculo = new javax.swing.JLabel();
        labelProprietario = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelPlaca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPlaca.setText("Placa");

        labelMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelMarca.setText("Marca");

        labelCor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCor.setText("Cor");

        labelModelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelModelo.setText("Modelo");

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoCadastro.setText("CADASTRAR");
        botaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroActionPerformed(evt);
            }
        });

        labelEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelEmail.setText("Email proprietario");

        labelCadastroVeiculo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCadastroVeiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCadastroVeiculo.setText("CADASTRO VEICULO");

        labelProprietario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelProprietario.setText("Nome proprietario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(labelCadastroVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCor)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelModelo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoModelo)
                                    .addComponent(campoMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(campoPlaca)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelMarca)
                                            .addComponent(labelPlaca))
                                        .addGap(0, 161, Short.MAX_VALUE))
                                    .addComponent(campoCor))
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEmail)
                            .addComponent(labelProprietario)
                            .addComponent(botaoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelCadastroVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPlaca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelProprietario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(labelModelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelCor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar)
                    .addComponent(botaoCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroActionPerformed
        ControllerVeiculo = new ControllerVeiculo(this);
        ControllerVeiculo.cadastroVeiculo();
    }//GEN-LAST:event_botaoCadastroActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }
    
    @Override
    public void dispose(){
        ControllerPrincipal = new ControllerPrincipal(this.Principal);
        super.dispose();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botaoCadastro;
    public javax.swing.JButton botaoVoltar;
    public javax.swing.JTextField campoCor;
    public javax.swing.JTextField campoEmail;
    public javax.swing.JTextField campoMarca;
    public javax.swing.JTextField campoModelo;
    public javax.swing.JTextField campoNome;
    public javax.swing.JTextField campoPlaca;
    public javax.swing.JLabel labelCadastroVeiculo;
    public javax.swing.JLabel labelCor;
    public javax.swing.JLabel labelEmail;
    public javax.swing.JLabel labelMarca;
    public javax.swing.JLabel labelModelo;
    public javax.swing.JLabel labelPlaca;
    public javax.swing.JLabel labelProprietario;
    // End of variables declaration//GEN-END:variables
}
