package View;

import PasswordClass.Senhas;
import Controll.Controle;
import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JFrame {

    Controle ct = new Controle();

    public TelaCadastro() {
        initComponents();
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextNovaPlataforma = new javax.swing.JTextField();
        TextNovaSenha = new javax.swing.JTextField();
        BotaoSalvar = new javax.swing.JButton();
        BotaoVoltar = new javax.swing.JButton();
        BotaoSair = new javax.swing.JButton();
        BotaoVerTodos = new javax.swing.JButton();
        LabelNomeNovaPlataforma = new javax.swing.JLabel();
        LabelNovaSenha = new javax.swing.JLabel();
        LabelNomeCadastro = new javax.swing.JLabel();
        LabelTelaCadastro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(728, 450));
        setMinimumSize(new java.awt.Dimension(728, 450));
        setPreferredSize(new java.awt.Dimension(728, 450));
        getContentPane().setLayout(null);
        getContentPane().add(TextNovaPlataforma);
        TextNovaPlataforma.setBounds(150, 130, 420, 30);
        getContentPane().add(TextNovaSenha);
        TextNovaSenha.setBounds(150, 200, 420, 30);

        BotaoSalvar.setText("Salvar");
        BotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoSalvar);
        BotaoSalvar.setBounds(150, 260, 90, 30);

        BotaoVoltar.setText("Voltar");
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoVoltar);
        BotaoVoltar.setBounds(260, 260, 90, 30);

        BotaoSair.setText("Sair");
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoSair);
        BotaoSair.setBounds(370, 260, 90, 30);

        BotaoVerTodos.setText("Ver Todos");
        BotaoVerTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVerTodosActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoVerTodos);
        BotaoVerTodos.setBounds(480, 260, 90, 30);

        LabelNomeNovaPlataforma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelNomeNovaPlataforma.setForeground(new java.awt.Color(255, 255, 255));
        LabelNomeNovaPlataforma.setText("Nome da plataforma");
        getContentPane().add(LabelNomeNovaPlataforma);
        LabelNomeNovaPlataforma.setBounds(150, 110, 130, 17);

        LabelNovaSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelNovaSenha.setForeground(new java.awt.Color(255, 255, 255));
        LabelNovaSenha.setText("Senha");
        getContentPane().add(LabelNovaSenha);
        LabelNovaSenha.setBounds(150, 180, 130, 20);

        LabelNomeCadastro.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        LabelNomeCadastro.setForeground(new java.awt.Color(255, 255, 255));
        LabelNomeCadastro.setText("Cadastro de Senhas");
        getContentPane().add(LabelNomeCadastro);
        LabelNomeCadastro.setBounds(170, 10, 410, 60);

        LabelTelaCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/wall_sky.jpg"))); // NOI18N
        getContentPane().add(LabelTelaCadastro);
        LabelTelaCadastro.setBounds(0, 0, 730, 450);

        setSize(new java.awt.Dimension(744, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed

        dispose();
       
    }//GEN-LAST:event_BotaoVoltarActionPerformed

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed

        System.exit(0);

    }//GEN-LAST:event_BotaoSairActionPerformed

    private void BotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarActionPerformed

        salvarSenha();
    }//GEN-LAST:event_BotaoSalvarActionPerformed

    private void BotaoVerTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVerTodosActionPerformed

        TelaPrincipal telaprincipal = new TelaPrincipal(null, true, ct);
        telaprincipal.setVisible(true);

    }//GEN-LAST:event_BotaoVerTodosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoSair;
    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JButton BotaoVerTodos;
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JLabel LabelNomeCadastro;
    private javax.swing.JLabel LabelNomeNovaPlataforma;
    private javax.swing.JLabel LabelNovaSenha;
    private javax.swing.JLabel LabelTelaCadastro;
    private javax.swing.JTextField TextNovaPlataforma;
    private javax.swing.JTextField TextNovaSenha;
    // End of variables declaration//GEN-END:variables

    private void salvarSenha(){
        
        Senhas senha = new Senhas();
        senha.setNomePlataforma(TextNovaPlataforma.getText());
        senha.setSenha(TextNovaSenha.getText());

        if (ct.salvar(senha)) {

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            TextNovaPlataforma.setText("");
            TextNovaSenha.setText("");
            TextNovaPlataforma.requestFocus();

            TelaPrincipal telaprincipal = new TelaPrincipal(null, true, ct);


        } else {
            JOptionPane.showMessageDialog(null, "Ops! Algo deu errado. tente novamente!");
            
        }
    }
}
