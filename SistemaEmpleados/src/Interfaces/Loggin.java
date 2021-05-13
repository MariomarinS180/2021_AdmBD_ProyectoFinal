/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;

/**
 *
 * @author marin
 */
public class Loggin extends javax.swing.JFrame {
    private Connection con;
    private ResultSet rs;
    private PreparedStatement pst;

    public Loggin() {
        initComponents();
        this.setLocationRelativeTo(null);
        iconoEnBD(); 
    }
    public void iconoEnBD() {
        URL url = getClass().getResource("/imagenes/ICONOENBD.png");
        ImageIcon icono = new ImageIcon(url);
        setIconImage(icono.getImage());
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonIniciarSesion = new javax.swing.JButton();
        botonRegistrarse = new javax.swing.JButton();
        cajaUsuario = new javax.swing.JTextField();
        cajaContrasenia = new javax.swing.JPasswordField();
        imagenEyeOp = new javax.swing.JLabel();
        imagenEyeClo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INCIO DE SESIÓN");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonIniciarSesion.setText("INICIAR SESIÓN");
        botonIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonIniciarSesionMouseClicked(evt);
            }
        });
        jPanel1.add(botonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        botonRegistrarse.setText("REGISTRARSE");
        botonRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegistrarseMouseClicked(evt);
            }
        });
        jPanel1.add(botonRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 100, 20));

        cajaUsuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cajaUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaUsuario.setToolTipText("");
        cajaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaUsuarioActionPerformed(evt);
            }
        });
        cajaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaUsuarioKeyTyped(evt);
            }
        });
        jPanel1.add(cajaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 180, 40));

        cajaContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaContraseniaActionPerformed(evt);
            }
        });
        jPanel1.add(cajaContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 180, 40));

        imagenEyeOp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ojoAbierto.png"))); // NOI18N
        imagenEyeOp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenEyeOpMouseClicked(evt);
            }
        });
        jPanel1.add(imagenEyeOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 30, 20));

        imagenEyeClo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ojoCerrado.png"))); // NOI18N
        imagenEyeClo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenEyeCloMouseClicked(evt);
            }
        });
        jPanel1.add(imagenEyeClo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 30, 20));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/interfazLog.jpg"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaUsuarioActionPerformed

    private void cajaContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaContraseniaActionPerformed

    private void cajaUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaUsuarioKeyTyped
        if(cajaUsuario.getText().length() == 11){
            JOptionPane.showMessageDialog(getParent(), "MÁXIMO 10 CARACTERES", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            evt.consume();
        }
        
    }//GEN-LAST:event_cajaUsuarioKeyTyped

    private void imagenEyeOpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenEyeOpMouseClicked
        imagenEyeClo.setVisible(true);
        imagenEyeClo.setEnabled(true);
        cajaContrasenia.setEchoChar((char)0);
        imagenEyeOp.setVisible(false);
        imagenEyeOp.setEnabled(false);
    }//GEN-LAST:event_imagenEyeOpMouseClicked

    private void imagenEyeCloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenEyeCloMouseClicked
        imagenEyeOp.setVisible(true);
        imagenEyeOp.setEnabled(true);
        cajaContrasenia.setEchoChar((char)8226);
        imagenEyeClo.setVisible(false);
        imagenEyeClo.setEnabled(false);
    }//GEN-LAST:event_imagenEyeCloMouseClicked

    private void botonRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistrarseMouseClicked
        LogginRegistrar lr = new LogginRegistrar(); 
        lr.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_botonRegistrarseMouseClicked

    private void botonIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarSesionMouseClicked
       String user = cajaUsuario.getText();
        String password = cajaContrasenia.getText();
        if (user.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(getParent(), "DEBE INGRESAR LOS DATOS", "INICIO SESIÓN", JOptionPane.CLOSED_OPTION);
        } else {
            try {
                con =  sistemaempleados.ConexionSQLServer.getConnection(); 
                pst = con.prepareStatement("SELECT * FROM usuariossss WHERE usuario=? and contrasenia=?");
                pst.setString(1, user);
                pst.setString(2, password);
                rs = pst.executeQuery();
                if (rs.next()) {
                    VentanaInicio vi = new VentanaInicio();
                    vi.setVisible(true);
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(getParent(), "NO ESTÁ DADO DE ALTA", "FALLO AL INICIAR SESIÓN", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(getParent(), "DEBE REGISTRARSE", "FALLO AL INICIAR SESIÓN", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_botonIniciarSesionMouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loggin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciarSesion;
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JPasswordField cajaContrasenia;
    private javax.swing.JTextField cajaUsuario;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel imagenEyeClo;
    private javax.swing.JLabel imagenEyeOp;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
