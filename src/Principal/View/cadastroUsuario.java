package Principal.View;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import Principal.Persistencia.ExportaImportaArquivosJson;
import classesUteis.criptografaSenha;
import Principal.Model.Funcionario;
import sistema.sistemaNovo;

public class cadastroUsuario extends javax.swing.JFrame {

	ArrayList<Funcionario> funcionarioCad = new ArrayList<Funcionario>();

	public cadastroUsuario() {
		initComponents();
	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		nomeCad = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		emailCad = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		telefoneCad = new javax.swing.JTextField();
		senhaCad = new javax.swing.JPasswordField();
		jLabel5 = new javax.swing.JLabel();
		cadastrarBotao = new javax.swing.JButton();
		botaoVoltar = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("CADASTRO");

		nomeCad.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				nomeCadActionPerformed(evt);
			}
		});

		jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel2.setText("Nome");

		jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel3.setText("E-mail");

		emailCad.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				emailCadActionPerformed(evt);
			}
		});

		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel4.setText("Telefone");

		telefoneCad.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				telefoneCadActionPerformed(evt);
			}
		});

		senhaCad.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				senhaCadActionPerformed(evt);
			}
		});

		jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel5.setText("Senha");

		cadastrarBotao.setText("CADASTRAR");
		cadastrarBotao.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					cadastrarBotaoActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoSuchAlgorithmException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		botaoVoltar.setText("VOLTAR");
		botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botaoVoltarActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(34, 34, 34)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel5).addComponent(jLabel4).addComponent(jLabel2)
												.addComponent(jLabel3))
										.addContainerGap(294, Short.MAX_VALUE))
								.addGroup(layout.createSequentialGroup().addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addGroup(layout.createSequentialGroup()
												.addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 126,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(cadastrarBotao, javax.swing.GroupLayout.PREFERRED_SIZE,
														126, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(14, 14, 14))
										.addComponent(senhaCad, javax.swing.GroupLayout.DEFAULT_SIZE, 323,
												Short.MAX_VALUE)
										.addComponent(telefoneCad).addComponent(emailCad).addComponent(nomeCad))
										.addGap(0, 0, Short.MAX_VALUE))))
				.addGroup(layout
						.createSequentialGroup().addGap(127, 127, 127).addComponent(jLabel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(23, 23, 23)
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(jLabel2).addGap(4, 4, 4)
						.addComponent(nomeCad, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(15, 15, 15).addComponent(jLabel3)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(emailCad, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(jLabel4).addGap(4, 4, 4)
						.addComponent(telefoneCad, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel5)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(senhaCad, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(botaoVoltar).addComponent(cadastrarBotao))
						.addGap(46, 46, 46)));

		pack();
	}// </editor-fold>                        

	private void nomeCadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nomeCadActionPerformed

	}// GEN-LAST:event_nomeCadActionPerformed

	private void emailCadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_emailCadActionPerformed

	}

	private void cadastrarBotaoActionPerformed(java.awt.event.ActionEvent evt)throws IOException, NoSuchAlgorithmException {// GEN-FIRST:event_cadastrarBotaoActionPerformed

		ViewLogin login                     = new ViewLogin();
		criptografaSenha cript          = new criptografaSenha();
		Funcionario cadFuncionario      = new Funcionario();
		ExportaImportaArquivosJson json = new ExportaImportaArquivosJson();
		funcionarioCad                  = json.importaJson(funcionarioCad);

		String senha = cript.stringHexa(cript.criptografa(String.valueOf(senhaCad.getPassword())));
		String email = emailCad.getText();
		String nome = nomeCad.getText();
		String telefone = telefoneCad.getText();

		if ((senha.equals("")) || (nome.equals("") || (email.equals("")) || (telefone.equals("")))) {
			JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos");
		} 
		else {
			if(verificaEmail(email)) {
				cadFuncionario.setNome(nome);
				cadFuncionario.setEmail(email);
				cadFuncionario.setTelefone(telefone);
				cadFuncionario.setSenha(senha);
				funcionarioCad.add(cadFuncionario);
				exportaFuncionario();
				JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");

				login.setVisible(true);
				dispose();
			}
		}

	}
	public boolean verificaEmail(String email) {
		
		boolean isEmailIdValid = false;
		
		if (email != null && email.length() > 0) {
			String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
			Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(email);
			if (matcher.matches()) {
				isEmailIdValid = true;
			}
		}
		return isEmailIdValid;
	}

	public void exportaFuncionario() throws IOException {

		ExportaImportaArquivosJson exporta = new ExportaImportaArquivosJson();

		exporta.ExportaJson(funcionarioCad);
	}

	public void importaFuncionario() throws FileNotFoundException {

		ExportaImportaArquivosJson importa = new ExportaImportaArquivosJson();
		funcionarioCad = importa.importaJson(funcionarioCad);
	}

	private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoVoltarActionPerformed
		sistemaNovo sistema = new sistemaNovo();
		sistema.setVisible(true);
		dispose(); 
	}// GEN-LAST:event_botaoVoltarActionPerformed

	private void senhaCadActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void telefoneCadActionPerformed(java.awt.event.ActionEvent evt) {

	}

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
			java.util.logging.Logger.getLogger(cadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(cadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(cadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(cadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new cadastroUsuario().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton botaoVoltar;
	private javax.swing.JButton cadastrarBotao;
	private javax.swing.JTextField emailCad;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JTextField nomeCad;
	private javax.swing.JPasswordField senhaCad;
	private javax.swing.JTextField telefoneCad;
	// End of variables declaration//GEN-END:variables
}
