
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class FRM_AliceMaravilha extends javax.swing.JFrame {

    /**
     * Creates new form FRM_AliceMaravilha
     */
    public FRM_AliceMaravilha() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grp_alternativasalice = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rdb_alice1 = new javax.swing.JRadioButton();
        rdb_alice2 = new javax.swing.JRadioButton();
        rdb_alice3 = new javax.swing.JRadioButton();
        rdb_alice4 = new javax.swing.JRadioButton();
        btn_avancarAlice = new javax.swing.JButton();
        btn_desenvolAlice = new javax.swing.JButton();
        btn_voltarAlice = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btn_limparAlice = new javax.swing.JButton();
        lbl_imgalice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adivinhando Alice no País das Maravilhas");
        setMaximumSize(new java.awt.Dimension(650, 650));
        setMinimumSize(new java.awt.Dimension(650, 650));
        setPreferredSize(new java.awt.Dimension(650, 650));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        grp_alternativasalice.add(rdb_alice1);
        rdb_alice1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        rdb_alice1.setForeground(new java.awt.Color(255, 255, 255));
        rdb_alice1.setText("Gato de botas");
        rdb_alice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_alice1ActionPerformed(evt);
            }
        });

        grp_alternativasalice.add(rdb_alice2);
        rdb_alice2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        rdb_alice2.setForeground(new java.awt.Color(255, 255, 255));
        rdb_alice2.setText("Manda-chuva");
        rdb_alice2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_alice2ActionPerformed(evt);
            }
        });

        grp_alternativasalice.add(rdb_alice3);
        rdb_alice3.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        rdb_alice3.setForeground(new java.awt.Color(255, 255, 255));
        rdb_alice3.setText("Félix");
        rdb_alice3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_alice3ActionPerformed(evt);
            }
        });

        grp_alternativasalice.add(rdb_alice4);
        rdb_alice4.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        rdb_alice4.setForeground(new java.awt.Color(255, 255, 255));
        rdb_alice4.setText("Gato de Cheshire");
        rdb_alice4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_alice4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdb_alice4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(rdb_alice1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdb_alice2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdb_alice3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rdb_alice1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdb_alice2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdb_alice3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdb_alice4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 150, 340, 200);

        btn_avancarAlice.setBackground(new java.awt.Color(0, 0, 0));
        btn_avancarAlice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_avancarAlice.setForeground(new java.awt.Color(255, 255, 255));
        btn_avancarAlice.setText("Avançar");
        btn_avancarAlice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_avancarAliceActionPerformed(evt);
            }
        });
        getContentPane().add(btn_avancarAlice);
        btn_avancarAlice.setBounds(550, 570, 77, 30);

        btn_desenvolAlice.setBackground(new java.awt.Color(0, 0, 0));
        btn_desenvolAlice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_desenvolAlice.setForeground(new java.awt.Color(255, 255, 255));
        btn_desenvolAlice.setText("Desenvolvedor");
        btn_desenvolAlice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desenvolAliceActionPerformed(evt);
            }
        });
        getContentPane().add(btn_desenvolAlice);
        btn_desenvolAlice.setBounds(220, 570, 120, 30);

        btn_voltarAlice.setBackground(new java.awt.Color(0, 0, 0));
        btn_voltarAlice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_voltarAlice.setForeground(new java.awt.Color(255, 255, 255));
        btn_voltarAlice.setText("Voltar");
        btn_voltarAlice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarAliceActionPerformed(evt);
            }
        });
        getContentPane().add(btn_voltarAlice);
        btn_voltarAlice.setBounds(20, 570, 70, 30);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Sair");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(120, 570, 75, 30);

        btn_limparAlice.setBackground(new java.awt.Color(0, 0, 0));
        btn_limparAlice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_limparAlice.setForeground(new java.awt.Color(255, 255, 255));
        btn_limparAlice.setText("Limpar");
        btn_limparAlice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparAliceActionPerformed(evt);
            }
        });
        getContentPane().add(btn_limparAlice);
        btn_limparAlice.setBounds(20, 380, 75, 30);

        lbl_imgalice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgalice.png"))); // NOI18N
        getContentPane().add(lbl_imgalice);
        lbl_imgalice.setBounds(0, 0, 650, 650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rdb_alice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_alice1ActionPerformed
        if (rdb_alice1.isSelected()){
            JOptionPane.showMessageDialog(null,"Resposta errada, ''Gato de Botas'' é o nome do personagem\nde desenho animado da série de filmes ''Shrek''.","Alternativa Errada!",JOptionPane.ERROR_MESSAGE);
            rdb_alice1.setSelected(false);}
    }//GEN-LAST:event_rdb_alice1ActionPerformed

    private void rdb_alice4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_alice4ActionPerformed
        JOptionPane.showMessageDialog(null,"Parabéns, você acertou! Esse é o verdadeiro nome do\ngato sorridente de ''Alice no País das Maravilhas''.","Alternativa Correta!",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rdb_alice4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btn_desenvolAliceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desenvolAliceActionPerformed
            new FRM_Desenvol( ).setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_desenvolAliceActionPerformed

    private void btn_voltarAliceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarAliceActionPerformed
        new FRM_PrincipalMenu( ).setVisible(true); 
            dispose(); 
    }//GEN-LAST:event_btn_voltarAliceActionPerformed

    private void btn_limparAliceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparAliceActionPerformed
        grp_alternativasalice.clearSelection();
    }//GEN-LAST:event_btn_limparAliceActionPerformed

    private void btn_avancarAliceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_avancarAliceActionPerformed
        new FRM_ClubeDaLuta( ).setVisible(true); 
            dispose();
    }//GEN-LAST:event_btn_avancarAliceActionPerformed

    private void rdb_alice3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_alice3ActionPerformed
        if (rdb_alice3.isSelected()){
            JOptionPane.showMessageDialog(null,"Resposta errada, ''Félix'' é o nome do personagem de\ndesenho animado da série de televisão ''O Gato Félix''.","Alternativa Errada!",JOptionPane.ERROR_MESSAGE);
            rdb_alice3.setSelected(false);}
    }//GEN-LAST:event_rdb_alice3ActionPerformed

    private void rdb_alice2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_alice2ActionPerformed
        if (rdb_alice2.isSelected()){
            JOptionPane.showMessageDialog(null,"Resposta errada, ''Manda-chuva'' é o nome do personagem\nde desenho animado da série de televisão ''Manda-chuva''.","Alternativa Errada!",JOptionPane.ERROR_MESSAGE);
            rdb_alice2.setSelected(false);}
    }//GEN-LAST:event_rdb_alice2ActionPerformed

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
            java.util.logging.Logger.getLogger(FRM_AliceMaravilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_AliceMaravilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_AliceMaravilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_AliceMaravilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_AliceMaravilha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_avancarAlice;
    private javax.swing.JButton btn_desenvolAlice;
    private javax.swing.JButton btn_limparAlice;
    private javax.swing.JButton btn_voltarAlice;
    private javax.swing.ButtonGroup grp_alternativasalice;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_imgalice;
    private javax.swing.JRadioButton rdb_alice1;
    private javax.swing.JRadioButton rdb_alice2;
    private javax.swing.JRadioButton rdb_alice3;
    private javax.swing.JRadioButton rdb_alice4;
    // End of variables declaration//GEN-END:variables
}
