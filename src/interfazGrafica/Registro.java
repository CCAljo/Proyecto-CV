/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoagiles;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author DELLWIN10
 */
public class Registro extends javax.swing.JFrame {

    private DefaultComboBoxModel modeloFacultades;

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        cargarFacultades();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtUsuario = new javax.swing.JTextField();
        jtxtContrasena = new javax.swing.JTextField();
        jtxtApellido = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jtxtCedula = new javax.swing.JTextField();
        jbtnRegistrarse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcbxFacultad = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtxtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtUsuarioFocusLost(evt);
            }
        });
        jtxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtUsuarioActionPerformed(evt);
            }
        });

        jtxtContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtContrasenaFocusLost(evt);
            }
        });
        jtxtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtContrasenaActionPerformed(evt);
            }
        });

        jtxtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtApellidoFocusLost(evt);
            }
        });
        jtxtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtApellidoActionPerformed(evt);
            }
        });

        jtxtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtNombreFocusLost(evt);
            }
        });
        jtxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombreActionPerformed(evt);
            }
        });

        jtxtCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtCedulaFocusLost(evt);
            }
        });
        jtxtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCedulaActionPerformed(evt);
            }
        });

        jbtnRegistrarse.setText("Registrarse");
        jbtnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarseActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña: ");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellido:");

        jLabel5.setText("Cedula:");

        jLabel6.setText("Facultad:");

        jcbxFacultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbxFacultad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcbxFacultadFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnRegistrarse)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbxFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbxFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jbtnRegistrarse)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUsuarioActionPerformed

    }//GEN-LAST:event_jtxtUsuarioActionPerformed

    private void jtxtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtContrasenaActionPerformed

    private void jtxtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtApellidoActionPerformed

    private void jtxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombreActionPerformed

    private void jtxtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCedulaActionPerformed

    private boolean soloLetras(String var) {
        boolean palabraCorrecta = false;
        boolean esLetra = false;

        for (int i = 0; i < var.length(); i++) {
            if (!Character.isLetter(var.charAt(i))) {
                esLetra = false;

            } else {
                esLetra = true;
            }
            if (esLetra == false) {
                JOptionPane.showMessageDialog(null, "Solo se admiten letras");
                return false;

            } else {
                palabraCorrecta = true;
            }

        }
        return palabraCorrecta;
    }
    
    
    

    private boolean validarCedula(String cedula) {
        boolean cedulaCorrecta = false;
        boolean esNumero = false;

        if (cedula.length() != 10) {
            JOptionPane.showMessageDialog(null, "Debe tener una logitud igual a 10 números");

        } else {
            for (int i = 0; i < cedula.length(); i++) {
                if (!Character.isDigit(cedula.charAt(i))) {
                    esNumero = false;

                } else {
                    esNumero = true;
                }
                if (esNumero == false) {
                    JOptionPane.showMessageDialog(null, "Solo se admiten números");
                    return false;

                } else {
                    cedulaCorrecta = true;
                }
            }

        }
        return cedulaCorrecta;
    }

    private boolean campos_vacios() {
        boolean vacio = true;
        if (jtxtUsuario.getText().isEmpty() || jtxtContrasena.getText().isEmpty() || jtxtNombre.getText().isEmpty() || jtxtApellido.getText().isEmpty()
                || jtxtCedula.getText().isEmpty() || jcbxFacultad.getSelectedIndex() == 0) {
            vacio = true;
            JOptionPane.showMessageDialog(null, "No se permiten campos vacios");
        } else {
            vacio = false;
        }
        return vacio;

    }

    private void cargarFacultades() {
        String facultades[] = {"Seleccione", "Ciencias de la Salud", "Ciencias Administrativas",
            "Ciencias Humanas y de la Educación", "Ciencias Agropecuarias",
            "Jurisprudencia y Ciencias Sociales", "Contabilidad y Auditoría",
            "Ingeniería Civil y Mecánica", "Ciencia e Ingeniería en Alimentos",
            "Ingeniería en Sistemas, Electrónica e Industrial", "Diseño y Arquitectura"};
        this.modeloFacultades = new DefaultComboBoxModel();
        for (String i : facultades) {
            modeloFacultades.addElement(i);
        }
        jcbxFacultad.setModel(modeloFacultades);
    }


    private void jtxtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtUsuarioFocusLost
        validarCedula(jtxtUsuario.getText());

        if (jtxtUsuario.getText().isEmpty()) {
            jtxtUsuario.setBorder(BorderFactory.createLineBorder(Color.red));
        } else {
            jtxtUsuario.setBorder(BorderFactory.createLineBorder(Color.black));

        }
    }//GEN-LAST:event_jtxtUsuarioFocusLost

    private void jtxtContrasenaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtContrasenaFocusLost
        if (jtxtContrasena.getText().isEmpty()) {
            jtxtContrasena.setBorder(BorderFactory.createLineBorder(Color.red));
        } else {
            jtxtContrasena.setBorder(BorderFactory.createLineBorder(Color.black));

        }
    }//GEN-LAST:event_jtxtContrasenaFocusLost

    private void jtxtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtNombreFocusLost
        soloLetras(jtxtNombre.getText());
        if (jtxtNombre.getText().isEmpty()) {
            jtxtNombre.setBorder(BorderFactory.createLineBorder(Color.red));
        } else {
            jtxtNombre.setBorder(BorderFactory.createLineBorder(Color.black));

        }
    }//GEN-LAST:event_jtxtNombreFocusLost

    private void jtxtApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtApellidoFocusLost
        soloLetras(jtxtApellido.getText());
        if (jtxtApellido.getText().isEmpty()) {
            jtxtApellido.setBorder(BorderFactory.createLineBorder(Color.red));
        } else {
            jtxtApellido.setBorder(BorderFactory.createLineBorder(Color.black));

        }
    }//GEN-LAST:event_jtxtApellidoFocusLost

    private void jtxtCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtCedulaFocusLost
        validarCedula(jtxtCedula.getText());
        if (jtxtCedula.getText().isEmpty()) {
            jtxtCedula.setBorder(BorderFactory.createLineBorder(Color.red));
        } else {
            jtxtCedula.setBorder(BorderFactory.createLineBorder(Color.black));

        }
    }//GEN-LAST:event_jtxtCedulaFocusLost

    private void jbtnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarseActionPerformed
        if (campos_vacios() == false && validarCedula(jtxtUsuario.getText()) == true && soloLetras(jtxtNombre.getText()) == true &&
                soloLetras(jtxtApellido.getText()) == true && validarCedula(jtxtCedula.getText()) == true) {
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        }
    }//GEN-LAST:event_jbtnRegistrarseActionPerformed

    private void jcbxFacultadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbxFacultadFocusLost


    }//GEN-LAST:event_jcbxFacultadFocusLost

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbtnRegistrarse;
    private javax.swing.JComboBox<String> jcbxFacultad;
    private javax.swing.JTextField jtxtApellido;
    private javax.swing.JTextField jtxtCedula;
    private javax.swing.JTextField jtxtContrasena;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}