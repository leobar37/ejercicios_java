

import TListas.TLista;
import TListas.TListaDin;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import logicaNegocio.Docente;

public class FrmMayorTiempo extends javax.swing.JInternalFrame {

    Docente objDocente;

    public FrmMayorTiempo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMayores = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Docente con Doctorado, mayor tiempo en la Docencia");
        setToolTipText("");

        jScrollPane1.setAutoscrolls(true);

        tblMayores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblMayores.setEnabled(false);
        tblMayores.setShowHorizontalLines(false);
        tblMayores.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblMayores);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setText("Docente con Doctorado con Mayor Tiempo de Docencia");

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnSalir.setText("salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 342, Short.MAX_VALUE)
                        .addComponent(btnSalir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListar)
                    .addComponent(btnSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("NOMBRE");
        modelo.addColumn("NIVEL DE ESTUDIOS");
        modelo.addColumn("CARRERA PROFESIONAL");
        modelo.addColumn("TIEMPO DOCENCIA");

        TLista LD = new TListaDin();
        try {
            LD = Docente.consultarMayorTiempo();
        } catch (Exception ex) {
            Logger.getLogger(FrmMayorTiempo.class.getName()).log(Level.SEVERE, null, ex);
        }

        Object datos[][] = new Object[1][4];

        for (int i = 0; i < LD.Cantidad(); i++) {
            objDocente = (Docente) LD.Obtener(i);
            datos[0][0] = objDocente.getNombre();
            datos[0][1] = objDocente.getNivelEstudios();
            datos[0][2] = objDocente.getCarrera();
            datos[0][3] = objDocente.getTiempoDocencia();
            modelo.addRow(datos[0]);

        }

        this.tblMayores.setModel(modelo);
        this.tblMayores.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        this.tblMayores.getColumnModel().getColumn(0).setPreferredWidth(120);
        this.tblMayores.getColumnModel().getColumn(1).setPreferredWidth(120);
        this.tblMayores.getColumnModel().getColumn(2).setPreferredWidth(120);
        this.tblMayores.getColumnModel().getColumn(3).setPreferredWidth(120);

    }//GEN-LAST:event_btnListarActionPerformed

private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    dispose();
}//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMayores;
    // End of variables declaration//GEN-END:variables
}
