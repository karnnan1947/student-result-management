/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentresult;

/**
 *
 * @author USER
 */
public class start extends javax.swing.JFrame {

     /**
      * Creates new form start
      */
     public start() {
          initComponents();
     }

     /**
      * This method is called from within the constructor to initialize the
      * form. WARNING: Do NOT modify this code. The content of this method is
      * always regenerated by the Form Editor.
      */
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          student = new javax.swing.JButton();
          admin = new javax.swing.JButton();
          jLabel1 = new javax.swing.JLabel();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

          student.setBackground(new java.awt.Color(102, 153, 255));
          student.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
          student.setForeground(new java.awt.Color(0, 51, 51));
          student.setText("STUDENT");
          student.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    studentActionPerformed(evt);
               }
          });
          getContentPane().add(student, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

          admin.setBackground(new java.awt.Color(255, 51, 0));
          admin.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
          admin.setForeground(new java.awt.Color(0, 51, 51));
          admin.setText("ADMIN");
          admin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
          admin.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    adminActionPerformed(evt);
               }
          });
          getContentPane().add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 100, -1));

          jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentresult/ssss.jpg"))); // NOI18N
          getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 300));

          setSize(new java.awt.Dimension(970, 337));
          setLocationRelativeTo(null);
     }// </editor-fold>//GEN-END:initComponents

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        // TODO add your handling code here:
        setVisible(false);
     new adminIndex().setVisible(true);
    }//GEN-LAST:event_adminActionPerformed

    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed
        // TODO add your handling code here:
        setVisible(false);
     new studentIndex().setVisible(true);
    }//GEN-LAST:event_studentActionPerformed
     
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
               java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex) {
               java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
               java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
          //</editor-fold>

          /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new start().setVisible(true);
               }
          });
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton admin;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JButton student;
     // End of variables declaration//GEN-END:variables
}
