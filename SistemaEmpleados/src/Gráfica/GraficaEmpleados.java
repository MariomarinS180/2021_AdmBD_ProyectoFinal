/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gráfica;

import Interfaces.VentanaInicio;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class GraficaEmpleados extends javax.swing.JFrame {
    public GraficaEmpleados() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        comboBoxConsulta = new javax.swing.JComboBox<>();
        botonEjecutar = new javax.swing.JButton();
        GRAFICAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsultas = new javax.swing.JTable();
        botonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 255));

        comboBoxConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una Consulta", "Cantidad de Empleados", "Cantidad de Titulados" }));

        botonEjecutar.setBackground(new java.awt.Color(255, 255, 0));
        botonEjecutar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        botonEjecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ejecutar.png"))); // NOI18N
        botonEjecutar.setText("EJECUTAR");
        botonEjecutar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEjecutarMouseClicked(evt);
            }
        });

        GRAFICAR.setBackground(new java.awt.Color(255, 102, 204));
        GRAFICAR.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        GRAFICAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/barraProcentaje.png"))); // NOI18N
        GRAFICAR.setText("GRAFICAR");
        GRAFICAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GRAFICARMouseClicked(evt);
            }
        });

        tablaConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaConsultas);

        botonRegresar.setBackground(new java.awt.Color(255, 255, 255));
        botonRegresar.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        botonRegresar.setForeground(new java.awt.Color(153, 0, 51));
        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        botonRegresar.setText("REGRESAR");
        botonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonEjecutar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GRAFICAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(514, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GRAFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonRegresar)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GRAFICARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GRAFICARMouseClicked
        // TODO add your handling code here
        /*
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int i = 0; i <tablaConsultas.getRowCount(); i++){
            dataset.setValue(Integer.parseInt(tablaConsultas.getValueAt(i, 0).toString()), tablaConsultas.getValueAt(i, 1).toString(), tablaConsultas.getValueAt(i, 2).toString());
        }
        JFreeChart ch = ChartFactory.createBarChart3D("GRAFICA DE BARRA 3D", "Genero", "Porcentaje", dataset, PlotOrientation.HORIZONTAL, true, true, false);
        ChartPanel cp = new ChartPanel(ch);
        add(cp);
        cp.setBounds(500, 5, 400, 400);
        */
        DefaultPieDataset dataset = new DefaultPieDataset();
        for(int i = 0; i <tablaConsultas.getRowCount(); i++){
            dataset.setValue(tablaConsultas.getValueAt(i, 0).toString(), Integer.parseInt(tablaConsultas.getValueAt(i, 1).toString()));
        }
        JFreeChart ch = ChartFactory.createPieChart3D("GRAFICA CIRCULAR 3D",dataset, true, true, false);
        ChartPanel cp = new ChartPanel(ch);
        add(cp);
        cp.setBounds(500, 5, 400, 400);
    }//GEN-LAST:event_GRAFICARMouseClicked

    private void botonEjecutarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEjecutarMouseClicked
        // TODO add your handling code here:
        DefaultTableModel miModelo;
        Graficar miGrafica = new Graficar();
        int opc = comboBoxConsulta.getSelectedIndex();
        switch(opc){
            case 1:
            miModelo = miGrafica.mostrarCantidadGeneros();
            tablaConsultas.setModel(miModelo);
            break;
            case 2:
            miModelo = miGrafica.mostrarCantidadTitulos();
            tablaConsultas.setModel(miModelo);
            break;
            default: JOptionPane.showMessageDialog(getParent(), "SIGUE ASÍ, LLEGARÁS LEJOS... ;)");
        }
    }//GEN-LAST:event_botonEjecutarMouseClicked

    private void botonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarMouseClicked
        // TODO add your handling code here:
        VentanaInicio vi = new VentanaInicio();
        vi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonRegresarMouseClicked

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
            java.util.logging.Logger.getLogger(GraficaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficaEmpleados().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GRAFICAR;
    private javax.swing.JButton botonEjecutar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JComboBox<String> comboBoxConsulta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaConsultas;
    // End of variables declaration//GEN-END:variables
}
