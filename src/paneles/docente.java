/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import controladores.LoguinController;
import interfazGrafica.InicioPrincipal;
import interfazGrafica.paginaPrincipal_Usuario;
import java.awt.Color;
import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 * @author spc
 */
public class docente extends javax.swing.JPanel {
    private InicioPrincipal loguin;
    /**
     * Creates new form docente
     */
    public docente(InicioPrincipal loguin) {
        initComponents();
        this.loguin =loguin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jtxtuser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jtxtpass = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jbtnInicio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1250, 590));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Usuario");

        jtxtuser.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jtxtuser.setBorder(null);
        jtxtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtuserActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Contraseña");

        jtxtpass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jtxtpass.setBorder(null);

        jbtnInicio.setBackground(new java.awt.Color(236, 71, 71));
        jbtnInicio.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jbtnInicio.setForeground(new java.awt.Color(255, 255, 255));
        jbtnInicio.setText("Iniciar sesion");
        jbtnInicio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnInicio.setBorderPainted(false);
        jbtnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnInicioMouseExited(evt);
            }
        });
        jbtnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInicioActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrames/Loguin_Docente.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        jLabel4.setText("Docente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1)
                            .addComponent(jtxtuser, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtpass)
                            .addComponent(jbtnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jbtnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtuserActionPerformed

    private void jbtnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInicioActionPerformed
        if (jtxtuser.getText().trim().isEmpty() || String.valueOf(jtxtpass.getPassword()).trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Espacios invalidos o incompletos");
        } else {
            iniciarSesion();
        }

    }//GEN-LAST:event_jbtnInicioActionPerformed

    private void jbtnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnInicioMouseEntered
        jbtnInicio.setBackground(Color.BLACK);
    }//GEN-LAST:event_jbtnInicioMouseEntered

    private void jbtnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnInicioMouseExited
        jbtnInicio.setBackground(new Color(236, 71, 71));
    }//GEN-LAST:event_jbtnInicioMouseExited
/*
    public void validarBoton() {
        LocalTime horaActual = LocalTime.now();
        LocalTime inicio = LocalTime.parse("06:50");
        LocalTime fin = LocalTime.parse("07:15");
        LocalTime incioTarde = LocalTime..parse("14:00");
        LocalTime finTarde = LocalTime.parse("20:00");

        boolean hora1 = horaActual.isAfter(inicio);
        boolean hora2 = horaActual.isBefore(fin);

        //  JOptionPane.showMessageDialog(null, hora1);
        // JOptionPane.showMessageDialog(null, hora2);
        if (jbtnInicio.isSelected()) {
            jbtnInicio.setBackground(new Color(32, 146, 25));
            jbtnInicio.setText("Registrar Entrada");
        } else {
            jbtnInicio.setBackground(new Color(180, 35, 35));
            jbtnInicio.setText("Registrar Salida");
        }

    }
*/
    public void iniciarSesion() {
        LoguinController controlador = new LoguinController();
        boolean[] verificado = controlador.verificar(jtxtuser.getText(), String.valueOf(jtxtpass.getPassword()), "0");
        if (verificado[0] == false && verificado[1] == false) {
            JOptionPane.showMessageDialog(null, "No existe el usuario" + " " + jtxtuser.getText());
        }
        if (verificado[0] == true && verificado[1] == false) {
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta intente de nuevo");
        }
        if (verificado[0] == true && verificado[1] == true) {
            paginaPrincipal_Usuario u = new paginaPrincipal_Usuario(jtxtuser.getText());
            this.loguin.setVisible(false);
            u.setVisible(true);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbtnInicio;
    private javax.swing.JPasswordField jtxtpass;
    private javax.swing.JTextField jtxtuser;
    // End of variables declaration//GEN-END:variables
}
