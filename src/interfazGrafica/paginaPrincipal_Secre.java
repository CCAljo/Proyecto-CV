/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica;

import java.awt.BorderLayout;
import java.sql.*;
import javax.swing.JOptionPane;
import paneles.CambiaPanel;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import menu.MenuItem;

/**
 *
 * @author spc
 */
public class paginaPrincipal_Secre extends javax.swing.JFrame {

    private ImageIcon imagen;
    private Icon icono;
    int xMouse, yMouse;
    private String user;

    /**
     * Creates new form Login
     */
    public paginaPrincipal_Secre(String usuario) {
        initComponents();
        new CambiaPanel(jpanPrincipal, new paneles.BienvenidaSecre());
        this.setLocationRelativeTo(null);
        user = usuario;
        execute();
    }

    public paginaPrincipal_Secre() {
        initComponents();
        new CambiaPanel(jpanPrincipal, new paneles.BienvenidaSecre());
        this.setLocationRelativeTo(null);

        execute();
    }

    private void execute() {

        //---------------------------------------ICONOS---------------------------------
        //Iconos Principal 
        ImageIcon iconoInicio = new ImageIcon(getClass().getResource("/imagenesFrames/homeSecre.png"));
        ImageIcon iconoArchivo = new ImageIcon(getClass().getResource("/imagenesFrames/archivoSecre.png"));
        ImageIcon iconoSalir = new ImageIcon(getClass().getResource("/imagenesFrames/cerrar.png"));

        //Iconos Archivo
        ImageIcon iconoCRUDEstudiantes = new ImageIcon(getClass().getResource("/imagenesFrames/graduado.png"));
        ImageIcon iconoInactivos = new ImageIcon(getClass().getResource("/imagenesFrames/borrar-usuario.png"));

        //--------------------------------------MENU ITEM---------------------------------
        //Menu Archivo
        MenuItem menuArchivoCRUD = new MenuItem(iconoCRUDEstudiantes, "Estudiantes", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CambiaPanel(jpanPrincipal, new paneles.crudEstudiante());
            }
        });
        MenuItem menuArchivoInactivos = new MenuItem(iconoInactivos, "Estudiantes Inactivos", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CambiaPanel(jpanPrincipal, new paneles.estudiantesInactivos());

            }
        });

        //Menu Principal
        MenuItem menuInicio = new MenuItem(iconoInicio, "Inicio", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CambiaPanel(jpanPrincipal, new paneles.BienvenidaSecre());

            }
        }
        );
        MenuItem menuArchivo = new MenuItem(iconoArchivo, "Archivo", null, menuArchivoCRUD, menuArchivoInactivos);
        MenuItem menuSalir = new MenuItem(iconoSalir, "Salir", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cerrar();
            }
        });

        addMenu(menuInicio, menuArchivo, menuSalir);

    }

    private void addMenu(MenuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            MenusSecre.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                addMenu(m);
            }
        }
        MenusSecre.revalidate();
    }

    private void cerrar() {
        int opcion = JOptionPane.showConfirmDialog(this, "¿Desea salir?", "Alerta", JOptionPane.YES_NO_OPTION);
        if (opcion == 0) {
            InicioPrincipal loguin = new InicioPrincipal();
            loguin.setVisible(true);
            this.setVisible(false);
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

        jPanel2 = new javax.swing.JPanel();
        jpFooter = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        imgLogoFisei = new javax.swing.JLabel();
        imgLogoUta = new javax.swing.JLabel();
        jpOpBar = new javax.swing.JPanel();
        jpMinim = new javax.swing.JPanel();
        Minim = new javax.swing.JLabel();
        jpCerrar = new javax.swing.JPanel();
        X = new javax.swing.JLabel();
        jpHeader = new javax.swing.JPanel();
        RegDocen = new javax.swing.JLabel();
        imgLogoEncab = new javax.swing.JLabel();
        jpanPrincipal = new javax.swing.JPanel();
        PanelMenuSecre = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MenusSecre = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1500, 850));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpFooter.setBackground(new java.awt.Color(217, 217, 217));
        jpFooter.setPreferredSize(new java.awt.Dimension(1230, 70));
        jpFooter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel2.setText("Universidad Técnica de Ambato - FISEI");
        jpFooter.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jPanel5.setBackground(new java.awt.Color(169, 169, 169));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgLogoFisei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrames/Logo_FISEI.png"))); // NOI18N
        jPanel5.add(imgLogoFisei, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 70, 80));

        imgLogoUta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLogoUta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrames/Logo UTA.png"))); // NOI18N
        jPanel5.add(imgLogoUta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, 80));

        jpFooter.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 0, 210, 110));

        jPanel2.add(jpFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 740, 1500, 110));

        jpOpBar.setBackground(new java.awt.Color(204, 204, 204));
        jpOpBar.setPreferredSize(new java.awt.Dimension(1250, 30));
        jpOpBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpMinim.setBackground(new java.awt.Color(114, 96, 96));
        jpMinim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpMinimMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpMinimMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpMinimMouseExited(evt);
            }
        });

        Minim.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        Minim.setForeground(new java.awt.Color(255, 255, 255));
        Minim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minim.setText("_");
        Minim.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jpMinimLayout = new javax.swing.GroupLayout(jpMinim);
        jpMinim.setLayout(jpMinimLayout);
        jpMinimLayout.setHorizontalGroup(
            jpMinimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMinimLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Minim)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpMinimLayout.setVerticalGroup(
            jpMinimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMinimLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Minim, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpOpBar.add(jpMinim, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 0, 40, 30));

        jpCerrar.setBackground(new java.awt.Color(255, 51, 51));
        jpCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpCerrarMouseExited(evt);
            }
        });

        X.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        X.setForeground(new java.awt.Color(255, 255, 255));
        X.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        X.setText("X");
        X.setToolTipText("");
        X.setMaximumSize(new java.awt.Dimension(17, 39));
        X.setMinimumSize(new java.awt.Dimension(17, 39));
        X.setPreferredSize(new java.awt.Dimension(17, 39));
        X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpCerrarLayout = new javax.swing.GroupLayout(jpCerrar);
        jpCerrar.setLayout(jpCerrarLayout);
        jpCerrarLayout.setHorizontalGroup(
            jpCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCerrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(X, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpCerrarLayout.setVerticalGroup(
            jpCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(X, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpOpBar.add(jpCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 0, 50, 30));

        jPanel2.add(jpOpBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 30));

        jpHeader.setBackground(new java.awt.Color(236, 71, 71));
        jpHeader.setPreferredSize(new java.awt.Dimension(1250, 100));
        jpHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpHeaderMouseDragged(evt);
            }
        });
        jpHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpHeaderMousePressed(evt);
            }
        });
        jpHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegDocen.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 32)); // NOI18N
        RegDocen.setForeground(new java.awt.Color(255, 255, 255));
        RegDocen.setText("REGISTRO ESTUDIANTIL");
        jpHeader.add(RegDocen, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));

        imgLogoEncab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLogoEncab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrames/registroEstudiantil.png"))); // NOI18N
        jpHeader.add(imgLogoEncab, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 93, 74));

        jPanel2.add(jpHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1500, 120));

        jpanPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jpanPrincipal.setLayout(new java.awt.BorderLayout());
        jPanel2.add(jpanPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 1250, 590));

        jScrollPane1.setBorder(null);

        MenusSecre.setBackground(new java.awt.Color(63, 78, 79));
        MenusSecre.setToolTipText("");
        MenusSecre.setLayout(new javax.swing.BoxLayout(MenusSecre, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(MenusSecre);

        javax.swing.GroupLayout PanelMenuSecreLayout = new javax.swing.GroupLayout(PanelMenuSecre);
        PanelMenuSecre.setLayout(PanelMenuSecreLayout);
        PanelMenuSecreLayout.setHorizontalGroup(
            PanelMenuSecreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        PanelMenuSecreLayout.setVerticalGroup(
            PanelMenuSecreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        jPanel2.add(PanelMenuSecre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 250, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpHeaderMousePressed
        this.xMouse = evt.getX();
        this.yMouse = evt.getY();
    }//GEN-LAST:event_jpHeaderMousePressed

    private void jpHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpHeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - this.xMouse, y - this.yMouse);
    }//GEN-LAST:event_jpHeaderMouseDragged

    private void jpMinimMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMinimMouseExited
        this.jpMinim.setBackground(new Color(114, 96, 96));
    }//GEN-LAST:event_jpMinimMouseExited

    private void jpMinimMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMinimMouseEntered
        this.jpMinim.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_jpMinimMouseEntered

    private void jpMinimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMinimMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jpMinimMouseClicked

    private void jpCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jpCerrarMouseClicked

    private void jpCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCerrarMouseEntered
        this.jpCerrar.setBackground(Color.white);
        this.X.setForeground(Color.red);
    }//GEN-LAST:event_jpCerrarMouseEntered

    private void jpCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCerrarMouseExited
        this.jpCerrar.setBackground(new Color(255, 0, 0));
        this.X.setForeground(Color.white);
    }//GEN-LAST:event_jpCerrarMouseExited

    private void XMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseClicked
        System.exit(0);
    }//GEN-LAST:event_XMouseClicked

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
            java.util.logging.Logger.getLogger(paginaPrincipal_Secre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paginaPrincipal_Secre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paginaPrincipal_Secre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paginaPrincipal_Secre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paginaPrincipal_Secre().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenusSecre;
    private javax.swing.JLabel Minim;
    private javax.swing.JPanel PanelMenuSecre;
    private javax.swing.JLabel RegDocen;
    private javax.swing.JLabel X;
    private javax.swing.JLabel imgLogoEncab;
    private javax.swing.JLabel imgLogoFisei;
    private javax.swing.JLabel imgLogoUta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpCerrar;
    private javax.swing.JPanel jpFooter;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpMinim;
    private javax.swing.JPanel jpOpBar;
    private javax.swing.JPanel jpanPrincipal;
    // End of variables declaration//GEN-END:variables
}
