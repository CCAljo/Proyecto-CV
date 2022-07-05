/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import controladores.LoguinController;
import interfazGrafica.InicioPrincipal;
import interfazGrafica.paginaPrincipal_Admin;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author spc
 */
public class admin extends javax.swing.JPanel {

    InicioPrincipal home;

    /**
     * Creates new form admin
     */
    public admin(InicioPrincipal home) {
        initComponents();
        this.home = home;
    }

    public void iniciarSesion() {
        LoguinController controlador = new LoguinController();
        boolean[] verificado = controlador.verificar(jtxtuser.getText(), String.valueOf(jtxtpass.getPassword()), "1");
        if (verificado[0] == false && verificado[1] == false) {
            JOptionPane.showMessageDialog(null, "No existe el usuario" + " " + jtxtuser.getText());
        }
        if (verificado[0] == true && verificado[1] == false) {
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta intente de nuevo");
        }
        if (verificado[0] == true && verificado[1] == true) {
            paginaPrincipal_Admin adm = new paginaPrincipal_Admin();
            adm.setVisible(true);
            this.home.setVisible(false);
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

        jLabel3 = new javax.swing.JLabel();
        jtxtuser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jtxtpass = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jbtnRegistro = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1250, 590));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 30)); // NOI18N
        jLabel3.setText("Usuario");

        jtxtuser.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jtxtuser.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 30)); // NOI18N
        jLabel1.setText("Contraseña");

        jtxtpass.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jtxtpass.setBorder(null);
        jtxtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtpassActionPerformed(evt);
            }
        });

        jbtnRegistro.setBackground(new java.awt.Color(236, 71, 71));
        jbtnRegistro.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jbtnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jbtnRegistro.setText("Iniciar sesion");
        jbtnRegistro.setBorder(null);
        jbtnRegistro.setBorderPainted(false);
        jbtnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnRegistroMouseExited(evt);
            }
        });
        jbtnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistroActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Administrador");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrames/Loguin_Admin.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jbtnRegistro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistroActionPerformed
        if (jtxtuser.getText().trim().isEmpty() || String.valueOf(jtxtpass.getPassword()).trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Espacios invalidos o incompletos");
        } else {
            iniciarSesion();
        }
    }//GEN-LAST:event_jbtnRegistroActionPerformed

    private void jbtnRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnRegistroMouseEntered
        jbtnRegistro.setBackground(Color.BLACK);
    }//GEN-LAST:event_jbtnRegistroMouseEntered

    private void jbtnRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnRegistroMouseExited
        jbtnRegistro.setBackground(new Color(236, 71, 71));
    }//GEN-LAST:event_jbtnRegistroMouseExited

    private void jtxtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtpassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbtnRegistro;
    private javax.swing.JPasswordField jtxtpass;
    private javax.swing.JTextField jtxtuser;
    // End of variables declaration//GEN-END:variables
}
