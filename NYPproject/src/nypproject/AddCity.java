package nypproject;

import java.awt.Color;
import java.util.ArrayList;

public class AddCity extends javax.swing.JFrame {

    public AddCity() {
        Connections con = new Connections();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        x = new javax.swing.JTextField();
        y = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        message = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 400));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X Coordinate");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Y Coordinate");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jButton8.setBackground(new Color(0,0,0,0));
        jButton8.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("ADD");
        jButton8.setBorder(null);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setOpaque(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));

        jButton9.setBackground(new Color(0,0,0,0));
        jButton9.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Back");
        jButton9.setBorder(null);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setOpaque(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new Color(0,0,0,0));
        jTextField1.setFont(new java.awt.Font("Ubuntu Mono", 1, 40)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("ADMIN PANEL");
        jTextField1.setBorder(null);
        jTextField1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1.setOpaque(false);
        kGradientPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 280, 60));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NAME");
        jLabel4.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 46, -1));

        x.setBackground(new Color(0,0,0,0));
        x.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        x.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        x.setForeground(new java.awt.Color(255, 255, 255));
        x.setOpaque(false);
        kGradientPanel1.add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 162, -1));

        y.setBackground(new Color(0,0,0,0));
        y.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        y.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        y.setForeground(new java.awt.Color(255, 255, 255));
        y.setOpaque(false);
        kGradientPanel1.add(y, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 162, -1));

        name.setBackground(new Color(0,0,0,0));
        name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        name.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setOpaque(false);
        kGradientPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 162, -1));

        message.setEditable(false);
        message.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        message.setBackground(new Color(0,0,0,0));
        message.setBorder(null);
        message.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        message.setForeground(new java.awt.Color(0, 0, 0));
        message.setOpaque(false);
        kGradientPanel1.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 200, 30));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String Name = name.getText().toUpperCase();
        String X = x.getText();
        String Y = y.getText();

        boolean flag = true;
        ArrayList<City> ct = new ArrayList();
        ct = Connections.GetCities();
        if (Name.equals("") || X.equals("") || Y.equals("")) {
            message.setText("*All Areas Must Be Filled*");
        } else {
            for (City city : ct) {
                if (city.getName().equals(Name)) {
                    flag = false;
                }
            }
            if (flag) {
                boolean flag1 = tryParseInt(X);
                boolean flag2 = tryParseInt(Y);

                if (flag1 && flag2) {
                    Connections.AddCity(Name, X + "," + Y);
                    name.setText("");
                    y.setText("");
                    x.setText("");
                } else {
                    message.setText("*Cordinates Must Be Numbers*");
                }
            } else {
                message.setText("*That City Exist*");
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Admin admin = new Admin();
        admin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField message;
    private javax.swing.JTextField name;
    private javax.swing.JTextField x;
    private javax.swing.JTextField y;
    // End of variables declaration//GEN-END:variables
}
