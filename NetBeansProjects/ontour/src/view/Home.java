/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author luisponce
 */
public class Home extends javax.swing.JFrame {
    UsuarioListado usuarioListado = new UsuarioListado();
    UsuarioNuevo usuarioNuevo = new UsuarioNuevo();
    
    PaqueteNuevo paqueteNuevo = new PaqueteNuevo();
    PaqueteListado paqueteListado = new PaqueteListado();
    
    /**
     * Creates new form home
     */
    public Home() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setBackground(Color.white);
        this.setState(this.NORMAL);
        this.setExtendedState( this.getExtendedState()|this.MAXIMIZED_BOTH );
        /* load home page */ 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        menuVerUSuarios = new javax.swing.JMenuItem();
        menuAddUsuario = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        btnVerPaquetes = new javax.swing.JMenuItem();
        btnNuevoPaquete = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        cerrarPrograma = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        jMenu6.setText("jMenu6");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setUndecorated(true);
        setPreferredSize(null);

        jMenu4.setText("Usuarios");

        menuVerUSuarios.setText("Ver usuarios");
        menuVerUSuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerUSuariosActionPerformed(evt);
            }
        });
        jMenu4.add(menuVerUSuarios);

        menuAddUsuario.setText("Añadir usuario");
        menuAddUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddUsuarioActionPerformed(evt);
            }
        });
        jMenu4.add(menuAddUsuario);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Paquetes de viajes");

        btnVerPaquetes.setText("Ver paquetes turísticos");
        btnVerPaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPaquetesActionPerformed(evt);
            }
        });
        jMenu5.add(btnVerPaquetes);

        btnNuevoPaquete.setText("Crear un paquete turístico");
        btnNuevoPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPaqueteActionPerformed(evt);
            }
        });
        jMenu5.add(btnNuevoPaquete);

        jMenuBar1.add(jMenu5);

        jMenu7.setText("Salir");

        cerrarPrograma.setText("Cerrar Sesión");
        cerrarPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarProgramaActionPerformed(evt);
            }
        });
        jMenu7.add(cerrarPrograma);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*
    
    */
    private void menuVerUSuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerUSuariosActionPerformed
        // Muestra ventana usuarios
        this.add(usuarioListado);
        usuarioListado.show();
        usuarioNuevo.hide();
        paqueteNuevo.hide();
        paqueteListado.hide();
    }//GEN-LAST:event_menuVerUSuariosActionPerformed

    private void menuAddUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddUsuarioActionPerformed
        // Muestra ventana añadir usuario
        BasicInternalFrameUI bi = (BasicInternalFrameUI)usuarioNuevo.getUI();
        this.add(usuarioNuevo);
        usuarioNuevo.show();
        usuarioListado.hide();
        paqueteNuevo.hide();
        paqueteListado.hide();
    }//GEN-LAST:event_menuAddUsuarioActionPerformed

    private void cerrarProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarProgramaActionPerformed
        // Cierra la aplicación
        System.exit(0);
    }//GEN-LAST:event_cerrarProgramaActionPerformed

    private void btnVerPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPaquetesActionPerformed
        // Muestra ventana paquetes
        this.add(paqueteListado);
        paqueteListado.show();
        paqueteListado.actualizar();
        paqueteNuevo.hide();
        usuarioNuevo.hide();
        usuarioListado.hide();
    }//GEN-LAST:event_btnVerPaquetesActionPerformed

    private void btnNuevoPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPaqueteActionPerformed
        // Muestra ventana nuevo paquete
        this.add(paqueteNuevo);
        paqueteNuevo.show();
        paqueteListado.hide();
        usuarioNuevo.hide();
        usuarioListado.hide();
    }//GEN-LAST:event_btnNuevoPaqueteActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnNuevoPaquete;
    private javax.swing.JMenuItem btnVerPaquetes;
    private javax.swing.JMenuItem cerrarPrograma;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem menuAddUsuario;
    private javax.swing.JMenuItem menuVerUSuarios;
    // End of variables declaration//GEN-END:variables
}
