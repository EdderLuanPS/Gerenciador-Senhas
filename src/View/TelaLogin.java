package View;

import javax.swing.JOptionPane;


public class TelaLogin extends javax.swing.JFrame {


    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelBemVindo = new javax.swing.JLabel();
        CampoSenha = new javax.swing.JPasswordField();
        TextLogin = new javax.swing.JTextField();
        BotaoLogin = new javax.swing.JButton();
        BotaoSair = new javax.swing.JButton();
        LabelTelaLogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        LabelBemVindo.setFont(new java.awt.Font("Arial", 3, 48)); // NOI18N
        LabelBemVindo.setForeground(new java.awt.Color(255, 255, 255));
        LabelBemVindo.setText("Bem Vindo!");
        getContentPane().add(LabelBemVindo);
        LabelBemVindo.setBounds(210, 50, 340, 160);
        getContentPane().add(CampoSenha);
        CampoSenha.setBounds(200, 240, 300, 30);
        getContentPane().add(TextLogin);
        TextLogin.setBounds(200, 200, 300, 30);

        BotaoLogin.setText("Login");
        BotaoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLoginActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoLogin);
        BotaoLogin.setBounds(200, 290, 80, 30);

        BotaoSair.setText("Sair");
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoSair);
        BotaoSair.setBounds(420, 290, 80, 30);

        LabelTelaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/wall_sky.jpg"))); // NOI18N
        getContentPane().add(LabelTelaLogin);
        LabelTelaLogin.setBounds(-2, 0, 0, 0);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/wall_sky.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 730, 450);

        setSize(new java.awt.Dimension(742, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed

        System.exit(0);

    }//GEN-LAST:event_BotaoSairActionPerformed

    private void BotaoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLoginActionPerformed

       login(); 

    }//GEN-LAST:event_BotaoLoginActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoLogin;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JPasswordField CampoSenha;
    private javax.swing.JLabel LabelBemVindo;
    private javax.swing.JLabel LabelTelaLogin;
    private javax.swing.JTextField TextLogin;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
    private void login(){
        
        //ADMIN PASSWORD:(login:sysadmin // senha:admin) Apenas o User setado aqui pode usar o programa.
        if (TextLogin.getText().equals("sysadmin") && CampoSenha.getText().equals("admin")) {
        
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);

            JOptionPane.showMessageDialog(null, "Seja bem vindo!");

            dispose();
            
        } else {
            JOptionPane.showMessageDialog(null, "Oops, Login não encontrado. Tente novamente!");
            
        }
        
    }

}
