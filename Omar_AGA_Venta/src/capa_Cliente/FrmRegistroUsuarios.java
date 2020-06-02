/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa_Cliente;

import capa_datos.Hash;
import capa_datos.SqlUsuarios;
import capa_negocio.Usuario;

import javax.swing.JOptionPane;

/**
 *
 * @author JOSE
 */
public class FrmRegistroUsuarios extends javax.swing.JDialog {

    private int idusuario = 0;

    public FrmRegistroUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        Alternos.Alternos.limitarTeclado(txtDni);
        SqlUsuarios sqlUs = new SqlUsuarios();
        sqlUs.TablaUsuarios(tabla);
        this.setResizable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        titleBar1 = new org.edisoncor.gui.varios.TitleBar();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        panelRegistro = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cboTipo_usuario = new javax.swing.JComboBox();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jpassContraseña = new javax.swing.JPasswordField();
        jpassConContrasela = new javax.swing.JPasswordField();
        btnRegistrar = new org.edisoncor.gui.button.ButtonAero();
        jLabel2 = new javax.swing.JLabel();
        buttonAero1 = new org.edisoncor.gui.button.ButtonAero();
        jSeparator1 = new javax.swing.JSeparator();
        buttonAero2 = new org.edisoncor.gui.button.ButtonAero();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnActualiza = new org.edisoncor.gui.button.ButtonAero();
        btnLimpiar = new org.edisoncor.gui.button.ButtonAero();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Registro de Usuarios");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 10, 357, 43);
        jPanel1.add(titleBar1);
        titleBar1.setBounds(432, 499, -1, 20);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login_1.png"))); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel1.add(panelImage1);
        panelImage1.setBounds(150, 60, 210, 200);

        panelRegistro.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("tipo de usario:");

        cboTipo_usuario.setBackground(new java.awt.Color(255, 255, 255));
        cboTipo_usuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cboTipo_usuario.setForeground(new java.awt.Color(0, 0, 0));
        cboTipo_usuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Trabajador", "Administrador" }));
        cboTipo_usuario.setSelectedIndex(-1);

        txtNombreUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNombreUsuario.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre de usuario:");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Dni:");

        txtDni.setBackground(new java.awt.Color(255, 255, 255));
        txtDni.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDni.setForeground(new java.awt.Color(0, 0, 0));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nombre:");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("contraseña:");

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("cofirmar contraseña:");

        jpassContraseña.setBackground(new java.awt.Color(255, 255, 255));
        jpassContraseña.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jpassContraseña.setForeground(new java.awt.Color(0, 0, 0));

        jpassConContrasela.setBackground(new java.awt.Color(255, 255, 255));
        jpassConContrasela.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jpassConContrasela.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelRegistroLayout = new javax.swing.GroupLayout(panelRegistro);
        panelRegistro.setLayout(panelRegistroLayout);
        panelRegistroLayout.setHorizontalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpassContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(jpassConContrasela))
                        .addGap(12, 12, 12))
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(14, 14, 14)
                        .addComponent(cboTipo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRegistroLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7)
                        .addComponent(jLabel9))
                    .addGap(18, 18, 18)
                    .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelRegistroLayout.setVerticalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroLayout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboTipo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jpassContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jpassConContrasela, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRegistroLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)
                    .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(169, Short.MAX_VALUE)))
        );

        jPanel1.add(panelRegistro);
        panelRegistro.setBounds(20, 280, 429, 310);

        btnRegistrar.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar);
        btnRegistrar.setBounds(10, 620, 100, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usuarios Registrados");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(670, 10, 380, 50);

        buttonAero1.setBackground(new java.awt.Color(0, 0, 0));
        buttonAero1.setText("Modificar");
        buttonAero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAero1ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAero1);
        buttonAero1.setBounds(120, 620, 100, 40);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(470, 0, 20, 700);

        buttonAero2.setBackground(new java.awt.Color(0, 0, 0));
        buttonAero2.setText("Eliminar");
        buttonAero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAero2ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAero2);
        buttonAero2.setBounds(230, 620, 100, 40);

        tabla.setBackground(new java.awt.Color(255, 255, 255));
        tabla.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tabla.setForeground(new java.awt.Color(0, 0, 0));
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

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(510, 90, 650, 540);

        btnActualiza.setBackground(new java.awt.Color(0, 0, 0));
        btnActualiza.setText("Actualizar");
        btnActualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizaActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualiza);
        btnActualiza.setBounds(1020, 640, 117, 33);

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar);
        btnLimpiar.setBounds(340, 620, 110, 40);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setForeground(new java.awt.Color(0, 0, 0));
        jMenu2.setText("Menu");
        jMenu2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("cambiar contraseña");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1183, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        SqlUsuarios consulta = new SqlUsuarios();
        Usuario usuario = new Usuario();
        int tipo_usuario;

        boolean cajasVer = Alternos.Alternos.Probar(panelRegistro);
        if (cajasVer) {
            String contraseña = new String(jpassContraseña.getPassword());
            String confirm = new String(jpassConContrasela.getPassword());
            if (contraseña.equals(confirm)) {
                if (consulta.Verificar(txtNombreUsuario.getText()) == 0) {
                    usuario.setNombre(txtNombre.getText());
                    String nueva_contraseña = Hash.md5(confirm);
                    String tipo = cboTipo_usuario.getSelectedItem().toString();
                    if (tipo.equalsIgnoreCase("administrador")) {
                        tipo_usuario = 1;
                    } else {
                        tipo_usuario = 2;
                    }
                    usuario.setContraseña(nueva_contraseña);
                    usuario.setDni(txtDni.getText());
                    usuario.setTipo_usuario(tipo_usuario);
                    usuario.setNombre_Usuario(txtNombreUsuario.getText());
                    if (consulta.RegistrarUsuario(usuario)) {
                        JOptionPane.showMessageDialog(null, "usuario registrado");
                        Alternos.Alternos.LimpiarCajas(panelRegistro);
                    } else {
                        JOptionPane.showMessageDialog(null, "ha ocurrido un error");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error nombre de usuario ya esxiste");
                }

            } else {
                JOptionPane.showMessageDialog(null, "las contraseñas no coinciden");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Existes campos vacios o la contraseña es muy corta");
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnActualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizaActionPerformed
        SqlUsuarios consulta = new SqlUsuarios();
        consulta.TablaUsuarios(tabla);

    }//GEN-LAST:event_btnActualizaActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila = tabla.getSelectedRow();
        idusuario = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
        String nombre = tabla.getValueAt(fila, 1).toString();
        String dni = tabla.getValueAt(fila, 2).toString();
        String usuario = tabla.getValueAt(fila, 3).toString();
        String tipo = tabla.getValueAt(fila, 5).toString();
        txtNombre.setText(nombre);
        txtDni.setText(dni);
        txtNombreUsuario.setText(usuario);
        cboTipo_usuario.setSelectedItem(tipo);

    }//GEN-LAST:event_tablaMouseClicked

    private void buttonAero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAero2ActionPerformed
        SqlUsuarios consulta = new SqlUsuarios();
        if (idusuario == 0) {
            JOptionPane.showMessageDialog(null, "no se ha seleccionado un usuario");
        } else {
            int re = JOptionPane.showConfirmDialog(panelImage1, "esta seguro de eliminar este usuario", "Registro de usuarios", JOptionPane.OK_OPTION);
            if (re == 0) {
                consulta.eliminar(idusuario);
                Alternos.Alternos.LimpiarCajas(panelRegistro);
            }
        }
    }//GEN-LAST:event_buttonAero2ActionPerformed

    private void buttonAero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAero1ActionPerformed

        if (idusuario == 0) {
            JOptionPane.showMessageDialog(null, "Tiene que seleccionar un usuario");
        } else {
            if (Alternos.Alternos.Probar(panelRegistro)) {
                Usuario us = new Usuario();
                int tipo_usuario;
                String password = new String(jpassContraseña.getPassword());
                String confirmpassword = new String(jpassConContrasela.getPassword());
                if (password.equals(confirmpassword)) {
                    String nueva_contraseña = Hash.md5(password);
                    us.setContraseña(nueva_contraseña);
                    us.setNombre(txtNombre.getText());
                    String tipo = cboTipo_usuario.getSelectedItem().toString();
                    if (tipo.equalsIgnoreCase("administrador")) {
                        tipo_usuario = 1;
                    } else {
                        tipo_usuario = 2;
                    }
                    us.setTipo_usuario(tipo_usuario);
                    us.setDni(txtDni.getText());
                    us.setNombre_Usuario(txtNombreUsuario.getText());
                    SqlUsuarios consulta = new SqlUsuarios();
                    if (consulta.Modificar(idusuario, us)) {
                        JOptionPane.showMessageDialog(null, "se ha modificado un este usuario");
                        Alternos.Alternos.LimpiarCajas(panelRegistro);
                    } else {
                        JOptionPane.showMessageDialog(null, "no se ha modificado un este usuario");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Existen campos vacios");
            }

        }

    }//GEN-LAST:event_buttonAero1ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Alternos.Alternos.LimpiarCajas(panelRegistro);
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmRegistroUsuarios dialog = new FrmRegistroUsuarios(new javax.swing.JFrame(), true);
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
    private org.edisoncor.gui.button.ButtonAero btnActualiza;
    private org.edisoncor.gui.button.ButtonAero btnLimpiar;
    private org.edisoncor.gui.button.ButtonAero btnRegistrar;
    private org.edisoncor.gui.button.ButtonAero buttonAero1;
    private org.edisoncor.gui.button.ButtonAero buttonAero2;
    private javax.swing.JComboBox cboTipo_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField jpassConContrasela;
    private javax.swing.JPasswordField jpassContraseña;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JTable tabla;
    private org.edisoncor.gui.varios.TitleBar titleBar1;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
