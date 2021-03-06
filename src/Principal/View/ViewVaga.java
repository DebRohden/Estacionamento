package Principal.View;

import Principal.Controller.VagaController;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JTextArea;

/**
 *
 * @author Débora
 */
public class ViewVaga extends javax.swing.JFrame {

        VagaController Controller = new VagaController();
	boolean vagaHabilitada = false;

	ExportaImportaArquivosJson json = new ExportaImportaArquivosJson();
	ArrayList<vagas> vaga = new ArrayList<vagas>();

	public ViewVaga() throws IOException {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CaixaQuantidadeVaga = new javax.swing.JTextField();
        habilitarVaga = new javax.swing.JToggleButton();
        concluirBotao = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        CaixaNumeroVaga = new javax.swing.JTextField();
        AdicionarVagas = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        HistoricoVagas = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADICIONAR NOVA VAGA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Quantidade de vagas");

        habilitarVaga.setText("HABILITAR/DESABILITAR");
        habilitarVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habilitarVagaActionPerformed(evt);
            }
        });

        concluirBotao.setText("CONCLUIR");
        concluirBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concluirBotaoActionPerformed(evt);
            }
        });

        jLabel3.setText("Vaga ");

        AdicionarVagas.setText("HABILITAR VAGAS");
        AdicionarVagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarVagasActionPerformed(evt);
            }
        });

        HistoricoVagas.setEditable(false);
        HistoricoVagas.setColumns(20);
        HistoricoVagas.setRows(5);
        jScrollPane1.setViewportView(HistoricoVagas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CaixaNumeroVaga, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CaixaQuantidadeVaga, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(habilitarVaga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AdicionarVagas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(concluirBotao)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CaixaNumeroVaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(habilitarVaga))
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CaixaQuantidadeVaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdicionarVagas))
                        .addGap(27, 27, 27)
                        .addComponent(concluirBotao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
	
	private JTextArea mostraVagas() throws IOException {
            Controller.mostraVaga(this);
		vaga = json.importaVagas(vaga);
		for (vagas vagas : vaga) {
			if (vagas.isPermicao()) {
				HistoricoVagas.setText(
						HistoricoVagas.getText() + vagas.getVaga() + " / " + vagas.getLivre() + " / " + "Permitido\n");
			} else {
				HistoricoVagas.setText(
						HistoricoVagas.getText() + vagas.getVaga() + " / " + vagas.getLivre() + " / " + "Reservada\n");
			}
		}
		return HistoricoVagas;
	}
	
	private void AdicionarVagasActionPerformed(java.awt.event.ActionEvent evt) throws IOException {// GEN-FIRST:event_AdicionarVagasActionPerformed

		vaga = json.importaVagas(vaga);

		for (int k = 1; k <= Integer.parseInt(CaixaQuantidadeVaga.getText()); k++) {

			vagas vagas = new vagas();
			vagas.setLivre("livre");
			vagas.setPermicao(true);
			vagas.setVaga(vaga.size() + 1);
			vaga.add(vagas);
		}

		for (vagas vagas : vaga) {
			if (vagas.isPermicao()) {
				HistoricoVagas.setText(
						HistoricoVagas.getText() + vagas.getVaga() + " / " + vagas.getLivre() + " / " + "Permitido\n");
			} else {
				HistoricoVagas.setText(
						HistoricoVagas.getText() + vagas.getVaga() + " / " + vagas.getLivre() + " / " + "Reservada\n");
			}
		}

		json.exportaVagas(vaga);

	}

	private void concluirBotaoActionPerformed(java.awt.event.ActionEvent evt) throws IOException {// GEN-FIRST:event_concluirBotaoActionPerformed
	
		menuPrincipal menu = new menuPrincipal();
		menu.setVisible(true);
		dispose();

	}

	private void habilitarVagaActionPerformed(java.awt.event.ActionEvent evt) throws IOException {// GEN-FIRST:event_habilitarVagaActionPerformed

		vaga = json.importaVagas(vaga);
		for (vagas vagas : vaga) {
			if (vagas.getVaga() == Integer.parseInt(CaixaNumeroVaga.getText())) {
				if (vagas.isPermicao()) {
					vagas.setPermicao(false);
				} else {
					vagas.setPermicao(true);
				}

			}
		}

		json.exportaVagas(vaga);

		HistoricoVagas.setText("");
		
		for (vagas vagas : vaga) {
			if (vagas.isPermicao()) {
				HistoricoVagas.setText(
						HistoricoVagas.getText() + vagas.getVaga() + " / " + vagas.getLivre() + " / " + "Permitido\n");
			} else {
				HistoricoVagas.setText(
						HistoricoVagas.getText() + vagas.getVaga() + " / " + vagas.getLivre() + " / " + "Reservada\n");
			}
		}

	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ViewVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ViewVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ViewVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ViewVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new ViewVaga().setVisible(true);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton AdicionarVagas;
    private javax.swing.JTextField CaixaNumeroVaga;
    private javax.swing.JTextField CaixaQuantidadeVaga;
    private javax.swing.JTextArea HistoricoVagas;
    private javax.swing.JButton concluirBotao;
    private javax.swing.JToggleButton habilitarVaga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
