package nypproject;

public class OpeninPage extends javax.swing.JFrame {

    public OpeninPage() {
        initComponents();
        AdminB.setOpaque(false);
        AdminB.setContentAreaFilled(false);
        AdminB.setBorderPainted(false);
        rg.setOpaque(false);
        rg.setContentAreaFilled(false);
        rg.setBorderPainted(false);
        ex.setOpaque(false);
        ex.setContentAreaFilled(false);
        ex.setBorderPainted(false);
        lg.setOpaque(false);
        lg.setContentAreaFilled(false);
        lg.setBorderPainted(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ex = new javax.swing.JButton();
        rg = new javax.swing.JButton();
        AdminB = new javax.swing.JButton();
        lg = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(650, 400));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ex.setBackground(new java.awt.Color(255, 255, 255));
        ex.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        ex.setForeground(new java.awt.Color(255, 0, 0));
        ex.setText("EXIT");
        ex.setBorder(null);
        ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exActionPerformed(evt);
            }
        });
        getContentPane().add(ex, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, -1));

        rg.setBackground(new java.awt.Color(255, 255, 255));
        rg.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        rg.setForeground(new java.awt.Color(255, 0, 0));
        rg.setText("REGISTER");
        rg.setBorder(null);
        rg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgActionPerformed(evt);
            }
        });
        getContentPane().add(rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        AdminB.setOpaque(false);
        AdminB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminBActionPerformed(evt);
            }
        });
        AdminB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AdminBKeyReleased(evt);
            }
        });
        getContentPane().add(AdminB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 48, 22));

        lg.setBackground(new java.awt.Color(255, 255, 255));
        lg.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        lg.setForeground(new java.awt.Color(255, 0, 0));
        lg.setText("LOGIN");
        lg.setBorder(null);
        lg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgActionPerformed(evt);
            }
        });
        getContentPane().add(lg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nypproject/images/Opening.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exActionPerformed

    private void rgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgActionPerformed
        Register rgs = new Register();
        rgs.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_rgActionPerformed

    private void AdminBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminBActionPerformed
        Admin admin = new Admin();
        admin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AdminBActionPerformed

    private void AdminBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AdminBKeyReleased
        setVisible(false);
    }//GEN-LAST:event_AdminBKeyReleased

    private void lgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgActionPerformed
        Login lg = new Login();
        this.setVisible(false);
        lg.setVisible(true);

    }//GEN-LAST:event_lgActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(OpeninPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpeninPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpeninPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpeninPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpeninPage().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminB;
    private javax.swing.JButton ex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton lg;
    private javax.swing.JButton rg;
    // End of variables declaration//GEN-END:variables

}
