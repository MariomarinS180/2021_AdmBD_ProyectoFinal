package Interfaces;

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
        cajaSalarioG = new javax.swing.JTextField();
        cajaEmpNo = new javax.swing.JTextField();
        cajaFechaNacG = new javax.swing.JTextField();
        cajaContratoG = new javax.swing.JTextField();
        comboBoxTituloG = new javax.swing.JComboBox<>();
        comboBoxGeneroG = new javax.swing.JComboBox<>();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        ScrollPaneEmpleados = new javax.swing.JScrollPane();
        tablaEmployees = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(cajaFechaRegG, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 29, 90, 35));
        jPanel1.add(cajaNombreG, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 29, 90, 35));
        jPanel1.add(cajaApellidoG, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 29, 90, 35));
        jPanel1.add(cajaSalarioG, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 29, 90, 35));
        jPanel1.add(cajaEmpNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 29, 90, 35));
        jPanel1.add(cajaFechaNacG, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 110, 30));
        jPanel1.add(cajaContratoG, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 130, 30));

        comboBoxTituloG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Título", "Personal", "Personal Mayor", "Ingeniero ", "Ingeniero Mayor", "Asistente de Ingeniero", "Líder Técnico", "Ingeniero en Sistemas Computacionales", "Ingeniero en Mecátronica", "Licenciado en Administración de Empresas" }));
        jPanel1.add(comboBoxTituloG, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 111, 164, -1));

        comboBoxGeneroG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Género", "M", "F" }));
        jPanel1.add(comboBoxGeneroG, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 111, 164, -1));

        botonModificar.setText("MODIFICAR");
        botonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonModificarMouseClicked(evt);
            }
        });
        jPanel1.add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 168, -1, -1));

        botonEliminar.setText("ELIMINAR");
        jPanel1.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 168, -1, -1));

        tablaEmployees.setBackground(new java.awt.Color(204, 204, 255));
        tablaEmployees.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaEmployees.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tablaEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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

        jPanel1.add(ScrollPaneEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 640, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEmployeesMouseClicked
        int s = tablaEmployees.rowAtPoint(evt.getPoint());
        cajaEmpNo.setText(String.valueOf(tablaEmployees.getValueAt(s, 0)));
        cajaFechaNacG.setText(String.valueOf(tablaEmployees.getValueAt(s, 1)));
        cajaNombreG.setText(String.valueOf(tablaEmployees.getValueAt(s, 2)));
        cajaApellidoG.setText(String.valueOf(tablaEmployees.getValueAt(s, 3)));
        comboBoxGeneroG.setSelectedItem(String.valueOf(tablaEmployees.getValueAt(s, 4)));
        cajaFechaRegG.setText(String.valueOf(tablaEmployees.getValueAt(s, 5)));
        comboBoxTituloG.setSelectedItem(String.valueOf(tablaEmployees.getValueAt(s, 6)));
        cajaSalarioG.setText(String.valueOf(tablaEmployees.getValueAt(s, 7)));
        cajaContratoG.setText(String.valueOf(tablaEmployees.getValueAt(s, 8)));
        //dateFechaContratoG.setDate((java.util.Date)tablaEmployees.getValueAt(s, 8));

        //

    }//GEN-LAST:event_tablaEmployeesMouseClicked

    private void botonModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarMouseClicked
        // TODO add your handling code here:
        int opcionC = JOptionPane.showConfirmDialog(null, "¿CONFIRMA LA ACTUALIZACIÓN DEL EMPLEADO?", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        try {
            if (opcionC == JOptionPane.YES_OPTION) {
                PreparedStatement pps = sistemaempleados.ConexionSQLServer.getConnection().prepareStatement("update employees set nombre='"+cajaNombreG.getText()+"', apellido='"+cajaApellidoG.getText()+"' where emp_no= '"+cajaEmpNo.getText()+"'");
                //"'where emp_no = '"+cajaEmpNo.getText()+"'
                JOptionPane.showMessageDialog(getParent(), "MODIFICADO");
                pps.executeUpdate();
                tablaEmpleados();
                
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_botonModificarMouseClicked

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
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField cajaApellidoG;
    private javax.swing.JTextField cajaContratoG;
    private javax.swing.JTextField cajaEmpNo;
    private javax.swing.JTextField cajaFechaNacG;
    private javax.swing.JTextField cajaFechaRegG;
    private javax.swing.JTextField cajaNombreG;
    private javax.swing.JTextField cajaSalarioG;
    private javax.swing.JComboBox<String> comboBoxGeneroG;
    private javax.swing.JComboBox<String> comboBoxTituloG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable tablaEmployees;
    // End of variables declaration//GEN-END:variables
}
