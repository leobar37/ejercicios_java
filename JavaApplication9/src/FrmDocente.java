

import TListas.*;
import capaDatos.ListaDocentes;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import logicaNegocio.Docente;


public class FrmDocente extends javax.swing.JInternalFrame {

    Docente objDocente;

    public FrmDocente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdRegistar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDocente = new javax.swing.JTable();
        cmdActualizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        cboNivelEstudios = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboCarrera = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtTiempoDocencia = new javax.swing.JTextField();
        cboSexo = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar Docente");

        cmdRegistar.setText("Registrar");
        cmdRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRegistarActionPerformed(evt);
            }
        });

        tblDocente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblDocente);

        cmdActualizar.setText("Listar Todos");
        cmdActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdActualizarActionPerformed(evt);
            }
        });

        jLabel2.setText("Edad:");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel3.setText("Sexo:");

        jLabel5.setText("Nivel de  Estudios:");

        btnSalir.setText("Cerrar");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        cboNivelEstudios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Titulo", "Maestría", "Doctorado" }));

        jLabel1.setText("Nombre:");

        jLabel6.setText("Carrera Profesional que Dicta:");

        cboCarrera.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Sistemas y Computación", "Ingeniería Electronica", "Medicina Humana", "Ingeniería Civil" }));

        jLabel4.setText("Tiempo en la Docencia:");

        cboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Femenino", "Masculino" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(cboSexo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addGap(1, 1, 1)
                                                    .addComponent(cboNivelEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(txtTiempoDocencia, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnSalir)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmdRegistar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdActualizar)))
                        .addGap(0, 96, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboNivelEstudios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTiempoDocencia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdRegistar)
                    .addComponent(cmdActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarDocente() {
        String nombre = txtNombre.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        String sexo = cboSexo.getSelectedItem().toString();
        String nivel = cboNivelEstudios.getSelectedItem().toString();
        int tiempo = Integer.parseInt(txtTiempoDocencia.getText());
        String carrera = cboCarrera.getSelectedItem().toString();

        objDocente = new Docente(nombre, sexo, edad, carrera, nivel, tiempo);
        ListaDocentes.adicionar(objDocente);

        txtNombre.setText("");
        txtEdad.setText("");
        cboSexo.setSelectedIndex(0);
        cboNivelEstudios.setSelectedIndex(0);
        txtTiempoDocencia.setText("");
        cboCarrera.setSelectedIndex(0);
        txtNombre.requestFocus();
    }

    private void cmdRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRegistarActionPerformed
        registrarDocente();
    }//GEN-LAST:event_cmdRegistarActionPerformed

    private void cmdActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdActualizarActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("NOMBRE");
        modelo.addColumn("EDAD");
        modelo.addColumn("SEXO");
        modelo.addColumn("NIVEL DE ESTUDIOS");
        modelo.addColumn("TIEMPO DE DOCENCIA");
        modelo.addColumn("CARRERA PROFESIONAL QUE DICTA");

        TLista LD = new TListaDin();

        
        try {
            LD = Docente.consultarTodos();
        } catch (Exception ex) {
            Logger.getLogger(FrmDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        Object datos[][] = new Object[1][6];

        for (int i = 0; i < LD.Cantidad(); i++) {
            objDocente = (Docente) LD.Obtener(i);
            datos[0][0] = objDocente.getNombre();
            datos[0][1] = objDocente.getEdad();
            datos[0][2] = objDocente.getSexo();
            datos[0][3] = objDocente.getNivelEstudios();
            datos[0][4] = objDocente.getTiempoDocencia();
            datos[0][5] = objDocente.getCarrera();
            modelo.addRow(datos[0]);
        }

        this.tblDocente.setModel(modelo);

        this.tblDocente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        this.tblDocente.getColumnModel().getColumn(0).setPreferredWidth(120); //NOMBRE
        this.tblDocente.getColumnModel().getColumn(1).setPreferredWidth(40); //EDAD
        this.tblDocente.getColumnModel().getColumn(2).setPreferredWidth(100); //SEXO
        this.tblDocente.getColumnModel().getColumn(3).setPreferredWidth(200); //NIVEL DE ESTUDIOS 
        this.tblDocente.getColumnModel().getColumn(4).setPreferredWidth(60); //TIEMPO DE DOCENCIA 
        this.tblDocente.getColumnModel().getColumn(5).setPreferredWidth(200); //CARRERA QUE DICTA
    }//GEN-LAST:event_cmdActualizarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if (this.txtNombre.getText().length() == 15) { // restriccion solo permite tipear 15 caracteres
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cboCarrera;
    private javax.swing.JComboBox cboNivelEstudios;
    private javax.swing.JComboBox cboSexo;
    private javax.swing.JButton cmdActualizar;
    private javax.swing.JButton cmdRegistar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDocente;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTiempoDocencia;
    // End of variables declaration//GEN-END:variables
}
