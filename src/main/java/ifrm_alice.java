
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class ifrm_alice extends javax.swing.JInternalFrame {

    /**
     * Creates new form ifrm_alice
     */
    public ifrm_alice() {
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
        pnl_fundo = new javax.swing.JPanel();
        btn_sair = new javax.swing.JButton();
        btn_limparAlice = new javax.swing.JButton();
        lbl_imgalice = new javax.swing.JLabel();
        rdb_alice1 = new javax.swing.JRadioButton();
        rdb_alice2 = new javax.swing.JRadioButton();
        rdb_alice3 = new javax.swing.JRadioButton();
        rdb_alice4 = new javax.swing.JRadioButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        pnl_fundo1 = new javax.swing.JPanel();
        btn_sair1 = new javax.swing.JButton();
        btn_limparAlice1 = new javax.swing.JButton();
        pnl_alternativas1 = new javax.swing.JPanel();
        rdb_alice5 = new javax.swing.JRadioButton();
        rdb_alice6 = new javax.swing.JRadioButton();
        rdb_alice7 = new javax.swing.JRadioButton();
        rdb_alice8 = new javax.swing.JRadioButton();
        lbl_imgalice1 = new javax.swing.JLabel();

        setTitle("Alice no País das Maravilhas");

        btn_sair.setBackground(new java.awt.Color(0, 0, 0));
        btn_sair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_sair.setForeground(new java.awt.Color(255, 255, 255));
        btn_sair.setText("Fechar");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        btn_limparAlice.setBackground(new java.awt.Color(0, 0, 0));
        btn_limparAlice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_limparAlice.setForeground(new java.awt.Color(255, 255, 255));
        btn_limparAlice.setText("Limpar");
        btn_limparAlice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparAliceActionPerformed(evt);
            }
        });

        lbl_imgalice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgalice.png"))); // NOI18N

        grp_alternativasalice.add(rdb_alice1);
        rdb_alice1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        rdb_alice1.setForeground(new java.awt.Color(255, 255, 255));
        rdb_alice1.setText("Gato de botas");
        rdb_alice1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        javax.swing.GroupLayout pnl_fundoLayout = new javax.swing.GroupLayout(pnl_fundo);
        pnl_fundo.setLayout(pnl_fundoLayout);
        pnl_fundoLayout.setHorizontalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fundoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdb_alice4)
                    .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(rdb_alice1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdb_alice2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdb_alice3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_limparAlice, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(293, Short.MAX_VALUE))
            .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_fundoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl_imgalice)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnl_fundoLayout.setVerticalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_fundoLayout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addComponent(rdb_alice1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdb_alice2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdb_alice3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdb_alice4)
                .addGap(18, 18, 18)
                .addComponent(btn_limparAlice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154)
                .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_fundoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl_imgalice)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jInternalFrame1.setTitle("Alice no País das Maravilhas");

        btn_sair1.setBackground(new java.awt.Color(0, 0, 0));
        btn_sair1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_sair1.setForeground(new java.awt.Color(255, 255, 255));
        btn_sair1.setText("Sair");
        btn_sair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sair1ActionPerformed(evt);
            }
        });

        btn_limparAlice1.setBackground(new java.awt.Color(0, 0, 0));
        btn_limparAlice1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_limparAlice1.setForeground(new java.awt.Color(255, 255, 255));
        btn_limparAlice1.setText("Limpar");
        btn_limparAlice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparAlice1ActionPerformed(evt);
            }
        });

        pnl_alternativas1.setBackground(new java.awt.Color(51, 51, 51));
        pnl_alternativas1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        grp_alternativasalice.add(rdb_alice5);
        rdb_alice5.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        rdb_alice5.setForeground(new java.awt.Color(255, 255, 255));
        rdb_alice5.setText("Gato de botas");
        rdb_alice5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_alice5ActionPerformed(evt);
            }
        });

        grp_alternativasalice.add(rdb_alice6);
        rdb_alice6.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        rdb_alice6.setForeground(new java.awt.Color(255, 255, 255));
        rdb_alice6.setText("Manda-chuva");
        rdb_alice6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_alice6ActionPerformed(evt);
            }
        });

        grp_alternativasalice.add(rdb_alice7);
        rdb_alice7.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        rdb_alice7.setForeground(new java.awt.Color(255, 255, 255));
        rdb_alice7.setText("Félix");
        rdb_alice7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_alice7ActionPerformed(evt);
            }
        });

        grp_alternativasalice.add(rdb_alice8);
        rdb_alice8.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        rdb_alice8.setForeground(new java.awt.Color(255, 255, 255));
        rdb_alice8.setText("Gato de Cheshire");
        rdb_alice8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_alice8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_alternativas1Layout = new javax.swing.GroupLayout(pnl_alternativas1);
        pnl_alternativas1.setLayout(pnl_alternativas1Layout);
        pnl_alternativas1Layout.setHorizontalGroup(
            pnl_alternativas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_alternativas1Layout.createSequentialGroup()
                .addGroup(pnl_alternativas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdb_alice8)
                    .addGroup(pnl_alternativas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(rdb_alice5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdb_alice6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdb_alice7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnl_alternativas1Layout.setVerticalGroup(
            pnl_alternativas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_alternativas1Layout.createSequentialGroup()
                .addComponent(rdb_alice5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdb_alice6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdb_alice7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdb_alice8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_imgalice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgalice.png"))); // NOI18N

        javax.swing.GroupLayout pnl_fundo1Layout = new javax.swing.GroupLayout(pnl_fundo1);
        pnl_fundo1.setLayout(pnl_fundo1Layout);
        pnl_fundo1Layout.setHorizontalGroup(
            pnl_fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fundo1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnl_fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_limparAlice1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sair1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_fundo1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(pnl_fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_imgalice1)
                        .addGroup(pnl_fundo1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(pnl_alternativas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnl_fundo1Layout.setVerticalGroup(
            pnl_fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_fundo1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_limparAlice1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203)
                .addComponent(btn_sair1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnl_fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_fundo1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(pnl_fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_fundo1Layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(pnl_alternativas1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lbl_imgalice1))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_fundo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_fundo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setBounds(40, 23, 662, 686);
    }// </editor-fold>//GEN-END:initComponents

    private void rdb_alice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_alice1ActionPerformed
        if (rdb_alice1.isSelected()){
            JOptionPane.showMessageDialog(null,"Resposta errada, ''Gato de Botas'' é o nome do personagem\nde desenho animado da série de filmes ''Shrek''.","Alternativa Errada!",JOptionPane.ERROR_MESSAGE);
            rdb_alice1.setSelected(false);}
    }//GEN-LAST:event_rdb_alice1ActionPerformed

    private void rdb_alice2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_alice2ActionPerformed
        if (rdb_alice2.isSelected()){
            JOptionPane.showMessageDialog(null,"Resposta errada, ''Manda-chuva'' é o nome do personagem\nde desenho animado da série de televisão ''Manda-chuva''.","Alternativa Errada!",JOptionPane.ERROR_MESSAGE);
            rdb_alice2.setSelected(false);}
    }//GEN-LAST:event_rdb_alice2ActionPerformed

    private void rdb_alice3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_alice3ActionPerformed
        if (rdb_alice3.isSelected()){
            JOptionPane.showMessageDialog(null,"Resposta errada, ''Félix'' é o nome do personagem de\ndesenho animado da série de televisão ''O Gato Félix''.","Alternativa Errada!",JOptionPane.ERROR_MESSAGE);
            rdb_alice3.setSelected(false);}
    }//GEN-LAST:event_rdb_alice3ActionPerformed

    private void rdb_alice4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_alice4ActionPerformed
        JOptionPane.showMessageDialog(null,"Parabéns, você acertou! Esse é o verdadeiro nome do\ngato sorridente de ''Alice no País das Maravilhas''.","Alternativa Correta!",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rdb_alice4ActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_limparAliceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparAliceActionPerformed
        grp_alternativasalice.clearSelection();
    }//GEN-LAST:event_btn_limparAliceActionPerformed

    private void btn_sair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sair1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_sair1ActionPerformed

    private void btn_limparAlice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparAlice1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_limparAlice1ActionPerformed

    private void rdb_alice5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_alice5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb_alice5ActionPerformed

    private void rdb_alice6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_alice6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb_alice6ActionPerformed

    private void rdb_alice7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_alice7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb_alice7ActionPerformed

    private void rdb_alice8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_alice8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb_alice8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_limparAlice;
    private javax.swing.JButton btn_limparAlice1;
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton btn_sair1;
    private javax.swing.ButtonGroup grp_alternativasalice;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel lbl_imgalice;
    private javax.swing.JLabel lbl_imgalice1;
    private javax.swing.JPanel pnl_alternativas1;
    private javax.swing.JPanel pnl_fundo;
    private javax.swing.JPanel pnl_fundo1;
    private javax.swing.JRadioButton rdb_alice1;
    private javax.swing.JRadioButton rdb_alice2;
    private javax.swing.JRadioButton rdb_alice3;
    private javax.swing.JRadioButton rdb_alice4;
    private javax.swing.JRadioButton rdb_alice5;
    private javax.swing.JRadioButton rdb_alice6;
    private javax.swing.JRadioButton rdb_alice7;
    private javax.swing.JRadioButton rdb_alice8;
    // End of variables declaration//GEN-END:variables
}
