/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import controladores.BusquedaFechaController;

/**
 *
 * @author spc
 */
public class BusquedaFecha extends javax.swing.JPanel {

    /**
     * Creates new form BusquedaFecha
     */
    public BusquedaFecha() {
        initComponents();
        cargarTitulos();
    }

    public void cargarTitulos() {
        String[] titulos = {
            "Cédula", "Nombre", "Apellido", "Entrada Mañana", "Salida Mañana", "Entrada Tarde", "Salida Tarde", "Cant. Horas"
        };
        DefaultTableModel modeloTabla = new DefaultTableModel(null, titulos);
        jtblRegistros.setModel(modeloTabla);
    }

    public void buscar(){
        if(datePicker1.getDate()==null){
            JOptionPane.showMessageDialog(null, "Ingrese una fecha");
        }else{
            BusquedaFechaController search = new BusquedaFechaController();
            DefaultTableModel modeloTabla = search.cargarTabla(Date.valueOf(datePicker1.getDate()));
            if(modeloTabla == null){
                JOptionPane.showMessageDialog(null, "No existen registros de la fecha seleccionada");
            }else{
                jtblRegistros.setModel(modeloTabla);
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jpanBackground = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jbtnBuscar = new javax.swing.JButton();
        jlNombre = new javax.swing.JLabel();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblRegistros = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Busqueda por Docente");

        jpanBackground.setBackground(new java.awt.Color(255,255,255));
        jpanBackground.setPreferredSize(new java.awt.Dimension(1250,590));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setText("Busqueda por Docente");

        jbtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrames/lupa.png"))); // NOI18N
        jbtnBuscar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jbtnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });

        jlNombre.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jlNombre.setText("Busqueda");

        datePicker1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jtblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtblRegistros);

        javax.swing.GroupLayout jpanBackgroundLayout = new javax.swing.GroupLayout(jpanBackground);
        jpanBackground.setLayout(jpanBackgroundLayout);
        jpanBackgroundLayout.setHorizontalGroup(
            jpanBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpanBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlNombre)
                        .addGap(18, 18, 18)
                        .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnBuscar)
                        .addGap(436, 436, 436))))
            .addGroup(jpanBackgroundLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jpanBackgroundLayout.setVerticalGroup(
            jpanBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlNombre)
                        .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_jbtnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JPanel jpanBackground;
    private javax.swing.JTable jtblRegistros;
    // End of variables declaration//GEN-END:variables
}
