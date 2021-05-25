/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.net.URL;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marin
 */
public class VentanaConsultas extends javax.swing.JFrame {

    ResultSet rs;

    public VentanaConsultas() {
        initComponents();
        this.setLocationRelativeTo(null);
        // tablaNombres.setEnabled(false);
        // tablaNombres.setVisible(false);
        //tablaEspecialidades.setEnabled(false);
        //tablaEspecialidades.setVisible(false);
        jScrollPane1.setEnabled(false);
        jScrollPane1.setVisible(false);
        jScrollPane2.setEnabled(false);
        jScrollPane2.setVisible(false);
        jScrollPane3.setEnabled(false);
        jScrollPane3.setVisible(false);
        tablaNombres();
        tablaEspecialidad();
        tablaFecha();
        iconoEnBD();
    }
    public void iconoEnBD() {
        URL url = getClass().getResource("/imagenes/ICONOENBD.png");
        ImageIcon icono = new ImageIcon(url);
        setIconImage(icono.getImage());
    }

    public void tablaNombres() {
        DefaultTableModel modelo = (DefaultTableModel) tablaNombres.getModel();
        modelo.setRowCount(0);
        rs = sistemaempleados.ConexionSQLServer.Consulta("SELECT * FROM datos_completos WHERE nombre LIKE '" + cajaBuscar.getText() + "%'");
        try {
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getInt(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                v.add(rs.getInt(8));
                v.add(rs.getString(9));
                modelo.addRow(v);
                tablaNombres.setModel(modelo);
            }
        } catch (Exception e) {
        }
    }

    public void tablaEspecialidad() {
        DefaultTableModel modelo = (DefaultTableModel) tablaEspecialidades.getModel();
        modelo.setRowCount(0);
        rs = sistemaempleados.ConexionSQLServer.Consulta("select T.titulo, E.emp_no, E.nombre, E.apellido\n"
                + "from titles T\n"
                + "join employees E\n"
                + "on T.emp_no = E.emp_no where T.titulo LIKE '" + cajaBuscar.getText() + "%'");
        try {
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getInt(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                modelo.addRow(v);
                tablaEspecialidades.setModel(modelo);
            }
        } catch (Exception e) {
        }
    }

    public void tablaFecha() {
        DefaultTableModel modelo = (DefaultTableModel) tablaFecha.getModel();
        modelo.setRowCount(0);
        rs = sistemaempleados.ConexionSQLServer.Consulta("select * from employees where fecha_contratacion like '" + cajaBuscar.getText() + "%'");
        try {
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getInt(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                modelo.addRow(v);
                tablaFecha.setModel(modelo);
            }
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        radioNombre = new javax.swing.JRadioButton();
        radioEspecialidad = new javax.swing.JRadioButton();
        radioFechaContratacion = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaNombres = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEspecialidades = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaFecha = new javax.swing.JTable();
        cajaBuscar = new javax.swing.JTextField();
        REGRESAR = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        radioNombre.setText("Nombre");
        radioNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNombreActionPerformed(evt);
            }
        });
        jPanel1.add(radioNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 60, -1, -1));

        radioEspecialidad.setText("Buscar Por Especialidad");
        radioEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEspecialidadActionPerformed(evt);
            }
        });
        jPanel1.add(radioEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 60, -1, -1));

        radioFechaContratacion.setText("Buscar por Fecha de Contratación");
        radioFechaContratacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFechaContratacionActionPerformed(evt);
            }
        });
        jPanel1.add(radioFechaContratacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        tablaNombres.setBackground(new java.awt.Color(153, 204, 255));
        tablaNombres.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaNombres.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaNombres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Emp No", "Fecha Nac", "Nombre", "Apellido", "Genero", "Contratacion", "Salario", "Contrato"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaNombres);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 570, 110));

        tablaEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Titulo", "ID Empleado", "Nombre", "Apellido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaEspecialidades);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 570, 110));

        tablaFecha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Emp No", "Fecha Nac", "Nombre", "Apeliido", "Genero", "Contratacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaFecha);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 570, 110));

        cajaBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cajaBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaBuscarKeyTyped(evt);
            }
        });
        jPanel1.add(cajaBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 430, 30));

        REGRESAR.setBackground(new java.awt.Color(204, 204, 204));
        REGRESAR.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        REGRESAR.setForeground(new java.awt.Color(204, 0, 0));
        REGRESAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        REGRESAR.setText("REGRESAR");
        REGRESAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REGRESARMouseClicked(evt);
            }
        });
        jPanel1.add(REGRESAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenFiltroBusqueda.jpg"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 630, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 640, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEspecialidadActionPerformed
        radioFechaContratacion.setSelected(false);
        radioNombre.setSelected(false);
        jScrollPane2.setEnabled(true);
        jScrollPane2.setVisible(true);
        jScrollPane1.setEnabled(false);
        jScrollPane1.setVisible(false);
        jScrollPane3.setEnabled(false);
        jScrollPane3.setVisible(false);
        if (radioEspecialidad.isSelected() == false) {
            jScrollPane2.setEnabled(false);
            jScrollPane2.setVisible(false);
        }


    }//GEN-LAST:event_radioEspecialidadActionPerformed


    private void radioNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNombreActionPerformed
        radioEspecialidad.setSelected(false);
        radioFechaContratacion.setSelected(false);
        jScrollPane1.setEnabled(true);
        jScrollPane1.setVisible(true);
        jScrollPane2.setEnabled(false);
        jScrollPane2.setVisible(false);
        jScrollPane3.setEnabled(false);
        jScrollPane3.setVisible(false);
        if (radioNombre.isSelected() == false) {
            jScrollPane1.setEnabled(false);
            jScrollPane1.setVisible(false);
        }
    }//GEN-LAST:event_radioNombreActionPerformed

    private void radioFechaContratacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFechaContratacionActionPerformed
        radioNombre.setSelected(false);
        radioEspecialidad.setSelected(false);
        jScrollPane1.setEnabled(false);
        jScrollPane1.setVisible(false);
        jScrollPane2.setEnabled(false);
        jScrollPane2.setVisible(false);
        jScrollPane3.setEnabled(true);
        jScrollPane3.setVisible(true);
        if (radioFechaContratacion.isSelected() == false) {
            jScrollPane3.setEnabled(false);
            jScrollPane3.setVisible(false);
        }

    }//GEN-LAST:event_radioFechaContratacionActionPerformed

    private void cajaBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaBuscarKeyReleased
        tablaNombres();
        tablaEspecialidad();
        tablaFecha();
    }//GEN-LAST:event_cajaBuscarKeyReleased

    private void cajaBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaBuscarKeyTyped
        // TODO add your handling code here:


    }//GEN-LAST:event_cajaBuscarKeyTyped

    private void cajaBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaBuscarKeyPressed
        // TODO add your handling code here:


    }//GEN-LAST:event_cajaBuscarKeyPressed

    private void REGRESARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REGRESARMouseClicked
        VentanaInicio vi = new VentanaInicio(); 
        vi.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_REGRESARMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaConsultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton REGRESAR;
    private javax.swing.JTextField cajaBuscar;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton radioEspecialidad;
    private javax.swing.JRadioButton radioFechaContratacion;
    private javax.swing.JRadioButton radioNombre;
    private javax.swing.JTable tablaEspecialidades;
    private javax.swing.JTable tablaFecha;
    private javax.swing.JTable tablaNombres;
    // End of variables declaration//GEN-END:variables
}
