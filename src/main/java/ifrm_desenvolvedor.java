/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author chicl
 */
public class ifrm_desenvolvedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form ifrm_desenvolvedor
     */
    public ifrm_desenvolvedor() {
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

        btn_sairDesen = new javax.swing.JButton();
        lbl_imgDesen = new javax.swing.JLabel();

        setTitle("Desenvolvedor");
        setMaximumSize(new java.awt.Dimension(662, 686));
        setMinimumSize(new java.awt.Dimension(662, 686));
        setPreferredSize(new java.awt.Dimension(662, 686));

        btn_sairDesen.setBackground(new java.awt.Color(0, 0, 0));
        btn_sairDesen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_sairDesen.setForeground(new java.awt.Color(255, 255, 255));
        btn_sairDesen.setText("Fechar");
        btn_sairDesen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairDesenActionPerformed(evt);
            }
        });

        lbl_imgDesen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fundodev.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btn_sairDesen, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(557, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl_imgDesen)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(601, Short.MAX_VALUE)
                .addComponent(btn_sairDesen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl_imgDesen)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setBounds(40, 0, 662, 719);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sairDesenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairDesenActionPerformed
        dispose();
    }//GEN-LAST:event_btn_sairDesenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sairDesen;
    private javax.swing.JLabel lbl_imgDesen;
    // End of variables declaration//GEN-END:variables
}