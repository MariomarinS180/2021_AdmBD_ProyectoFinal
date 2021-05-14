/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VentanaInicio extends javax.swing.JFrame {

    public VentanaInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        labelImagenDosOpc.setEnabled(false);
        labelImagenDosOpc.setVisible(false);
        labelCerrarSesion.setEnabled(false);
        labelCerrarSesion.setVisible(false);            
    }
    public Icon icono(String path, int width, int heigth){
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path))
        .getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img; 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelCerrarSesion = new javax.swing.JLabel();
        labelSet2 = new javax.swing.JLabel();
        labelSet1 = new javax.swing.JLabel();
        labelImagenDosOpc = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCerrarSesionMouseClicked(evt);
            }
        });
        jPanel1.add(labelCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 130, 30));

        labelSet2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSet2MouseClicked(evt);
            }
        });
        jPanel1.add(labelSet2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 70, 40));

        labelSet1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSet1MouseClicked(evt);
            }
        });
        jPanel1.add(labelSet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 70, 40));

        labelImagenDosOpc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/configuracion.jpg"))); // NOI18N
        jPanel1.add(labelImagenDosOpc, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Diseño menú.jpg"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelSet1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSet1MouseClicked
       labelImagenDosOpc.setEnabled(false);
       labelImagenDosOpc.setVisible(false);
       labelCerrarSesion.setEnabled(false);
       labelCerrarSesion.setVisible(false);
       labelSet1.setEnabled(false);
       labelSet1.setVisible(false);
       labelSet2.setEnabled(true);
       labelSet2.setVisible(true);
    }//GEN-LAST:event_labelSet1MouseClicked

    private void labelSet2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSet2MouseClicked
       labelImagenDosOpc.setEnabled(true);
       labelImagenDosOpc.setVisible(true);
       labelCerrarSesion.setEnabled(true);
       labelCerrarSesion.setVisible(true);
       labelSet1.setEnabled(true);
       labelSet1.setVisible(true);
       labelSet2.setEnabled(false);
       labelSet2.setVisible(false);
       
    }//GEN-LAST:event_labelSet2MouseClicked

    private void labelCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCerrarSesionMouseClicked
        Loggin vi = new Loggin(); 
        vi.setVisible(true);
        setVisible(false);
        JOptionPane.showMessageDialog(getParent(), "SE CERRÓ SESIÓN CORRECTAMENTE", "ADIÓS:(", JOptionPane.INFORMATION_MESSAGE, icono("/Imagenes/iconoCorrecto.png",50,50));
    }//GEN-LAST:event_labelCerrarSesionMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCerrarSesion;
    private javax.swing.JLabel labelImagenDosOpc;
    private javax.swing.JLabel labelSet1;
    private javax.swing.JLabel labelSet2;
    // End of variables declaration//GEN-END:variables
}
