package Principal.View;

import Principal.Controller.ControllerPrincipal;
import Principal.Controller.ControllerTicket;
import Principal.Controller.ControllerValor;
import Principal.Model.ModelFuncionario;
import java.io.IOException;

public class Principal extends javax.swing.JFrame {

    private ControllerPrincipal ControllerPrincipal;
    private ModelFuncionario Funcionario = new ModelFuncionario();
    /**
     * @param Funcionario oFuncionario
     */
    public Principal(ModelFuncionario oFuncionario) {
        initComponents();
        ControllerPrincipal = new ControllerPrincipal(oFuncionario, this);
    }
    
    public void setFuncionario(ModelFuncionario funcionario){
        this.Funcionario = funcionario;
    }
    
    public ModelFuncionario getFuncionario(){
        return this.Funcionario;
    }

    public Principal() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoGeraTicket = new javax.swing.JButton();
        labelFuncionario = new javax.swing.JLabel();
        panelLog = new javax.swing.JScrollPane();
        entradaCarro = new javax.swing.JTextArea();
        labelData = new javax.swing.JLabel();
        labelVagasDisponiveis = new javax.swing.JTextField();
        botaoSair = new javax.swing.JToggleButton();
        labelVagasOcupadas = new javax.swing.JTextField();
        paneMenu = new javax.swing.JTabbedPane();
        panelGuiaCadastros = new javax.swing.JPanel();
        botaoCadVeiculo = new javax.swing.JButton();
        BotaoCadCliente = new javax.swing.JButton();
        botaoCadVagas = new javax.swing.JButton();
        cadValorHora = new javax.swing.JButton();
        panelGuiaHistoricoValores = new javax.swing.JPanel();
        panelHistorico = new javax.swing.JScrollPane();
        campoHistoricoValor = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setResizable(false);

        botaoGeraTicket.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoGeraTicket.setText("Gerar Ticket");
        botaoGeraTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGeraTicketActionPerformed(evt);
            }
        });

        labelFuncionario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelFuncionario.setText("Funcionário");

        entradaCarro.setEditable(false);
        entradaCarro.setBackground(new java.awt.Color(230, 230, 254));
        entradaCarro.setColumns(20);
        entradaCarro.setRows(5);
        panelLog.setViewportView(entradaCarro);

        labelData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        labelVagasDisponiveis.setEditable(false);
        labelVagasDisponiveis.setBackground(new java.awt.Color(102, 255, 51));
        labelVagasDisponiveis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelVagasDisponiveis.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labelVagasDisponiveis.setText("Vagas Disponiveis");

        botaoSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoSair.setForeground(new java.awt.Color(255, 0, 0));
        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        labelVagasOcupadas.setEditable(false);
        labelVagasOcupadas.setBackground(new java.awt.Color(255, 0, 0));
        labelVagasOcupadas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelVagasOcupadas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labelVagasOcupadas.setText("Vagas Ocupadas");

        paneMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botaoCadVeiculo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoCadVeiculo.setText("Cadastrar Veiculo");
        botaoCadVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadVeiculoActionPerformed(evt);
            }
        });

        BotaoCadCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoCadCliente.setText("Cadastrar Cliente");
        BotaoCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadClienteActionPerformed(evt);
            }
        });

        botaoCadVagas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoCadVagas.setText("Cadastrar Vagas");
        botaoCadVagas.setMaximumSize(new java.awt.Dimension(141, 25));
        botaoCadVagas.setMinimumSize(new java.awt.Dimension(141, 25));
        botaoCadVagas.setPreferredSize(new java.awt.Dimension(141, 25));
        botaoCadVagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadVagasActionPerformed(evt);
            }
        });

        cadValorHora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cadValorHora.setText("Cadastrar Valor/Hora");
        cadValorHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadValorHoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGuiaCadastrosLayout = new javax.swing.GroupLayout(panelGuiaCadastros);
        panelGuiaCadastros.setLayout(panelGuiaCadastrosLayout);
        panelGuiaCadastrosLayout.setHorizontalGroup(
            panelGuiaCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuiaCadastrosLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panelGuiaCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadValorHora, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadVagas, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        panelGuiaCadastrosLayout.setVerticalGroup(
            panelGuiaCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuiaCadastrosLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(botaoCadVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(BotaoCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(botaoCadVagas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(cadValorHora, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        paneMenu.addTab("CADASTROS", panelGuiaCadastros);

        campoHistoricoValor.setEditable(false);
        campoHistoricoValor.setColumns(20);
        campoHistoricoValor.setRows(5);
        panelHistorico.setViewportView(campoHistoricoValor);

        javax.swing.GroupLayout panelGuiaHistoricoValoresLayout = new javax.swing.GroupLayout(panelGuiaHistoricoValores);
        panelGuiaHistoricoValores.setLayout(panelGuiaHistoricoValoresLayout);
        panelGuiaHistoricoValoresLayout.setHorizontalGroup(
            panelGuiaHistoricoValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuiaHistoricoValoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelGuiaHistoricoValoresLayout.setVerticalGroup(
            panelGuiaHistoricoValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGuiaHistoricoValoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addContainerGap())
        );

        paneMenu.addTab("HISTORICO VALORES", panelGuiaHistoricoValores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelData, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(430, 430, 430))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botaoGeraTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(panelLog, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paneMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelVagasOcupadas, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelVagasDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 221, Short.MAX_VALUE))
                            .addComponent(labelFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(botaoSair)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSair)
                    .addComponent(labelFuncionario)
                    .addComponent(labelData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(paneMenu)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelVagasDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelVagasOcupadas, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(botaoGeraTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelLog, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoGeraTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGeraTicketActionPerformed
        ControllerTicket ControllerTicket = new ControllerTicket(this);
        ControllerTicket.geraTicket(); // TODO Auto-generated catch block  
    }//GEN-LAST:event_botaoGeraTicketActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoSairActionPerformed

    private void cadValorHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadValorHoraActionPerformed
        ControllerValor ControllerValor = new ControllerValor(this);
        ControllerValor.cadastroValor();
    }//GEN-LAST:event_cadValorHoraActionPerformed

    private void botaoCadVagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadVagasActionPerformed
        ControllerPrincipal.callView();
    }//GEN-LAST:event_botaoCadVagasActionPerformed

    private void BotaoCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadClienteActionPerformed
        ControllerPrincipal.callViewCliente();
    }//GEN-LAST:event_BotaoCadClienteActionPerformed

    private void botaoCadVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadVeiculoActionPerformed
        ControllerPrincipal.callViewVeiculo();
    }//GEN-LAST:event_botaoCadVeiculoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BotaoCadCliente;
    public javax.swing.JButton botaoCadVagas;
    public javax.swing.JButton botaoCadVeiculo;
    public javax.swing.JButton botaoGeraTicket;
    public javax.swing.JToggleButton botaoSair;
    public javax.swing.JButton cadValorHora;
    public javax.swing.JTextArea campoHistoricoValor;
    public javax.swing.JTextArea entradaCarro;
    public javax.swing.JLabel labelData;
    public javax.swing.JLabel labelFuncionario;
    public javax.swing.JTextField labelVagasDisponiveis;
    public javax.swing.JTextField labelVagasOcupadas;
    public javax.swing.JTabbedPane paneMenu;
    public javax.swing.JPanel panelGuiaCadastros;
    public javax.swing.JPanel panelGuiaHistoricoValores;
    public javax.swing.JScrollPane panelHistorico;
    public javax.swing.JScrollPane panelLog;
    // End of variables declaration//GEN-END:variables
}

