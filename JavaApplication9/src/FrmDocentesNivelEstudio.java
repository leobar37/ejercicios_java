


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import logicaNegocio.Docente;

public class FrmDocentesNivelEstudio extends javax.swing.JInternalFrame {

    
    public FrmDocentesNivelEstudio() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblNiveles = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Número de Docentes por Nivel de Estudio");

        tblNiveles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblNiveles);

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMostrar)
                        .addGap(67, 67, 67)
                        .addComponent(btnCerrar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar)
                    .addComponent(btnMostrar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed

        DefaultTableModel modelo = new DefaultTableModel();
        int  cNivel[] = new int [3];
        
        try {
            cNivel = Docente.docentesNivelEstudios();
        } catch (Exception ex) {
            Logger.getLogger(FrmDocentesNivelEstudio.class.getName()).log(Level.SEVERE, null, ex);
        }

        modelo.addColumn("Título");
        modelo.addColumn("Maestría");
        modelo.addColumn("Doctorado");

        Object datos[][] = new Object[1][3];

        datos[0][0] = cNivel[0];
        datos[0][1] = cNivel[1];
        datos[0][2] = cNivel[2];
        
        modelo.addRow(datos[0]); // IMPRIME LA FILA EN LA TABLA

        this.tblNiveles.setModel(modelo);
        
        this.tblNiveles.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        this.tblNiveles.getColumnModel().getColumn(0).setPreferredWidth(80); //TITULO
        this.tblNiveles.getColumnModel().getColumn(1).setPreferredWidth(80); //MAESTRIA
        this.tblNiveles.getColumnModel().getColumn(2).setPreferredWidth(80); //DOCTORADO
    }//GEN-LAST:event_btnMostrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNiveles;
    // End of variables declaration//GEN-END:variables
}
