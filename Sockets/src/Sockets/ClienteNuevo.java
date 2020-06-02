/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sockets;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author JOSE
 */
public class ClienteNuevo extends javax.swing.JFrame implements Runnable{
 private String clave = "soyadminxd";
   DefaultListModel modelo = new DefaultListModel();
    public ClienteNuevo() {
        initComponents();
        ListaChat1.setModel(modelo);
        Thread hilo = new Thread(this);
         hilo.start();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jLabel4 = new javax.swing.JLabel();
        TxtNick = new javax.swing.JTextField();
        btnServidor = new org.edisoncor.gui.button.ButtonAero();
        jLabel5 = new javax.swing.JLabel();
        txtipServidor = new javax.swing.JTextField();
        btnEmpezar = new org.edisoncor.gui.button.ButtonAero();
        panelChat = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIp1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaChat1 = new javax.swing.JList();
        txtEnvio1 = new javax.swing.JTextField();
        buttonAeroLeft2 = new org.edisoncor.gui.button.ButtonAeroLeft();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(null);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Icono.png"))); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        panel.add(panelImage1);
        panelImage1.setBounds(-10, 0, 180, 210);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nick");
        panel.add(jLabel4);
        jLabel4.setBounds(180, 40, 41, 16);

        TxtNick.setBackground(new java.awt.Color(255, 255, 255));
        TxtNick.setForeground(new java.awt.Color(0, 0, 0));
        panel.add(TxtNick);
        TxtNick.setBounds(250, 40, 120, 24);

        btnServidor.setBackground(new java.awt.Color(0, 0, 0));
        btnServidor.setText("servidor");
        btnServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServidorActionPerformed(evt);
            }
        });
        panel.add(btnServidor);
        btnServidor.setBounds(420, 30, 100, 33);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Servidor");
        panel.add(jLabel5);
        jLabel5.setBounds(170, 100, 80, 24);

        txtipServidor.setBackground(new java.awt.Color(255, 255, 255));
        txtipServidor.setForeground(new java.awt.Color(0, 0, 0));
        panel.add(txtipServidor);
        txtipServidor.setBounds(260, 100, 110, 24);

        btnEmpezar.setBackground(new java.awt.Color(0, 0, 0));
        btnEmpezar.setText("Empezar");
        btnEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpezarActionPerformed(evt);
            }
        });
        panel.add(btnEmpezar);
        btnEmpezar.setBounds(230, 150, 80, 33);

        panelChat.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("chat");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Comunicarme con:");

        txtIp1.setBackground(new java.awt.Color(255, 255, 255));
        txtIp1.setForeground(new java.awt.Color(0, 0, 0));

        ListaChat1.setBackground(new java.awt.Color(255, 255, 255));
        ListaChat1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ListaChat1.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(ListaChat1);

        txtEnvio1.setBackground(new java.awt.Color(255, 255, 255));
        txtEnvio1.setForeground(new java.awt.Color(0, 0, 0));

        buttonAeroLeft2.setBackground(new java.awt.Color(0, 0, 0));
        buttonAeroLeft2.setText("Enviar");
        buttonAeroLeft2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAeroLeft2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelChatLayout = new javax.swing.GroupLayout(panelChat);
        panelChat.setLayout(panelChatLayout);
        panelChatLayout.setHorizontalGroup(
            panelChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChatLayout.createSequentialGroup()
                .addGroup(panelChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelChatLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(txtEnvio1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(buttonAeroLeft2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelChatLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(panelChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelChatLayout.createSequentialGroup()
                    .addGap(10, 60, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(txtIp1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelChatLayout.setVerticalGroup(
            panelChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelChatLayout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(panelChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnvio1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAeroLeft2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(panelChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelChatLayout.createSequentialGroup()
                    .addGap(0, 14, Short.MAX_VALUE)
                    .addGroup(panelChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelChatLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelChatLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(txtIp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 242, Short.MAX_VALUE)))
        );

        panel.add(panelChat);
        panelChat.setBounds(10, 210, 510, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServidorActionPerformed
       String pas =   JOptionPane.showInputDialog("digite clave");
       if(pas.equalsIgnoreCase(clave)){
           Servidor  obj = new Servidor();
         obj.setVisible(true);
   
       }else{
           JOptionPane.showMessageDialog(null, "tu no puedes acceder aqui xd");
       }
         
       
    }//GEN-LAST:event_btnServidorActionPerformed

    private void buttonAeroLeft2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAeroLeft2ActionPerformed
     try {
         Socket misocker = new Socket(txtipServidor.getText(),9999);
         ObjectOutputStream flujo_salida = new ObjectOutputStream(misocker.getOutputStream());
         Paquete_Salida obj = new Paquete_Salida(txtEnvio1.getText(),txtIp1.getText(), TxtNick.getText());
         flujo_salida.writeObject(obj);
         flujo_salida.close();
         misocker.close();
         
         
     } catch (IOException ex) {
         Logger.getLogger(ClienteNuevo.class.getName()).log(Level.SEVERE, null, ex);
     }
    
    }//GEN-LAST:event_buttonAeroLeft2ActionPerformed

    private void btnEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpezarActionPerformed
       
    }//GEN-LAST:event_btnEmpezarActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteNuevo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList ListaChat1;
    private javax.swing.JTextField TxtNick;
    private org.edisoncor.gui.button.ButtonAero btnEmpezar;
    private org.edisoncor.gui.button.ButtonAero btnServidor;
    private org.edisoncor.gui.button.ButtonAeroLeft buttonAeroLeft2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelChat;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JTextField txtEnvio1;
    private javax.swing.JTextField txtIp1;
    private javax.swing.JTextField txtipServidor;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
            try {
            ServerSocket serverEscucha = new ServerSocket(9090);
              while(true){
              Socket recibido = serverEscucha.accept();
             ObjectInputStream flujo_Entrada = new ObjectInputStream(recibido.getInputStream());
             Paquete_Salida objRecibi ;
             objRecibi = (Paquete_Salida)flujo_Entrada.readObject();
             String mensaje = objRecibi.getName() + " : "+objRecibi.getMensaje();
             modelo.addElement(mensaje);
             flujo_Entrada.close();
             recibido.close();
              }
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
