

import TListas.TLista;
import TListas.TListaDin;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import logicaNegocio.Docente;

public class FrmCarreraProfesional extends javax.swing.JInternalFrame {

    static FrmCarreraProfesional objFrmCarreraProfesional;

    Docente objDocente;

    public FrmCarreraProfesional() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarreraProfesional = new javax.swing.JTable();
        btnMostrar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        cboCarreraProfesional = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Carrera Profesional en la que Dicta");

        tblCarreraProfesional.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblCarreraProfesional.setAutoscrolls(false);
        jScrollPane1.setViewportView(tblCarreraProfesional);

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        cboCarreraProfesional.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Sistemas y Computación", "Ingeniería Electronica", "Medicina Humana", "Ingeniería Civil" }));

        jLabel1.setText("Carrera Profesional: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cboCarreraProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnMostrar)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(212, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addGap(197, 197, 197))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboCarreraProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCerrar)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("NOMBRE");
        modelo.addColumn("NIVEL DE ESTUDIO");
        modelo.addColumn("CARRERA PROFESIONAL");

        String carrera = cboCarreraProfesional.getSelectedItem().toString();

        TLista LD = new TListaDin(); // Especifica que la variable LD es una lista dinamica

        try {
            LD = Docente.ListarCarrera(carrera);
        } catch (Exception ex) {
            Logger.getLogger(FrmCarreraProfesional.class.getName()).log(Level.SEVERE, null, ex);
        }

        Object datos[][] = new Object[1][3];

        for (int i = 0; i < LD.Cantidad(); i++) {
            objDocente = (Docente) LD.Obtener(i);
            datos[0][0] = objDocente.getNombre();
            datos[0][1] = objDocente.getNivelEstudios();
            datos[0][2] = objDocente.getCarrera();
            modelo.addRow(datos[0]);

        }

        this.tblCarreraProfesional.setModel(modelo);
        
        this.tblCarreraProfesional.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        this.tblCarreraProfesional.getColumnModel().getColumn(0).setPreferredWidth(120); //NOMBRE
        this.tblCarreraProfesional.getColumnModel().getColumn(1).setPreferredWidth(40); //NIVEL ESTUDIO
        this.tblCarreraProfesional.getColumnModel().getColumn(2).setPreferredWidth(100); //CARRERA PROFESIONAL

    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JComboBox cboCarreraProfesional;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCarreraProfesional;
    // End of variables declaration//GEN-END:variables
}
