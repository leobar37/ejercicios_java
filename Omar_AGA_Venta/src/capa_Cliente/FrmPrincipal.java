/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa_Cliente;

/**
 *
 * @author JOSE
 */
public class FrmPrincipal extends javax.swing.JFrame {
 private int cont  = 0;
    
    public FrmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        //this.setExtendedState(MAXIMIZED_BOTH);
          this.setSize(1433, 894);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        move1 = new com.sun.animation.effects.Move();
        move2 = new com.sun.animation.effects.Move();
        dropShadowBorder1 = new org.edisoncor.gui.util.DropShadowBorder();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        btnMen = new org.edisoncor.gui.button.ButtonIcon();
        panelMen = new javax.swing.JPanel();
        btnControlUsuarios = new org.edisoncor.gui.button.ButtonAero();
        buttonAero1 = new org.edisoncor.gui.button.ButtonAero();
        clockFace1 = new org.edisoncor.gui.varios.ClockFace();
        clockDigital1 = new org.edisoncor.gui.varios.ClockDigital();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sistema.jpg"))); // NOI18N
        panelImage1.setLayout(null);

        btnMen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/men.png"))); // NOI18N
        btnMen.setText("buttonIcon1");
        btnMen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenActionPerformed(evt);
            }
        });
        panelImage1.add(btnMen);
        btnMen.setBounds(10, 10, 80, 67);

        panelMen.setBackground(new java.awt.Color(255, 255, 255));

        btnControlUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        btnControlUsuarios.setText("Control de usuarios");
        btnControlUsuarios.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnControlUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControlUsuariosActionPerformed(evt);
            }
        });

        buttonAero1.setBackground(new java.awt.Color(0, 0, 0));
        buttonAero1.setText("Gestionar Gastos");
        buttonAero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAero1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenLayout = new javax.swing.GroupLayout(panelMen);
        panelMen.setLayout(panelMenLayout);
        panelMenLayout.setHorizontalGroup(
            panelMenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnControlUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addComponent(buttonAero1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelMenLayout.setVerticalGroup(
            panelMenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnControlUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonAero1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(623, Short.MAX_VALUE))
        );

        panelImage1.add(panelMen);
        panelMen.setBounds(-840, 0, 410, 840);

        clockFace1.setBackground(new java.awt.Color(255, 255, 255));
        clockFace1.setForeground(new java.awt.Color(0, 0, 0));
        clockFace1.setToolTipText("ddd");
        panelImage1.add(clockFace1);
        clockFace1.setBounds(1230, 40, 150, 150);

        clockDigital1.setForeground(new java.awt.Color(0, 0, 0));
        clockDigital1.setToolTipText("");
        clockDigital1.setFont(new java.awt.Font("Arial Narrow", 1, 48)); // NOI18N
        panelImage1.add(clockDigital1);
        clockDigital1.setBounds(1190, 220, 228, 49);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 1433, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenActionPerformed
          if(cont == 0){
           Animacion.Animacion.mover_derecha(-840, 0, 5, 4, panelMen);
           Animacion.Animacion.mover_derecha(0, 420, 5,3,btnMen);
           cont = 1;
           
       }else{
           Animacion.Animacion.mover_izquierda(0, -840, 5, 4, panelMen);
           Animacion.Animacion.mover_izquierda(420, 0, 5, 4, btnMen);
           cont = 0;
       }
    }//GEN-LAST:event_btnMenActionPerformed

    private void btnControlUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControlUsuariosActionPerformed
       FrmRegistroUsuarios obj = new FrmRegistroUsuarios(null, true);
       obj.setVisible(true);
       
    }//GEN-LAST:event_btnControlUsuariosActionPerformed

    private void buttonAero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAero1ActionPerformed
      FrmGastos ventanaGastos = new FrmGastos(null, true);
      ventanaGastos.setVisible(true);
    }//GEN-LAST:event_buttonAero1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAero btnControlUsuarios;
    private org.edisoncor.gui.button.ButtonIcon btnMen;
    private org.edisoncor.gui.button.ButtonAero buttonAero1;
    private org.edisoncor.gui.varios.ClockDigital clockDigital1;
    private org.edisoncor.gui.varios.ClockFace clockFace1;
    private org.edisoncor.gui.util.DropShadowBorder dropShadowBorder1;
    private com.sun.animation.effects.Move move1;
    private com.sun.animation.effects.Move move2;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JPanel panelMen;
    // End of variables declaration//GEN-END:variables
}
