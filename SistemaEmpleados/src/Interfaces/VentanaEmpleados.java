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
import sistemaempleados.Procedimientos;

/**
 *
 * @author marin
 */
public class VentanaEmpleados extends javax.swing.JFrame {
    //int opcionC= JOptionPane.showConfirmDialog(null, "¿CONFIRMA EL REGISTRO DEL EMPLEADO?", "AVISO", JOptionPane.INFORMATION_MESSAGE);
    //int opc = JOptionPane.showInternalConfirmDialog(getParent(), )

    ResultSet rs;

    public VentanaEmpleados() {
        initComponents();
        this.setLocationRelativeTo(null);
        botonSiguiente.setEnabled(false);
        
        tablaEmpleados();
    }

    public void tablaEmpleados() {
        DefaultTableModel modelo = (DefaultTableModel) tablaEmployees.getModel();
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
                v.add(rs.getString(6));
                modelo.addRow(v);
                tablaEmployees.setModel(modelo);
            }
        } catch (Exception e) {
        }
    }

    public Icon icono(String path, int width, int heigth) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path))
                .getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cajaNombre = new javax.swing.JTextField();
        cajaApellido = new javax.swing.JTextField();
        cajaFechaContratacion = new javax.swing.JTextField();
        cajaFechaNacimiento = new javax.swing.JTextField();
        botonRegistrar = new javax.swing.JButton();
        botonSiguiente = new javax.swing.JButton();
        comboBoxGenero = new javax.swing.JComboBox<>();
        labelNombre = new javax.swing.JLabel();
        labelGenero = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmployees = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(cajaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 90, 30));
        jPanel1.add(cajaApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 90, 30));
        jPanel1.add(cajaFechaContratacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 90, 30));
        jPanel1.add(cajaFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 90, 30));

        botonRegistrar.setText("REGISTRAR");
        botonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegistrarMouseClicked(evt);
            }
        });
        jPanel1.add(botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 110, 30));

        botonSiguiente.setText("SIGUIENTE >>");
        jPanel1.add(botonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));

        comboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Género", "M", "F" }));
        jPanel1.add(comboBoxGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        labelNombre.setText("Ingrese el Nombre");
        jPanel1.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        labelGenero.setText("Masculino o Femenino");
        jPanel1.add(labelGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        labelApellido.setText("Ingrese el Apellido");
        jPanel1.add(labelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        tablaEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Num Empleado", "Fecha Nacimiento", "Nombre", "Apellido", "Genero", "Fecha de Contratación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaEmployees);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 560, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistrarMouseClicked
        ResultSet res;
        int cont = 0;
        if (cajaFechaNacimiento.getText().isEmpty() || cajaNombre.getText().isEmpty() || cajaApellido.getText().isEmpty()
                || comboBoxGenero.getSelectedIndex() == 0 || cajaFechaContratacion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(getParent(), "INTRODUZCA TODOS LOS CAMPOS", "¡OJITO!", JOptionPane.INFORMATION_MESSAGE, icono("/Imagenes/iconoLlenarDat.png", 50, 50));
        } else {
            try {
                res = sistemaempleados.ConexionSQLServer.Consulta("");
                try {
                    while (rs.next()) {
                        cont = res.getInt(1);
                    }
                } catch (Exception e) {
                }
                if (cont >= 1) {
                    JOptionPane.showMessageDialog(getParent(), "YA HA REGISTRADO AL EMPLEADO", "EMPLEADO EXISTENTE", JOptionPane.ERROR_MESSAGE);
                } else {
                   int opcionC = JOptionPane.showConfirmDialog(null, "¿CONFIRMA EL REGISTRO DEL EMPLEADO?", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                    if (opcionC == JOptionPane.YES_OPTION) {
                        Procedimientos.InsertarEmpleados(cajaFechaNacimiento.getText(), cajaNombre.getText(),
                                cajaApellido.getText(), String.valueOf(comboBoxGenero.getSelectedItem()), cajaFechaContratacion.getText());
                        JOptionPane.showMessageDialog(getParent(), "REGISTRADO");
                        tablaEmpleados();
                        botonSiguiente.setEnabled(true);
                    }
                }
            } catch (Exception e) {
            }//catch1
        }
    }//GEN-LAST:event_botonRegistrarMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JTextField cajaApellido;
    private javax.swing.JTextField cajaFechaContratacion;
    private javax.swing.JTextField cajaFechaNacimiento;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JComboBox<String> comboBoxGenero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelGenero;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JTable tablaEmployees;
    // End of variables declaration//GEN-END:variables

}
