/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa_cliente;

import capa_datos.ListaUnio_pi;
import capa_negocio.Investigador;
import capa_negocio.Proyecto;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JOSE
 */
public class FrmxProyecto extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmxProyecto
     */
    public FrmxProyecto() {
        initComponents();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        TListas.TLista proyectos = Proyecto.Consultar();
        LLenarCbo(modelo, proyectos);
        cboProyecto.setModel(modelo);
    }
    public void LLenarCbo(DefaultComboBoxModel ex, TListas.TLista lista) {
        for (int i = 0; i < lista.Cantidad(); i++) {
            Object obj = lista.Obtener(i);
            ex.addElement(obj);
        }

    }

     private void TablaInvestigadores(String codProyecto){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("nombre");
        modelo.addColumn("edad");
        modelo.addColumn("universidad");
        TListas.TLista lista = ListaUnio_pi.BuscarProyectos(codProyecto);
        Object fila[] = new Object[3];
        for (int i = 0; i < lista.Cantidad(); i++) {
            Investigador objInvestigador = (Investigador) lista.Obtener(i);
            fila[0] = objInvestigador.getNombre();
            fila[1] = objInvestigador.getEdad();
            fila[2]= objInvestigador.getUniversidad();
           modelo.addRow(fila);
        }
        tablaInvestigadores.setModel(modelo);     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInvestigadores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cboProyecto = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        tablaInvestigadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaInvestigadores);

        jLabel1.setText("Mostrar Investigadores por Proyecto");

        cboProyecto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cboProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Proyecto objProyecto=(Proyecto) cboProyecto.getSelectedItem();
        TablaInvestigadores(objProyecto.getCodProyecto());
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboProyecto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaInvestigadores;
    // End of variables declaration//GEN-END:variables
}
