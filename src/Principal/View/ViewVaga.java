package Principal.View;

import Principal.Controller.ControllerPrincipal;
import Principal.Controller.ControllerVaga;
import javax.swing.JFrame;

public class ViewVaga extends JFrame {

    protected ControllerVaga      ControllerVaga;
    protected ControllerPrincipal ControllerPrincipal;
    protected Principal           Principal;

    public ViewVaga(Principal Principal){
        initComponents();
        this.Principal = Principal;
        ControllerVaga = new ControllerVaga(this.Principal, this);
    }

    public ViewVaga(){
        initComponents();
    }

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelVaga = new javax.swing.JLabel();
        labelNumeroVaga = new javax.swing.JLabel();
        campoQuantidade = new javax.swing.JTextField();
        botaoAlterar = new javax.swing.JButton();
        botaoConcluir = new javax.swing.JButton();
        labelQuantidade = new javax.swing.JLabel();
        campoNumeroVaga = new javax.swing.JTextField();
        botaoAdicionar = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        campoHistorico = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VAGA");
        setResizable(false);

        labelVaga.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelVaga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVaga.setText("ADICIONAR NOVA VAGA");

        labelNumeroVaga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNumeroVaga.setText("Quantidade de vagas");

        botaoAlterar.setText("Habilitar/Desabilitar");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });

        botaoConcluir.setText("CONCLUIR");
        botaoConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConcluirActionPerformed(evt);
            }
        });

        labelQuantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelQuantidade.setText("N�mero Vaga");

        botaoAdicionar.setText("Cadastrar Vagas");
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });

        campoHistorico.setEditable(false);
        campoHistorico.setColumns(20);
        campoHistorico.setRows(5);
        scrollPane.setViewportView(campoHistorico);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelVaga)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelQuantidade)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(campoNumeroVaga, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelNumeroVaga, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botaoAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botaoAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(botaoConcluir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(labelVaga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelQuantidade)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoNumeroVaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoAlterar))
                        .addGap(19, 19, 19)
                        .addComponent(labelNumeroVaga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoAdicionar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoConcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
	
    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoAdicionarActionPerformed	
        ControllerVaga = new ControllerVaga(this.Principal, this);
        ControllerVaga.cadastroVaga();           
    }

    private void botaoConcluirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoConcluirActionPerformed
        this.dispose();
    }

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoAlterarActionPerformed
        ControllerVaga = new ControllerVaga(this.Principal, this);
        ControllerVaga.alteraVaga();
    }

    @Override
    public void dispose () {
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
                java.util.logging.Logger.getLogger(ViewVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new ViewVaga().setVisible(true);
                }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botaoAdicionar;
    public javax.swing.JTextField campoNumeroVaga;
    public javax.swing.JTextField campoQuantidade;
    public javax.swing.JTextArea campoHistorico;
    public javax.swing.JButton botaoConcluir;
    public javax.swing.JButton botaoAlterar;
    public javax.swing.JLabel labelVaga;
    public javax.swing.JLabel labelNumeroVaga;
    public javax.swing.JLabel labelQuantidade;
    public javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}
