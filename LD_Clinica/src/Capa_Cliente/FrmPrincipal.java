/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Cliente;

import Capa_Negocio.Paciente;
import java.awt.Dimension;

/**
 *
 * @author JOSE
 */
public class FrmPrincipal extends javax.swing.JFrame {
  private int cont = 0;
   
    public FrmPrincipal() {
        initComponents();
        this.setSize(new Dimension(965, 750));
        this.setLocationRelativeTo(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonAeroLeft1 = new org.edisoncor.gui.button.ButtonAeroLeft();
        PanelPrincipal = new javax.swing.JPanel();
        men = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnListado = new org.edisoncor.gui.button.ButtonAero();
        btnRegistrar = new org.edisoncor.gui.button.ButtonAero();
        buttonAero3 = new org.edisoncor.gui.button.ButtonAero();
        buttonAero4 = new org.edisoncor.gui.button.ButtonAero();
        buttonAero5 = new org.edisoncor.gui.button.ButtonAero();
        buttonAero6 = new org.edisoncor.gui.button.ButtonAero();
        btnMostrarTodos = new org.edisoncor.gui.button.ButtonAero();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        BtnMen = new org.edisoncor.gui.button.ButtonAeroRound();
        btnsSalir = new org.edisoncor.gui.button.ButtonAero();

        buttonAeroLeft1.setText("buttonAeroLeft1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelPrincipal.setDoubleBuffered(false);
        PanelPrincipal.setLayout(null);

        men.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Reportes ");

        btnListado.setBackground(new java.awt.Color(0, 0, 0));
        btnListado.setText("Listado por Paciente");
        btnListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setText("Registrar Paciente");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        buttonAero3.setBackground(new java.awt.Color(0, 0, 0));
        buttonAero3.setText("tratamiento de mayor incidencia");
        buttonAero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAero3ActionPerformed(evt);
            }
        });

        buttonAero4.setBackground(new java.awt.Color(0, 0, 0));
        buttonAero4.setText("menor y mayor edad por tratamiento");
        buttonAero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAero4ActionPerformed(evt);
            }
        });

        buttonAero5.setBackground(new java.awt.Color(0, 0, 0));
        buttonAero5.setText("Promedio por sexo");
        buttonAero5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAero5ActionPerformed(evt);
            }
        });

        buttonAero6.setBackground(new java.awt.Color(0, 0, 0));
        buttonAero6.setText("Paciente de ortodoncia con consulta");
        buttonAero6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAero6ActionPerformed(evt);
            }
        });

        btnMostrarTodos.setBackground(new java.awt.Color(0, 0, 0));
        btnMostrarTodos.setText("Pacientes Registrados");
        btnMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menLayout = new javax.swing.GroupLayout(men);
        men.setLayout(menLayout);
        menLayout.setHorizontalGroup(
            menLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(menLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menLayout.createSequentialGroup()
                        .addGroup(menLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMostrarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(menLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(buttonAero6, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonAero5, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonAero4, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonAero3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnListado, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))))
        );
        menLayout.setVerticalGroup(
            menLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListado, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonAero4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonAero5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonAero6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonAero3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMostrarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        PanelPrincipal.add(men);
        men.setBounds(-350, 0, 350, 690);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("     un programa orientado a objetos en 3 capas,\naplicando Listas Dinámicas para una clínica odontológica \ndesea registrar los pacientes atendidos, siendo los datos a \nregistrar: nombre del paciente, edad, sexo, tratamiento realizado\n(considerar: extracción de diente, endodoncia, curación simple, ortodoncia),\ntipo de paciente (considere: particular, asegurado) y costo de la consulta.\nDesarrollar lo siguiente:\n\na)Registrar un paciente.\nb)Dado el tipo de paciente,\n mostrar el listado de los pacientes.\nc)Dado el tratamiento,\n mostrar el número de pacientes menores y mayores de edad.\nd)Mostrar el promedio \nde edad de los pacientes hombres y mujeres.\ne)Qué paciente con tratamiento de ortodoncia\n tiene el menor costo en la consulta.\nf)¿Qué tratamiento es el de mayor incidencia?");
        jScrollPane1.setViewportView(jTextArea1);

        PanelPrincipal.add(jScrollPane1);
        jScrollPane1.setBounds(170, 120, 690, 450);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Enunciado: Clinica Odontologica");
        PanelPrincipal.add(jLabel2);
        jLabel2.setBounds(310, 60, 430, 32);

        BtnMen.setBackground(new java.awt.Color(0, 0, 0));
        BtnMen.setText("Reportes");
        BtnMen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BtnMen);
        BtnMen.setBounds(20, 10, 95, 33);

        btnsSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnsSalir.setText("Salir");
        btnsSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsSalirActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnsSalir);
        btnsSalir.setBounds(800, 610, 61, 33);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnMenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenActionPerformed
       if(cont == 0){
           Animacion.Animacion.mover_derecha(-350, 0, 10, 4, men);
           Animacion.Animacion.mover_derecha(0, 360, 10, 4, BtnMen);
           cont = 1;
           
       }else{
           Animacion.Animacion.mover_izquierda(0, -350, 10, 4, men);
           Animacion.Animacion.mover_izquierda(360, 0, 10, 4, BtnMen);
           cont = 0;
       }
   
    }//GEN-LAST:event_BtnMenActionPerformed

    private void btnsSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnsSalirActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
      FrmRegistrar ventana = new FrmRegistrar(null, true);
      ventana.setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodosActionPerformed
       FrmTodos ventana = new FrmTodos(null,true);
       ventana.setVisible(true);
        
    }//GEN-LAST:event_btnMostrarTodosActionPerformed

    private void btnListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoActionPerformed
          FrmPacienteMayorCosto ventana = new FrmPacienteMayorCosto(null, true);
          ventana.setVisible(true);
    }//GEN-LAST:event_btnListadoActionPerformed

    private void buttonAero4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAero4ActionPerformed
     FrmporTratamiento ventana = new FrmporTratamiento(null, true);
     ventana.setVisible(true);
    }//GEN-LAST:event_buttonAero4ActionPerformed

    private void buttonAero5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAero5ActionPerformed
        FrmPromedio ventana = new FrmPromedio(null, true);
        ventana.setVisible(true);
    }//GEN-LAST:event_buttonAero5ActionPerformed

    private void buttonAero6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAero6ActionPerformed
     FrmPacienteMayorCosto obj = new FrmPacienteMayorCosto(null,true);
     obj.setVisible(true);
    }//GEN-LAST:event_buttonAero6ActionPerformed

    private void buttonAero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAero3ActionPerformed
       FrmMayorIncidencia ventana = new FrmMayorIncidencia(null,true);
       ventana.setVisible(true);
    }//GEN-LAST:event_buttonAero3ActionPerformed

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
    private org.edisoncor.gui.button.ButtonAeroRound BtnMen;
    private javax.swing.JPanel PanelPrincipal;
    private org.edisoncor.gui.button.ButtonAero btnListado;
    private org.edisoncor.gui.button.ButtonAero btnMostrarTodos;
    private org.edisoncor.gui.button.ButtonAero btnRegistrar;
    private org.edisoncor.gui.button.ButtonAero btnsSalir;
    private org.edisoncor.gui.button.ButtonAero buttonAero3;
    private org.edisoncor.gui.button.ButtonAero buttonAero4;
    private org.edisoncor.gui.button.ButtonAero buttonAero5;
    private org.edisoncor.gui.button.ButtonAero buttonAero6;
    private org.edisoncor.gui.button.ButtonAeroLeft buttonAeroLeft1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel men;
    // End of variables declaration//GEN-END:variables
}
