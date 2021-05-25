package Interfaces;

import Controlador.EmpleadosDAO;
import Modelo.Empleados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistemaempleados.Procedimientos;

public class VentanaGestionar extends javax.swing.JFrame {

    ResultSet rs;

    public VentanaGestionar() {
        initComponents();
        this.setLocationRelativeTo(null);
        tablaEmpleados();
        cajaFechaRegG.setEnabled(false);
        cajaEmpNo.setEnabled(false);
    }

    public void tablaEmpleados() {
        DefaultTableModel modelo = (DefaultTableModel) tablaEmployees.getModel();
        modelo.setRowCount(0);
        rs = sistemaempleados.ConexionSQLServer.Consulta("SELECT * FROM datos_completos");
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
                tablaEmployees.setModel(modelo);
            }
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cajaFechaRegG = new javax.swing.JTextField();
        cajaNombreG = new javax.swing.JTextField();
        cajaApellidoG = new javax.swing.JTextField();
        cajaEmpNo = new javax.swing.JTextField();
        cajaContratoG = new javax.swing.JTextField();
        comboBoxTituloG = new javax.swing.JComboBox<>();
        comboBoxGeneroG = new javax.swing.JComboBox<>();
        cajaFormato_Salario = new javax.swing.JFormattedTextField();
        cajaFormato_FechaNac = new javax.swing.JFormattedTextField();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        ScrollPaneEmpleados = new javax.swing.JScrollPane();
        tablaEmployees = new javax.swing.JTable();
        apellido = new javax.swing.JLabel();
        labelID1 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JLabel();
        genero = new javax.swing.JLabel();
        nacimiento1 = new javax.swing.JLabel();
        sueldo = new javax.swing.JLabel();
        fechaRegistro1 = new javax.swing.JLabel();
        contrato1 = new javax.swing.JLabel();
        contrato2 = new javax.swing.JLabel();
        labelFormatoFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cajaFechaRegG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaFechaRegGActionPerformed(evt);
            }
        });
        jPanel1.add(cajaFechaRegG, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 160, 30));

        cajaNombreG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreGActionPerformed(evt);
            }
        });
        jPanel1.add(cajaNombreG, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 120, 30));
        jPanel1.add(cajaApellidoG, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 120, 30));
        jPanel1.add(cajaEmpNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 40, 30));
        jPanel1.add(cajaContratoG, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 150, 30));

        comboBoxTituloG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Título", "Personal", "Personal Mayor", "Ingeniero ", "Ingeniero Mayor", "Asistente de Ingeniero", "Líder Técnico", "Ingeniero en Sistemas Computacionales", "Ingeniero en Mecátronica", "Licenciado en Administración de Empresas" }));
        jPanel1.add(comboBoxTituloG, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 164, 30));

        comboBoxGeneroG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Género", "M", "F" }));
        jPanel1.add(comboBoxGeneroG, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 164, 30));

        cajaFormato_Salario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jPanel1.add(cajaFormato_Salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 160, 30));

        try {
            cajaFormato_FechaNac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(cajaFormato_FechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 160, 30));

        botonModificar.setText("MODIFICAR");
        botonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonModificarMouseClicked(evt);
            }
        });
        jPanel1.add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, -1, -1));

        botonEliminar.setText("ELIMINAR");
        botonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEliminarMouseClicked(evt);
            }
        });
        jPanel1.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        tablaEmployees.setBackground(new java.awt.Color(204, 204, 255));
        tablaEmployees.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaEmployees.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tablaEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Num Empleado", "Fecha Nacimiento", "Nombre", "Apellido", "Genero", "Fecha de Contratación", "Titulo", "Salario", "Contrato"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEmployeesMouseClicked(evt);
            }
        });
        ScrollPaneEmpleados.setViewportView(tablaEmployees);

        jPanel1.add(ScrollPaneEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 640, 120));

        apellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        apellido.setText("Apellido");
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        labelID1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelID1.setText("Número de Empleado");
        jPanel1.add(labelID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        nombre1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombre1.setText("Nombre(s)");
        jPanel1.add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        genero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        genero.setText("Masculino o Femenino");
        jPanel1.add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        nacimiento1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nacimiento1.setText("Fecha de Registro");
        jPanel1.add(nacimiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        sueldo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sueldo.setText("Sueldo (quincena)");
        jPanel1.add(sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 120, -1));

        fechaRegistro1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fechaRegistro1.setText("Fecha de Nacimiento");
        jPanel1.add(fechaRegistro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        contrato1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        contrato1.setText("Contrato");
        jPanel1.add(contrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        contrato2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        contrato2.setText("Especialidad");
        jPanel1.add(contrato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        labelFormatoFecha.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        labelFormatoFecha.setText("AAAA-MM-dd");
        jPanel1.add(labelFormatoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEmployeesMouseClicked
        int s = tablaEmployees.rowAtPoint(evt.getPoint());
        cajaEmpNo.setText(String.valueOf(tablaEmployees.getValueAt(s, 0)));
        //cajaFechaNacG.setText(String.valueOf(tablaEmployees.getValueAt(s, 1)));
        cajaFormato_FechaNac.setText(String.valueOf(tablaEmployees.getValueAt(s, 1)));
        cajaNombreG.setText(String.valueOf(tablaEmployees.getValueAt(s, 2)));
        cajaApellidoG.setText(String.valueOf(tablaEmployees.getValueAt(s, 3)));
        comboBoxGeneroG.setSelectedItem(String.valueOf(tablaEmployees.getValueAt(s, 4)));
        cajaFechaRegG.setText(String.valueOf(tablaEmployees.getValueAt(s, 5)));
        comboBoxTituloG.setSelectedItem(String.valueOf(tablaEmployees.getValueAt(s, 6)));
        cajaFormato_Salario.setText(String.valueOf(tablaEmployees.getValueAt(s, 7)));
        cajaContratoG.setText(String.valueOf(tablaEmployees.getValueAt(s, 8)));
    }//GEN-LAST:event_tablaEmployeesMouseClicked

    private void botonModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarMouseClicked
        String salario = cajaFormato_Salario.getText();
        salario = salario.replace(",", "");
        String genero = "";
        if (comboBoxGeneroG.getSelectedIndex() == 1) {
            genero = "M";
        } else if (comboBoxGeneroG.getSelectedIndex() == 2) {
            genero = "F";
        }
        if (cajaEmpNo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(getParent(), "PRIMERO DEBE SELECCIONAR UN REGISTRO", "ATENCIÓN", JOptionPane.ERROR_MESSAGE);
        } else if (cajaNombreG.getText().isEmpty()) {
            JOptionPane.showMessageDialog(getParent(), "INTRODUZCA EL NOMBRE", "ATENCIÓN", JOptionPane.ERROR_MESSAGE);
        } else if (cajaApellidoG.getText().isEmpty()) {
            JOptionPane.showMessageDialog(getParent(), "INTRODUZCA EL APELLIDO", "ATENCIÓN", JOptionPane.ERROR_MESSAGE);
        } else if (cajaFormato_FechaNac.getText().isEmpty()) {
            JOptionPane.showMessageDialog(getParent(), "INTRODUZCA EL FECHA NACIMIENTO ", "ATENCIÓN", JOptionPane.ERROR_MESSAGE);
        } else if (comboBoxGeneroG.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(getParent(), "INTRODUZCA EL GÉNERO", "ATENCIÓN", JOptionPane.ERROR_MESSAGE);
        } else if (cajaContratoG.getText().isEmpty()) {
            JOptionPane.showMessageDialog(getParent(), "INTRODUZCA EL CONTRATO", "ATENCIÓN", JOptionPane.ERROR_MESSAGE);
        } else if (comboBoxTituloG.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(getParent(), "INTRODUZCA EL TÍTULO ", "ATENCIÓN", JOptionPane.ERROR_MESSAGE);
        } else if (cajaFormato_Salario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(getParent(), "INTRODUZCA EL SALARIO ", "ATENCIÓN", JOptionPane.ERROR_MESSAGE);
        } else {
            int opcionC = JOptionPane.showConfirmDialog(null, "¿CONFIRMA LA ACTUALIZACIÓN DEL EMPLEADO?", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            try {
                if (opcionC == JOptionPane.YES_OPTION) {
                    PreparedStatement pps = sistemaempleados.ConexionSQLServer.getConnection().prepareStatement("update employees set nombre='" + cajaNombreG.getText() + "', apellido='" + cajaApellidoG.getText() + "', genero='" + genero + "', fecha_nacimiento='" + cajaFormato_FechaNac.getText() + "' where emp_no= '" + cajaEmpNo.getText() + "'");
                    PreparedStatement pps2 = sistemaempleados.ConexionSQLServer.getConnection().prepareStatement("UPDATE titles set titulo='" + String.valueOf(comboBoxTituloG.getSelectedItem()) + "', hasta_la_fecha='" + cajaContratoG.getText() + "' where emp_no='" + cajaEmpNo.getText() + "'");
                    PreparedStatement pps3 = sistemaempleados.ConexionSQLServer.getConnection().prepareStatement("UPDATE salaries set salario=" + Integer.parseInt(salario) + " where emp_no='" + cajaEmpNo.getText() + "'");
                    pps.executeUpdate();
                    pps2.executeUpdate();
                    pps3.executeUpdate();
                    JOptionPane.showMessageDialog(getParent(), "MODIFICADO");
                }
            } catch (Exception e) {
            }
        }

        tablaEmpleados();
    }//GEN-LAST:event_botonModificarMouseClicked

    private void botonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseClicked
        // TODO add your handling code here:
        if (cajaEmpNo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(getParent(), "PRIMERO DEBE SELECCIONAR UN REGISTRO", "ATENCIÓN", JOptionPane.ERROR_MESSAGE);
        } else {
            int opcionC = JOptionPane.showConfirmDialog(null, "¿CONFIRMA LA ELIMINACIÓN DEL EMPLEADO?", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            try {
                if (opcionC == JOptionPane.YES_OPTION) {
                    boolean res = new EmpleadosDAO().eliminarEmpleado(cajaEmpNo.getText());
                    JOptionPane.showMessageDialog(getParent(), "ELIMINADO");
                    cajaEmpNo.setText("");
                    cajaNombreG.setText("");
                    cajaApellidoG.setText("");

                }
            } catch (Exception e) {
            }
        }
        tablaEmpleados();
    }//GEN-LAST:event_botonEliminarMouseClicked

    private void cajaNombreGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreGActionPerformed

    private void cajaFechaRegGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaFechaRegGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaFechaRegGActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaGestionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaGestionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaGestionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaGestionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaGestionar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPaneEmpleados;
    private javax.swing.JLabel apellido;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField cajaApellidoG;
    private javax.swing.JTextField cajaContratoG;
    private javax.swing.JTextField cajaEmpNo;
    private javax.swing.JTextField cajaFechaRegG;
    private javax.swing.JFormattedTextField cajaFormato_FechaNac;
    private javax.swing.JFormattedTextField cajaFormato_Salario;
    private javax.swing.JTextField cajaNombreG;
    private javax.swing.JComboBox<String> comboBoxGeneroG;
    private javax.swing.JComboBox<String> comboBoxTituloG;
    private javax.swing.JLabel contrato1;
    private javax.swing.JLabel contrato2;
    private javax.swing.JLabel fechaRegistro1;
    private javax.swing.JLabel genero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelFormatoFecha;
    private javax.swing.JLabel labelID1;
    private javax.swing.JLabel nacimiento1;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel sueldo;
    private javax.swing.JTable tablaEmployees;
    // End of variables declaration//GEN-END:variables
}
