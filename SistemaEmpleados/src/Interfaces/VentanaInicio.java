/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
public class VentanaInicio extends javax.swing.JFrame {

    public VentanaInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        labelImagenDosOpc.setEnabled(false);
        labelImagenDosOpc.setVisible(false);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelConfiguracion = new javax.swing.JLabel();
        labelImagenDosOpc = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelConfiguracionMouseClicked(evt);
            }
        });
        jPanel1.add(labelConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 70, 40));

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

    private void labelConfiguracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConfiguracionMouseClicked
       labelImagenDosOpc.setEnabled(true);
       labelImagenDosOpc.setVisible(true);
    }//GEN-LAST:event_labelConfiguracionMouseClicked

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
    private javax.swing.JLabel labelConfiguracion;
    private javax.swing.JLabel labelImagenDosOpc;
    // End of variables declaration//GEN-END:variables
}
