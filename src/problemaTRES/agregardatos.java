/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaTRES;

import java.sql.CallableStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author MARAUD
 */
public class agregardatos extends javax.swing.JFrame {

    /**
     * Creates new form agregardatos
     */
    public agregardatos() {
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

        tipocarretera = new javax.swing.JComboBox<>();
        tramoIDbox = new javax.swing.JTextField();
        kmbox = new javax.swing.JTextField();
        iniciobox = new javax.swing.JTextField();
        finalbox = new javax.swing.JTextField();
        text1 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        text3 = new javax.swing.JLabel();
        text4 = new javax.swing.JLabel();
        text5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        botonguardardatos = new javax.swing.JButton();
        botonsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tipocarretera.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tipocarretera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Locales", "Comerciales", "Autovías", "Regionales" }));
        tipocarretera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipocarreteraActionPerformed(evt);
            }
        });

        tramoIDbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tramoIDboxActionPerformed(evt);
            }
        });

        kmbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kmboxActionPerformed(evt);
            }
        });

        text1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text1.setText("Tipo de Carretera :");

        text2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text2.setText("Km de Carretera:");

        text3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text3.setText("ID Tramo:");

        text4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text4.setText("Comuna Inicio:");

        text5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text5.setText("Comuna Final:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Ingrese Datos de Tramo");

        botonguardardatos.setText("Guardar Datos");
        botonguardardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonguardardatosActionPerformed(evt);
            }
        });

        botonsalir.setText("SALIR");
        botonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tipocarretera, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tramoIDbox)
                            .addComponent(iniciobox)
                            .addComponent(finalbox, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(kmbox, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(botonguardardatos, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(botonsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tramoIDbox, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tipocarretera)
                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kmbox, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iniciobox, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finalbox, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonguardardatos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tramoIDboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tramoIDboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tramoIDboxActionPerformed

    private void kmboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kmboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kmboxActionPerformed

    private void botonguardardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonguardardatosActionPerformed
        try{
		//Conexion conn = new Conexion();
                Connection con = Conexion.getConexion();
		String comunaINI, comunaFIN, carreteraTipo;
		int tramoID, kmcarretera;
		tramoID = Integer.parseInt(tramoIDbox.getText());
		carreteraTipo =(String) tipocarretera.getSelectedItem();
		kmcarretera = Integer.parseInt(kmbox.getText());
                comunaINI = iniciobox.getText();
		comunaFIN = finalbox.getText();
		CallableStatement cstmt = con.prepareCall("{call dbo.tramotabla(?,?,?,?,?)}");
                // NO CONECTA TODAVIA
		cstmt.setDouble(1,tramoID);
                cstmt.setString(2,carreteraTipo);
                cstmt.setDouble(3,kmcarretera);
                cstmt.setString(4,comunaINI);
		cstmt.setString(5,comunaFIN);
                System.out.println("Logrado 3");
		cstmt.execute();

		principal ventprin = new principal();
                ventprin.setVisible(true);
                dispose();
			
		}catch(Exception ex){
			JOptionPane.showMessageDialog(this,"Error Datos mal ingresados");
        }
    }//GEN-LAST:event_botonguardardatosActionPerformed

    private void botonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsalirActionPerformed
        principal ventprin = new principal();
        ventprin.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonsalirActionPerformed

    private void tipocarreteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipocarreteraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipocarreteraActionPerformed

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
            java.util.logging.Logger.getLogger(agregardatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregardatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregardatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregardatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregardatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonguardardatos;
    private javax.swing.JButton botonsalir;
    private javax.swing.JTextField finalbox;
    private javax.swing.JTextField iniciobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField kmbox;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    private javax.swing.JComboBox<String> tipocarretera;
    private javax.swing.JTextField tramoIDbox;
    // End of variables declaration//GEN-END:variables
}