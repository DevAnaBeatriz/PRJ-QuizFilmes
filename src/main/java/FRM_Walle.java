
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class FRM_Walle extends javax.swing.JFrame {

    /**
     * Creates new form FRM_Walle
     */
    public FRM_Walle() {
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

        grp_alternativasWall = new javax.swing.ButtonGroup();
        btn_avancarWall = new javax.swing.JButton();
        btn_desenvolWall = new javax.swing.JButton();
        btn_voltarWall = new javax.swing.JButton();
        btn_sairWall = new javax.swing.JButton();
        btn_limparWall = new javax.swing.JButton();
        rdb_Wall1 = new javax.swing.JRadioButton();
        rdb_Wall2 = new javax.swing.JRadioButton();
        rdb_Wall3 = new javax.swing.JRadioButton();
        rdb_Wall4 = new javax.swing.JRadioButton();
        lbl_imgWall = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adivinhando WALL-E");
        setMinimumSize(new java.awt.Dimension(650, 650));
        setResizable(false);
        getContentPane().setLayout(null);

        btn_avancarWall.setBackground(new java.awt.Color(0, 0, 0));
        btn_avancarWall.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_avancarWall.setForeground(new java.awt.Color(255, 255, 255));
        btn_avancarWall.setText("Avançar");
        btn_avancarWall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_avancarWallActionPerformed(evt);
            }
        });
        getContentPane().add(btn_avancarWall);
        btn_avancarWall.setBounds(550, 570, 77, 30);

        btn_desenvolWall.setBackground(new java.awt.Color(0, 0, 0));
        btn_desenvolWall.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_desenvolWall.setForeground(new java.awt.Color(255, 255, 255));
        btn_desenvolWall.setText("Desenvolvedor");
        btn_desenvolWall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desenvolWallActionPerformed(evt);
            }
        });
        getContentPane().add(btn_desenvolWall);
        btn_desenvolWall.setBounds(220, 570, 120, 30);

        btn_voltarWall.setBackground(new java.awt.Color(0, 0, 0));
        btn_voltarWall.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_voltarWall.setForeground(new java.awt.Color(255, 255, 255));
        btn_voltarWall.setText("Voltar");
        btn_voltarWall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarWallActionPerformed(evt);
            }
        });
        getContentPane().add(btn_voltarWall);
        btn_voltarWall.setBounds(20, 570, 70, 30);

        btn_sairWall.setBackground(new java.awt.Color(0, 0, 0));
        btn_sairWall.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_sairWall.setForeground(new java.awt.Color(255, 255, 255));
        btn_sairWall.setText("Sair");
        btn_sairWall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairWallActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sairWall);
        btn_sairWall.setBounds(120, 570, 75, 30);

        btn_limparWall.setBackground(new java.awt.Color(0, 0, 0));
        btn_limparWall.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_limparWall.setForeground(new java.awt.Color(255, 255, 255));
        btn_limparWall.setText("Limpar");
        btn_limparWall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparWallActionPerformed(evt);
            }
        });
        getContentPane().add(btn_limparWall);
        btn_limparWall.setBounds(20, 410, 75, 30);

        grp_alternativasWall.add(rdb_Wall1);
        rdb_Wall1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        rdb_Wall1.setForeground(new java.awt.Color(255, 255, 255));
        rdb_Wall1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_Wall1ActionPerformed(evt);
            }
        });
        getContentPane().add(rdb_Wall1);
        rdb_Wall1.setBounds(20, 210, 140, 40);

        grp_alternativasWall.add(rdb_Wall2);
        rdb_Wall2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        rdb_Wall2.setForeground(new java.awt.Color(255, 255, 255));
        rdb_Wall2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_Wall2ActionPerformed(evt);
            }
        });
        getContentPane().add(rdb_Wall2);
        rdb_Wall2.setBounds(20, 260, 170, 40);

        grp_alternativasWall.add(rdb_Wall3);
        rdb_Wall3.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        rdb_Wall3.setForeground(new java.awt.Color(255, 255, 255));
        rdb_Wall3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_Wall3ActionPerformed(evt);
            }
        });
        getContentPane().add(rdb_Wall3);
        rdb_Wall3.setBounds(20, 310, 160, 40);

        grp_alternativasWall.add(rdb_Wall4);
        rdb_Wall4.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        rdb_Wall4.setForeground(new java.awt.Color(255, 255, 255));
        rdb_Wall4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_Wall4ActionPerformed(evt);
            }
        });
        getContentPane().add(rdb_Wall4);
        rdb_Wall4.setBounds(20, 360, 110, 40);

        lbl_imgWall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgwall.png"))); // NOI18N
        getContentPane().add(lbl_imgWall);
        lbl_imgWall.setBounds(0, 0, 650, 650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_avancarWallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_avancarWallActionPerformed
        new FRM_MenuFinal( ).setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_avancarWallActionPerformed

    private void btn_desenvolWallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desenvolWallActionPerformed
            new FRM_Desenvol( ).setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_desenvolWallActionPerformed

    private void btn_voltarWallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarWallActionPerformed
        new FRM_SilencioDosInocentes( ).setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_voltarWallActionPerformed

    private void btn_sairWallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairWallActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_sairWallActionPerformed

    private void btn_limparWallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparWallActionPerformed
        grp_alternativasWall.clearSelection();
    }//GEN-LAST:event_btn_limparWallActionPerformed

    private void rdb_Wall1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_Wall1ActionPerformed
        if (rdb_Wall1.isSelected()){
            JOptionPane.showMessageDialog(null,"Resposta errada!\nO robô ''R2-D2'' pertence a saga ''Star Wars'',\nportanto não está presente no filme citado.","Alternativa Errada!",JOptionPane.ERROR_MESSAGE);
            rdb_Wall1.setSelected(false);}
    }//GEN-LAST:event_rdb_Wall1ActionPerformed

    private void rdb_Wall2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_Wall2ActionPerformed
            if (rdb_Wall2.isSelected()){
            JOptionPane.showMessageDialog(null,"Resposta errada!\nO robô ''BURN-E'' ,que significa ''Basic Utility\nRepair Nano Engineer'', é um robô soldador.","Alternativa Errada!",JOptionPane.ERROR_MESSAGE);
            rdb_Wall2.setSelected(false);}
    }//GEN-LAST:event_rdb_Wall2ActionPerformed

    private void rdb_Wall3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_Wall3ActionPerformed
        if (rdb_Wall3.isSelected()){
            JOptionPane.showMessageDialog(null,"Resposta errada!\nO robô ''C-3PO'' pertence a saga ''Star Wars'',\nportanto não está presente no filme citado.","Alternativa Errada!",JOptionPane.ERROR_MESSAGE);
            rdb_Wall3.setSelected(false);}
    }//GEN-LAST:event_rdb_Wall3ActionPerformed

    private void rdb_Wall4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_Wall4ActionPerformed
        JOptionPane.showMessageDialog(null,"Parabéns, você acertou!\n\n O robô ''EVA'' é o moderno robô\npor quem ''WALL-E'' se apaixona.","Alternativa Correta!",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rdb_Wall4ActionPerformed

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
            java.util.logging.Logger.getLogger(FRM_Walle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Walle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Walle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Walle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Walle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_avancarWall;
    private javax.swing.JButton btn_desenvolWall;
    private javax.swing.JButton btn_limparWall;
    private javax.swing.JButton btn_sairWall;
    private javax.swing.JButton btn_voltarWall;
    private javax.swing.ButtonGroup grp_alternativasWall;
    private javax.swing.JLabel lbl_imgWall;
    private javax.swing.JRadioButton rdb_Wall1;
    private javax.swing.JRadioButton rdb_Wall2;
    private javax.swing.JRadioButton rdb_Wall3;
    private javax.swing.JRadioButton rdb_Wall4;
    // End of variables declaration//GEN-END:variables
}
