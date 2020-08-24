package problemaTRES;

import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MARAUD
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userlogin = new javax.swing.JTextField();
        passlogin = new javax.swing.JPasswordField();
        botonlogin = new javax.swing.JButton();
        registrologin = new javax.swing.JButton();
        mensajelogin = new javax.swing.JLabel();
        imagendefondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empresa ProblemaTRES");
        setName("problema3"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userlogin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        userlogin.setForeground(new java.awt.Color(102, 102, 102));
        userlogin.setText("Usuario");
        userlogin.setToolTipText("");
        userlogin.setOpaque(false);
        userlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userloginActionPerformed(evt);
            }
        });
        getContentPane().add(userlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 230, 40));

        passlogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passlogin.setText("Clave");
        passlogin.setOpaque(false);
        getContentPane().add(passlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 230, 40));

        botonlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/boton.png"))); // NOI18N
        botonlogin.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/botonX.png"))); // NOI18N
        botonlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonloginActionPerformed(evt);
            }
        });
        getContentPane().add(botonlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 130, 50));

        registrologin.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        registrologin.setForeground(new java.awt.Color(0, 188, 212));
        registrologin.setText("Registrate");
        registrologin.setAlignmentY(0.0F);
        registrologin.setContentAreaFilled(false);
        registrologin.setMargin(new java.awt.Insets(1, 2, 2, 1));
        registrologin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrologinActionPerformed(evt);
            }
        });
        getContentPane().add(registrologin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 457, -1, 30));

        mensajelogin.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        mensajelogin.setText("¿Todavía no tienes cuenta?");
        getContentPane().add(mensajelogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 200, 40));

        imagendefondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/login.png"))); // NOI18N
        imagendefondo.setText("jLabel1");
        getContentPane().add(imagendefondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userloginActionPerformed

    private void registrologinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrologinActionPerformed
        registro ventregis = new registro();
        ventregis.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registrologinActionPerformed

    private void botonloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonloginActionPerformed
        String adm = "user", passbase ="1234";
        String passuser = new String(passlogin.getPassword());
        String ingreso = userlogin.getText();
        
        if(!ingreso.equals(adm) || !passuser.equals(passbase)){
            JOptionPane.showMessageDialog(this,"Ingreso Incorrecto, Datos Erroneos");
        }
        else{
            principal ventprin = new principal();
            ventprin.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_botonloginActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonlogin;
    private javax.swing.JLabel imagendefondo;
    private javax.swing.JLabel mensajelogin;
    private javax.swing.JPasswordField passlogin;
    private javax.swing.JButton registrologin;
    private javax.swing.JTextField userlogin;
    // End of variables declaration//GEN-END:variables
}