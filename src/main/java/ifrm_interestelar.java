
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author chicl
 */
public class ifrm_interestelar extends javax.swing.JInternalFrame {

    /**
     * Creates new form ifrm_interestelar
     */
    public ifrm_interestelar() {
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

        grp_alternativasInter = new javax.swing.ButtonGroup();
        btn_voltarInter = new javax.swing.JButton();
        btn_limparInter = new javax.swing.JButton();
        rdb_Inter1 = new javax.swing.JRadioButton();
        rdb_Inter2 = new javax.swing.JRadioButton();
        rdb_Inter3 = new javax.swing.JRadioButton();
        rdb_Inter4 = new javax.swing.JRadioButton();
        lbl_imgInter = new javax.swing.JLabel();

        setTitle("Interestelar");
        setMaximumSize(new java.awt.Dimension(662, 686));
        setMinimumSize(new java.awt.Dimension(662, 686));
        setPreferredSize(new java.awt.Dimension(662, 686));
        getContentPane().setLayout(null);

        btn_voltarInter.setBackground(new java.awt.Color(0, 0, 0));
        btn_voltarInter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_voltarInter.setForeground(new java.awt.Color(255, 255, 255));
        btn_voltarInter.setText("Fechar");
        btn_voltarInter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarInterActionPerformed(evt);
            }
        });
        getContentPane().add(btn_voltarInter);
        btn_voltarInter.setBounds(20, 570, 70, 30);

        btn_limparInter.setBackground(new java.awt.Color(0, 0, 0));
        btn_limparInter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_limparInter.setForeground(new java.awt.Color(255, 255, 255));
        btn_limparInter.setText("Limpar");
        btn_limparInter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparInterActionPerformed(evt);
            }
        });
        getContentPane().add(btn_limparInter);
        btn_limparInter.setBounds(20, 380, 75, 30);

        grp_alternativasInter.add(rdb_Inter1);
        rdb_Inter1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        rdb_Inter1.setForeground(new java.awt.Color(255, 255, 255));
        rdb_Inter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_Inter1ActionPerformed(evt);
            }
        });
        getContentPane().add(rdb_Inter1);
        rdb_Inter1.setBounds(10, 140, 470, 40);

        grp_alternativasInter.add(rdb_Inter2);
        rdb_Inter2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        rdb_Inter2.setForeground(new java.awt.Color(255, 255, 255));
        rdb_Inter2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_Inter2ActionPerformed(evt);
            }
        });
        getContentPane().add(rdb_Inter2);
        rdb_Inter2.setBounds(10, 190, 150, 40);

        grp_alternativasInter.add(rdb_Inter3);
        rdb_Inter3.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        rdb_Inter3.setForeground(new java.awt.Color(255, 255, 255));
        rdb_Inter3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_Inter3ActionPerformed(evt);
            }
        });
        getContentPane().add(rdb_Inter3);
        rdb_Inter3.setBounds(10, 240, 340, 40);

        grp_alternativasInter.add(rdb_Inter4);
        rdb_Inter4.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        rdb_Inter4.setForeground(new java.awt.Color(255, 255, 255));
        rdb_Inter4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_Inter4ActionPerformed(evt);
            }
        });
        getContentPane().add(rdb_Inter4);
        rdb_Inter4.setBounds(10, 290, 290, 40);

        lbl_imgInter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imginter.png"))); // NOI18N
        getContentPane().add(lbl_imgInter);
        lbl_imgInter.setBounds(0, 0, 650, 650);

        setBounds(40, 23, 662, 686);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarInterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarInterActionPerformed
        
        dispose();
    }//GEN-LAST:event_btn_voltarInterActionPerformed

    private void btn_limparInterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparInterActionPerformed
        grp_alternativasInter.clearSelection();
    }//GEN-LAST:event_btn_limparInterActionPerformed

    private void rdb_Inter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_Inter1ActionPerformed
        if (rdb_Inter1.isSelected()){
            JOptionPane.showMessageDialog(null,"Resposta errada!\nNo filme ''Interestelar'', a própria humanidade\ndestrói o planeta Terra.","Alternativa Errada!",JOptionPane.ERROR_MESSAGE);
            rdb_Inter1.setSelected(false);}
    }//GEN-LAST:event_rdb_Inter1ActionPerformed

    private void rdb_Inter2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_Inter2ActionPerformed
        if (rdb_Inter2.isSelected()){
            JOptionPane.showMessageDialog(null,"Resposta errada!\nNo filme ''Interestelar'', Doyle era um geógrafo e astronauta que\nparticipava da missão de exploração espacial Endurance\natravés do buraco de minhoca.","Alternativa Errada!",JOptionPane.ERROR_MESSAGE);
            rdb_Inter2.setSelected(false);}
    }//GEN-LAST:event_rdb_Inter2ActionPerformed

    private void rdb_Inter3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_Inter3ActionPerformed
        JOptionPane.showMessageDialog(null,"Parabéns, você acertou!\n\nNo filme ''Interestelar'' quem realmente salva a humanidade\nao encontrar outro planeta habitável é Murphy Cooper.","Alternativa Correta!",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rdb_Inter3ActionPerformed

    private void rdb_Inter4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_Inter4ActionPerformed
        if (rdb_Inter4.isSelected()){
            JOptionPane.showMessageDialog(null,"Resposta errada!\nNo filme ''Interestelar'' Amélia Brand é a cientista-chefe/bióloga da expedição que está\nsendo enviada através do buraco de minhoca tentando realocar a raça humana.","Alternativa Errada!",JOptionPane.ERROR_MESSAGE);
            rdb_Inter4.setSelected(false);}
    }//GEN-LAST:event_rdb_Inter4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_limparInter;
    private javax.swing.JButton btn_voltarInter;
    private javax.swing.ButtonGroup grp_alternativasInter;
    private javax.swing.JLabel lbl_imgInter;
    private javax.swing.JRadioButton rdb_Inter1;
    private javax.swing.JRadioButton rdb_Inter2;
    private javax.swing.JRadioButton rdb_Inter3;
    private javax.swing.JRadioButton rdb_Inter4;
    // End of variables declaration//GEN-END:variables
}
