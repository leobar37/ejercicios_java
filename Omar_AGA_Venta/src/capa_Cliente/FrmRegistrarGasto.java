/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa_Cliente;

import TListas.TLista;
import TListas.TListaEn;
import capa_datos.SqlConsultaGasto;
import capa_negocio.Gasto;
import capa_negocio.tipo_Gasto;
import java.awt.event.ItemEvent;

import java.util.Calendar;
import java.sql.Date;
import java.util.GregorianCalendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JOSE
 */
public class FrmRegistrarGasto extends javax.swing.JDialog {

    private int idGasto = 0;
    private int idtipogasto = 0;
    private String fe = "";
    SqlConsultaGasto consultaGasto = new SqlConsultaGasto();

    public FrmRegistrarGasto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        tipo_Gasto.LLenar(modelo);
        cboTipoGasto.setModel(modelo);
        DefaultComboBoxModel modelo2 = new DefaultComboBoxModel();
        tipo_Gasto.LLenar(modelo2);
        cboTipos.setModel(modelo2);
        Alternos.Alternos.limitarTeclado(txtMonto);
        TLista lista = new TListaEn();
        lista = Gasto.Consultar();
        Tabla(lista);

    }

    public void Tabla(TLista listaPar) {
        DefaultTableModel modelo = new DefaultTableModel();
        //idGASTo,descripcion,idtipo_gasto,fecha_realizacion
        modelo.addColumn("idGasto");
        modelo.addColumn("monto");
        modelo.addColumn("nombre");
        modelo.addColumn("Fecha");
        TLista lista = new TListaEn();
        lista = listaPar;
        /*
         if (c && id != 0) {
         lista = Gasto.BuscarXtipo(id);
         System.out.println("" + id);
         } else {
         lista = Gasto.Consultar();
         }
         */
        Gasto objGasto;

        Object fila[] = new Object[4];
        for (int i = 0; i < lista.Cantidad(); i++) {
            objGasto = (Gasto) lista.Obtener(i);
            fila[0] = objGasto.getIdGasto();
            fila[1] = objGasto.getMonto();
            fila[2] = objGasto.getDescripcion();
            fila[3] = objGasto.getRealizacion();

            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelRegistro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboTipoGasto = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtnombreGasto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        btnEliminar = new org.edisoncor.gui.button.ButtonAero();
        buttonAero2 = new org.edisoncor.gui.button.ButtonAero();
        txtFecha = new javax.swing.JTextField();
        btnlimpiar = new org.edisoncor.gui.button.ButtonAero();
        btnRegistrar2 = new org.edisoncor.gui.button.ButtonAero();
        btnModificar = new org.edisoncor.gui.button.ButtonAero();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cboTipos = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnActualizar = new org.edisoncor.gui.button.ButtonAero();
        btnFiltroFecha = new org.edisoncor.gui.button.ButtonAero();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        panelRegistro.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Seleccionar Tipo de Gasto");

        cboTipoGasto.setAutoscrolls(true);
        cboTipoGasto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cboTipoGasto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTipoGastoItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Descripcion:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Monto");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fecha del Gasto");

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        buttonAero2.setBackground(new java.awt.Color(0, 0, 0));
        buttonAero2.setText("Hoy");
        buttonAero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAero2ActionPerformed(evt);
            }
        });

        btnlimpiar.setBackground(new java.awt.Color(0, 0, 0));
        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btnRegistrar2.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrar2.setText("Registrar ");
        btnRegistrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar2ActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(0, 0, 0));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRegistroLayout = new javax.swing.GroupLayout(panelRegistro);
        panelRegistro.setLayout(panelRegistroLayout);
        panelRegistroLayout.setHorizontalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelRegistroLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(cboTipoGasto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelRegistroLayout.createSequentialGroup()
                                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMonto)
                                    .addComponent(txtnombreGasto, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroLayout.createSequentialGroup()
                                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(panelRegistroLayout.createSequentialGroup()
                                                .addComponent(txtFecha)
                                                .addGap(18, 18, 18)
                                                .addComponent(buttonAero2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelRegistroLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(10, 10, 10))))))
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnRegistrar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRegistroLayout.setVerticalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboTipoGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombreGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addGap(22, 22, 22)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(buttonAero2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Gastos Registrados");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Registrar Gasto");

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Filtrar por Tipo:");

        cboTipos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cboTipos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTiposItemStateChanged(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Filtrar por Fecha:");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        btnActualizar.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizar.setText("actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnFiltroFecha.setBackground(new java.awt.Color(0, 0, 0));
        btnFiltroFecha.setText("Filtrar");
        btnFiltroFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltroFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(371, 371, 371)
                        .addComponent(btnFiltroFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(39, 39, 39)
                        .addComponent(cboTipos, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(149, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(btnFiltroFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(176, 176, 176)
                    .addComponent(jLabel7)
                    .addContainerGap(885, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel7)
                    .addContainerGap(597, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 504, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboTipoGastoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTipoGastoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (cboTipoGasto.getSelectedIndex() == 0) {
                idtipogasto = 0;
                System.out.println("" + idtipogasto);
            } else {
                tipo_Gasto tip = (tipo_Gasto) cboTipoGasto.getSelectedItem();
                idtipogasto = tip.getIdtIPO();
                System.out.println("Este es el tipo de Gasto " + idtipogasto);
            }
        }


    }//GEN-LAST:event_cboTipoGastoItemStateChanged

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (idGasto == 0) {
            JOptionPane.showMessageDialog(null, "no se ha seleccionado ningún item");

        } else {
            int rpta = JOptionPane.showConfirmDialog(null, "Desea eliminar este Gasto", "System", JOptionPane.YES_NO_CANCEL_OPTION);
            if (rpta == 0) {
                if (consultaGasto.eliminarGast(idGasto)) {
                    JOptionPane.showMessageDialog(null, "se eliminado este Gasto");
                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void buttonAero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAero2ActionPerformed
        Calendar fecha = new GregorianCalendar();
        int ano = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        fe = ano + "-" + (mes + 1) + "-" + dia;
        txtFecha.setText(fe);

    }//GEN-LAST:event_buttonAero2ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        TLista lista = new TListaEn();
        lista = Gasto.Consultar();
        Tabla(lista);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        Alternos.Alternos.LimpiarCajas(panelRegistro);
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnRegistrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar2ActionPerformed

        if (Gasto.ConsultarExistencias(txtnombreGasto.getText())) {
            if (Alternos.Alternos.Probar(panelRegistro)) {
                Gasto objGasto = new Gasto();
                String descripcion = txtnombreGasto.getText();
                float monto = Float.parseFloat(txtMonto.getText());
                objGasto.setIdTipoGasto(idtipogasto);
                objGasto.setDescripcion(descripcion);
                objGasto.setMonto(monto);
                java.sql.Date sqlFecha = java.sql.Date.valueOf(fe);
                objGasto.setRealizacion(sqlFecha);
                boolean verificado = consultaGasto.RegistrarGasto(objGasto);
                if (verificado) {
                    JOptionPane.showMessageDialog(null, "Registrado");
                    fe = "";
                    Alternos.Alternos.LimpiarCajas(panelRegistro);
                } else {
                    JOptionPane.showMessageDialog(null, "no se ha podido registrar este gasto");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Tiene que llenar todos los campos");
            }
        } else {
            /*Pendiente 
             implementar un metodo que permita modifica en vez de Registrar Sin haber seleccionado 
             un item xd    
             */
            JOptionPane.showMessageDialog(null, "Este Nombre ya existe ");
        }
        /*
         Date date = Jcalendar.getDate();
         System.out.println(date);
         long time = date.getTime();
         java.sql.Date fecha = new java.sql.Date(time);
         JOptionPane.showMessageDialog(null, "" + fecha);
         */
    }//GEN-LAST:event_btnRegistrar2ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (idtipogasto == 0) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun gasto");

        } else {

            if (Alternos.Alternos.ProbarsinJcombo(panelRegistro)) {
                int rpta = JOptionPane.showConfirmDialog(null, "Desea eliminar este Gasto", "System", JOptionPane.YES_NO_CANCEL_OPTION);
                if (rpta == 0) {
                    Gasto objGasto = new Gasto();
                    String descripcion = txtnombreGasto.getText();
                    float monto = Float.parseFloat(txtMonto.getText());
                    objGasto.setDescripcion(descripcion);

                    tipo_Gasto tip = (tipo_Gasto) cboTipoGasto.getSelectedItem();

                    int idaux = tip.getIdtIPO();
                    objGasto.setIdTipoGasto(idaux);
                    objGasto.setMonto(monto);
                    String fech = txtFecha.getText();
                    java.sql.Date sqlFecha = java.sql.Date.valueOf(fech);
                    objGasto.setRealizacion(sqlFecha);
                    boolean verificado = consultaGasto.ModificarGasto(idGasto, objGasto);

                    if (verificado) {
                        JOptionPane.showMessageDialog(null, "Se ha modificado este Gasto");
                        fe = "";
                        Alternos.Alternos.LimpiarCajas(panelRegistro);
                        idtipogasto = 0;
                    } else {
                        JOptionPane.showMessageDialog(null, "ha ocurrido un error");
                    }

                }

            } else {
                JOptionPane.showMessageDialog(null, "Tiene que llenar todos los campos");
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila = tabla.getSelectedRow();
        //idGASTo,descripcion,idtipo_gasto,fecha_realizacion
        idGasto = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
        Gasto objGasto = Gasto.buscarGasto(idGasto);
        tipo_Gasto tip = tipo_Gasto.buscarDescripcion(objGasto.getIdTipoGasto());
        System.out.println(tip.getNombre());
        cboTipoGasto.getModel().setSelectedItem(tip);

        txtnombreGasto.setText(objGasto.getDescripcion());
        txtMonto.setText(String.valueOf(objGasto.getMonto()));
        txtFecha.setText(String.valueOf(objGasto.getRealizacion()));

    }//GEN-LAST:event_tablaMouseClicked

    private void cboTiposItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTiposItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            try {
                tipo_Gasto objGasto = (tipo_Gasto) cboTipos.getSelectedItem();
                int id = objGasto.getIdtIPO();
                TLista lista = new TListaEn();
                lista = Gasto.BuscarXtipo(id);
                Tabla(lista);

            } catch (Exception ex) {
                System.err.println("Error");
            }

        }
    }//GEN-LAST:event_cboTiposItemStateChanged

    private void btnFiltroFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltroFechaActionPerformed
          
        java.util.Date fechaInicial = jfechaIncial.getDate();
       
        java.util.Date fechaFinal = jfechaFinal.getDate();
        TLista lista = new TListaEn();
        try {
            lista = Gasto.GastosEnIntervaloTiempo(fechaInicial, fechaFinal);
            Tabla(lista);
        } catch (Exception ex) {
            System.err.println("Error en lista");
        }

    }//GEN-LAST:event_btnFiltroFechaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRegistrarGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmRegistrarGasto dialog = new FrmRegistrarGasto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAero btnActualizar;
    private org.edisoncor.gui.button.ButtonAero btnEliminar;
    private org.edisoncor.gui.button.ButtonAero btnFiltroFecha;
    private org.edisoncor.gui.button.ButtonAero btnModificar;
    private org.edisoncor.gui.button.ButtonAero btnRegistrar2;
    private org.edisoncor.gui.button.ButtonAero btnlimpiar;
    private org.edisoncor.gui.button.ButtonAero buttonAero2;
    private javax.swing.JComboBox cboTipoGasto;
    private javax.swing.JComboBox cboTipos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtnombreGasto;
    // End of variables declaration//GEN-END:variables
}
