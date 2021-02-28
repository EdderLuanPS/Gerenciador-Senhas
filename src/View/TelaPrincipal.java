package View;

import PasswordClass.Senhas;
import Controll.Controle;
import java.util.ArrayList;

public class TelaPrincipal extends javax.swing.JFrame {

    Controle ct;

    public TelaPrincipal() {
        initComponents();
    }

    public TelaPrincipal(Object object, boolean b, Controle ct) {
        this.ct = ct;
        initComponents();
        exibeConteudoTabela();
    }

    private void exibeConteudoTabela(){

        exibirTabela();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbl1 = new javax.swing.JScrollPane();
        TabelaSenhas = new javax.swing.JTable();
        BotaoVoltar = new javax.swing.JButton();
        BotaoAdicionar = new javax.swing.JButton();
        BotaoSair = new javax.swing.JButton();
        LabelNomeBuscarSenha = new javax.swing.JLabel();
        LabelTelaPrincipal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        TabelaSenhas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome da Plataforma", "Senha"
            }
        ));
        tbl1.setViewportView(TabelaSenhas);

        getContentPane().add(tbl1);
        tbl1.setBounds(50, 80, 630, 280);

        BotaoVoltar.setText("Voltar");
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoVoltar);
        BotaoVoltar.setBounds(150, 380, 90, 30);

        BotaoAdicionar.setText("Adicionar");
        BotaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoAdicionar);
        BotaoAdicionar.setBounds(310, 380, 90, 30);

        BotaoSair.setText("Sair");
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoSair);
        BotaoSair.setBounds(470, 380, 90, 30);

        LabelNomeBuscarSenha.setFont(new java.awt.Font("Arial", 3, 48)); // NOI18N
        LabelNomeBuscarSenha.setForeground(new java.awt.Color(255, 255, 255));
        LabelNomeBuscarSenha.setText("Buscar Senha");
        getContentPane().add(LabelNomeBuscarSenha);
        LabelNomeBuscarSenha.setBounds(190, 20, 390, 40);

        LabelTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/wall_sky.jpg"))); // NOI18N
        getContentPane().add(LabelTelaPrincipal);
        LabelTelaPrincipal.setBounds(0, 0, 0, 456);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/wall_sky.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 730, 460);

        setSize(new java.awt.Dimension(745, 495));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed

        System.exit(0);

    }//GEN-LAST:event_BotaoSairActionPerformed

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed

        dispose();

    }//GEN-LAST:event_BotaoVoltarActionPerformed

    private void BotaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAdicionarActionPerformed
        
        adicionarNaTabela();

    }//GEN-LAST:event_BotaoAdicionarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAdicionar;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JLabel LabelNomeBuscarSenha;
    private javax.swing.JLabel LabelTelaPrincipal;
    private javax.swing.JTable TabelaSenhas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane tbl1;
    // End of variables declaration//GEN-END:variables

    private void exibirTabela() {

        ArrayList<Senhas> senhas = ct.retornarTudo();

        for (int i = 0; i < 20; i++) {
            TabelaSenhas.setValueAt("", i, 0);
            TabelaSenhas.setValueAt("", i, 1);
        }

        for (int i = 0; i < senhas.size() && senhas.get(i) != null; i++) {
            TabelaSenhas.setValueAt(senhas.get(i).getNomePlataforma(), i, 0);
            TabelaSenhas.setValueAt(senhas.get(i).getSenha(), i, 1);
        }
    }

    private void adicionarNaTabela() {

        TelaCadastro tela = new TelaCadastro();
        tela.setVisible(true);

        dispose();

    }
}
