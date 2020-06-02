/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa_cliente;

import capa_datos.ListaUnio_pi;
import capa_negocio.Investigador;
import capa_negocio.Proyecto;
import capa_negocio.Union_PI;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JOSE
 */
public class FrmProyectoxInvestigador extends javax.swing.JInternalFrame {

   
    public FrmProyectoxInvestigador() {
        initComponents();
        DefaultComboBoxModel modelo1 = new DefaultComboBoxModel();
        cboInevstigador.setModel(modelo1);
        LLenarCbo(modelo1, Investigador.Consultar());
    }
   public void LLenarCbo(DefaultComboBoxModel ex, TListas.TLista lista) {
        for (int i = 0; i < lista.Cantidad(); i++) {
            Object obj = lista.Obtener(i);
            ex.addElement(obj);
        }
   }    
  private void TablaProyecto(String codiInves){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("titulo");
        modelo.addColumn("linea");
        modelo.addColumn("duración");
        TListas.TLista lista = ListaUnio_pi.BuscarInvestigador(codiInves);
        Object fila[] = new Object[3];
        for (int i = 0; i < lista.Cantidad(); i++) {
            Proyecto objProyecto = (Proyecto) lista.Obtener(i);
            fila[0] = objProyecto.getTitulo();
            fila[1] = objProyecto.getLinea_Investigacion();
            fila[2]= objProyecto.getDuracion();
           modelo.addRow(fila);
        }
        tablaProyectos.setModel(modelo);     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProyectos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cboInevstigador = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        tablaProyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaProyectos);

        jLabel1.setText("proyectos por Investigador:");

        cboInevstigador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Mostrar");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboInevstigador, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboInevstigador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Investigador objInvestigador = (Investigador) cboInevstigador.getSelectedItem();
        TablaProyecto(objInvestigador.getCodInvestigador());
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboInevstigador;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProyectos;
    // End of variables declaration//GEN-END:variables
}
