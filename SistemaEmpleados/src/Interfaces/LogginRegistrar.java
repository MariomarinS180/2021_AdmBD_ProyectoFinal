/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.net.URL;
import javax.swing.*;

/**
 *
 * @author marin
 */
public class LogginRegistrar extends javax.swing.JFrame {

    public LogginRegistrar() {
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
        botonGuardar = new javax.swing.JButton();
        cajaUsuarioRegistrar = new javax.swing.JTextField();
        cajaContraseniaRegistrar = new javax.swing.JPasswordField();
        botonRegresarReg = new javax.swing.JButton();
        fondoRegistrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGÍSTRESE :) ALV");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonGuardar.setText("GUARDAR");
        jPanel1.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 100, 20));

        cajaUsuarioRegistrar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cajaUsuarioRegistrar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaUsuarioRegistrar.setToolTipText("");
        cajaUsuarioRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaUsuarioRegistrarActionPerformed(evt);
            }
        });
        cajaUsuarioRegistrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaUsuarioRegistrarKeyTyped(evt);
            }
        });
        jPanel1.add(cajaUsuarioRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 180, 40));

        cajaContraseniaRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaContraseniaRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(cajaContraseniaRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 180, 40));

        botonRegresarReg.setBackground(new java.awt.Color(255, 255, 0));
        botonRegresarReg.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        botonRegresarReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        botonRegresarReg.setText("REGRESAR");
        botonRegresarReg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51), 2));
        botonRegresarReg.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botonRegresarReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarRegMouseClicked(evt);
            }
        });
        jPanel1.add(botonRegresarReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 120, -1));

        fondoRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/InterfazRegistrar.jpg"))); // NOI18N
        jPanel1.add(fondoRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 380));

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

    private void cajaUsuarioRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaUsuarioRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaUsuarioRegistrarActionPerformed

    private void cajaContraseniaRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaContraseniaRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaContraseniaRegistrarActionPerformed

    private void cajaUsuarioRegistrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaUsuarioRegistrarKeyTyped
        if(cajaUsuarioRegistrar.getText().length() == 11){
            JOptionPane.showMessageDialog(getParent(), "MÁXIMO 10 CARACTERES", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            evt.consume();
        }
        
    }//GEN-LAST:event_cajaUsuarioRegistrarKeyTyped

    private void botonRegresarRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarRegMouseClicked
        Loggin lo = new Loggin(); 
        lo.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_botonRegresarRegMouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogginRegistrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonRegresarReg;
    private javax.swing.JPasswordField cajaContraseniaRegistrar;
    private javax.swing.JTextField cajaUsuarioRegistrar;
    private javax.swing.JLabel fondoRegistrar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
