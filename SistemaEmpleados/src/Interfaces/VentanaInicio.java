/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistemaempleados.ConexionSQLServer;

public class VentanaInicio extends javax.swing.JFrame {
     ResultSet rs;

    public VentanaInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        tablaEmpleados();
        labelImagenDosOpc.setEnabled(false);
        labelImagenDosOpc.setVisible(false);
        labelCerrarSesion.setEnabled(false);
        labelCerrarSesion.setVisible(false);  
        labelIniciarSesion.setEnabled(false);
        labelIniciarSesion.setVisible(false);  
    }
    public Icon icono(String path, int width, int heigth){
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path))
        .getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img; 
    }
    public void tablaEmpleados(){
        DefaultTableModel modelo = (DefaultTableModel) tablaVistaEmpleados.getModel(); 
        modelo.setRowCount(0);
        rs = sistemaempleados.ConexionSQLServer.Consulta("SELECT * FROM employees");
        try {
            while (rs.next()) {                
                Vector v = new Vector();               
                v.add(rs.getInt(1)); 
                v.add(rs.getString(2));
                v.add(rs.getString(3)); 
                v.add(rs.getString(4));
                v.add(rs.getString(5)); 
                modelo.addRow(v);
                tablaVistaEmpleados.setModel(modelo);
            }
        } catch (Exception e) {
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVistaEmpleados = new javax.swing.JTable();
        labelBusqueda = new javax.swing.JLabel();
        labelAgregarUsuario = new javax.swing.JLabel();
        labelIniciarSesion = new javax.swing.JLabel();
        labelCerrarSesion = new javax.swing.JLabel();
        labelSet2 = new javax.swing.JLabel();
        labelSet1 = new javax.swing.JLabel();
        labelImagenDosOpc = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaVistaEmpleados.setBackground(new java.awt.Color(153, 204, 255));
        tablaVistaEmpleados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaVistaEmpleados.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaVistaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Titulo", "Fecha Contratación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaVistaEmpleados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 570, 110));

        labelBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBusquedaMouseClicked(evt);
            }
        });
        jPanel1.add(labelBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 120, 40));

        labelAgregarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuEmpleado.png"))); // NOI18N
        labelAgregarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAgregarUsuarioMouseClicked(evt);
            }
        });
        jPanel1.add(labelAgregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 180, 170));

        labelIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelIniciarSesionMouseClicked(evt);
            }
        });
        jPanel1.add(labelIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 130, 40));

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

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DiseñoMenuDesplegable.jpg"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 440));

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
       labelIniciarSesion.setEnabled(false);
       labelIniciarSesion.setVisible(false);  
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
       labelIniciarSesion.setEnabled(true);
       labelIniciarSesion.setVisible(true);  
       labelSet1.setEnabled(true);
       labelSet1.setVisible(true);
       labelSet2.setEnabled(false);
       labelSet2.setVisible(false);
       
    }//GEN-LAST:event_labelSet2MouseClicked

    private void labelCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCerrarSesionMouseClicked
        Loggin vi = new Loggin(); 
        vi.setVisible(true);
        setVisible(false);
        JOptionPane.showMessageDialog(getParent(), "SE CERRÓ SESIÓN CORRECTAMENTE", "ADIÓS:(", JOptionPane.INFORMATION_MESSAGE, icono("/Imagenes/iconoCerrarSesion.png",50,50));
    }//GEN-LAST:event_labelCerrarSesionMouseClicked

    private void labelIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelIniciarSesionMouseClicked
       LogginRegistrar lg = new LogginRegistrar(); 
       lg.setVisible(true);
       setVisible(false); 
       JOptionPane.showMessageDialog(getParent(), "CREACIÓN DE USUARIO NUEVO", "BIENVENIDO", JOptionPane.INFORMATION_MESSAGE, icono("/Imagenes/iconoCrearUsuario.png",50,50));
    }//GEN-LAST:event_labelIniciarSesionMouseClicked

    private void labelAgregarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAgregarUsuarioMouseClicked
       VentanaEmpleados ve = new VentanaEmpleados(); 
       ve.setVisible(true);
       setVisible(false);  
    }//GEN-LAST:event_labelAgregarUsuarioMouseClicked

    private void labelBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBusquedaMouseClicked
        VentanaConsultas ve = new VentanaConsultas();
       ve.setVisible(true);
       setVisible(false);  
        
    }//GEN-LAST:event_labelBusquedaMouseClicked

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAgregarUsuario;
    private javax.swing.JLabel labelBusqueda;
    private javax.swing.JLabel labelCerrarSesion;
    private javax.swing.JLabel labelImagenDosOpc;
    private javax.swing.JLabel labelIniciarSesion;
    private javax.swing.JLabel labelSet1;
    private javax.swing.JLabel labelSet2;
    private javax.swing.JTable tablaVistaEmpleados;
    // End of variables declaration//GEN-END:variables
}
