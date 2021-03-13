package Principal.View;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import Principal.Model.ModelFuncionario;
import Principal.Persistencia.PersistenciaFuncionario;
import classesUteis.criptografaSenha;

public class ViewFuncionario extends javax.swing.JFrame {

    ArrayList<ModelFuncionario> funcionarioCad = new ArrayList<ModelFuncionario>();

    public ViewFuncionario() {
            initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

            labelCadastro = new javax.swing.JLabel();
            campoNome = new javax.swing.JTextField();
            labelNome = new javax.swing.JLabel();
            labelEmail = new javax.swing.JLabel();
            campoEmail = new javax.swing.JTextField();
            labelTelefone = new javax.swing.JLabel();
            campoTelefone = new javax.swing.JTextField();
            campoSenha = new javax.swing.JPasswordField();
            labelSenha = new javax.swing.JLabel();
            cadastrarBotao = new javax.swing.JButton();
            botaoVoltar = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            labelCadastro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            labelCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelCadastro.setText("CADASTRO");

            campoNome.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            campoNomeActionPerformed(evt);
                    }
            });

            labelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            labelNome.setText("Nome");

            labelEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            labelEmail.setText("E-mail");

            campoEmail.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            campoEmailActionPerformed(evt);
                    }
            });

            labelTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            labelTelefone.setText("Telefone");

            campoTelefone.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            campoTelefoneActionPerformed(evt);
                    }
            });

            campoSenha.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            campoSenhaActionPerformed(evt);
                    }
            });

            labelSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            labelSenha.setText("Senha");

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
                                                                                            .addComponent(labelSenha).addComponent(labelTelefone).addComponent(labelNome)
                                                                                            .addComponent(labelEmail))
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
                                                                            .addComponent(campoSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 323,
                                                                                            Short.MAX_VALUE)
                                                                            .addComponent(campoTelefone).addComponent(campoEmail).addComponent(campoNome))
                                                                            .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout
                                            .createSequentialGroup().addGap(127, 127, 127).addComponent(labelCadastro,
                                                            javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE)));
            layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup().addGap(23, 23, 23)
                                            .addComponent(labelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 27,
                                                            javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18).addComponent(labelNome).addGap(4, 4, 4)
                                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                            javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(15, 15, 15).addComponent(labelEmail)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                            javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18).addComponent(labelTelefone).addGap(4, 4, 4)
                                            .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                            javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(labelSenha)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                            javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(botaoVoltar).addComponent(cadastrarBotao))
                                            .addGap(46, 46, 46)));

            pack();
    }// </editor-fold>                        

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_campoNomeActionPerformed

    }// GEN-LAST:event_campoNomeActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_campoEmailActionPerformed

    }

    private void cadastrarBotaoActionPerformed(java.awt.event.ActionEvent evt)throws IOException, NoSuchAlgorithmException {// GEN-FIRST:event_cadastrarBotaoActionPerformed

        ViewLogin login                      = new ViewLogin();
        criptografaSenha cript               = new criptografaSenha();
        ModelFuncionario cadFuncionario      = new ModelFuncionario();
        PersistenciaFuncionario persistencia = new PersistenciaFuncionario();
        funcionarioCad                       = persistencia.importa();

        String senha = cript.stringHexa(cript.criptografa(String.valueOf(campoSenha.getPassword())));
        String email = campoEmail.getText();
        String nome = campoNome.getText();
        String telefone = campoTelefone.getText();

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
        PersistenciaFuncionario persistencia = new PersistenciaFuncionario();
        persistencia.exporta(funcionarioCad);
    }

    public void importaFuncionario() throws FileNotFoundException {
        PersistenciaFuncionario persistencia = new PersistenciaFuncionario();
        funcionarioCad = persistencia.importa();
    }

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoVoltarActionPerformed
        sistemaNovo sistema = new sistemaNovo();
        sistema.setVisible(true);
        dispose(); 
    }// GEN-LAST:event_botaoVoltarActionPerformed

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void campoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {

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
                    java.util.logging.Logger.getLogger(ViewFuncionario.class.getName()).log(java.util.logging.Level.SEVERE,
                                    null, ex);
            } catch (InstantiationException ex) {
                    java.util.logging.Logger.getLogger(ViewFuncionario.class.getName()).log(java.util.logging.Level.SEVERE,
                                    null, ex);
            } catch (IllegalAccessException ex) {
                    java.util.logging.Logger.getLogger(ViewFuncionario.class.getName()).log(java.util.logging.Level.SEVERE,
                                    null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                    java.util.logging.Logger.getLogger(ViewFuncionario.class.getName()).log(java.util.logging.Level.SEVERE,
                                    null, ex);
            }
            // </editor-fold>
            // </editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                            new ViewFuncionario().setVisible(true);
                    }
            });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botaoVoltar;
    public javax.swing.JButton cadastrarBotao;
    public javax.swing.JTextField campoEmail;
    public javax.swing.JLabel labelCadastro;
    public javax.swing.JLabel labelNome;
    public javax.swing.JLabel labelEmail;
    public javax.swing.JLabel labelTelefone;
    public javax.swing.JLabel labelSenha;
    public javax.swing.JTextField campoNome;
    public javax.swing.JPasswordField campoSenha;
    public javax.swing.JTextField campoTelefone;
    // End of variables declaration//GEN-END:variables
}
