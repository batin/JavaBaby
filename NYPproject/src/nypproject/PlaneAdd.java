package nypproject;

import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;

public class PlaneAdd extends javax.swing.JFrame {

    public ArrayList<Plane> PlaneList = new ArrayList<>();

    public PlaneAdd() {
        Connections con = new Connections();
        initComponents();
        showCities();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        date1 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ld1 = new com.github.lgooddatepicker.components.TimePicker();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        lo1 = new com.github.lgooddatepicker.components.TimePicker();
        jLabel5 = new javax.swing.JLabel();
        c1 = new javax.swing.JComboBox<>();
        c2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("BIRTH DAY");
        jLabel6.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(610, 400));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setOpaque(false);
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        date1.setOpaque(false);
        kGradientPanel1.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 178, 33));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NAME");
        jLabel1.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 46, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ARRIVAL");
        jLabel2.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        ld1.setOpaque(false);
        kGradientPanel1.add(ld1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("DATE");
        jLabel7.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 81, 27));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DEPARTURE");
        jLabel3.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 26));

        jButton8.setText("ADD");
        jButton8.setBackground(new Color(0,0,0,0));
        jButton8.setBorder(null);
        jButton8.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setOpaque(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        name.setBackground(new Color(0,0,0,0));
        name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        name.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setOpaque(false);
        kGradientPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 162, -1));

        lo1.setOpaque(false);
        kGradientPanel1.add(lo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("LANDING");
        jLabel5.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 25));

        c1.setAutoscrolls(true);
        c1.setBackground(new Color(0,0,0,0));
        c1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        c1.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        c1.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 162, -1));

        c2.setAutoscrolls(true);
        c2.setBackground(new Color(0,0,0,0));
        c2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        c2.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        c2.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 162, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LIFT-OFF");
        jLabel4.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 32));

        jButton9.setText("Back");
        jButton9.setBackground(new Color(0,0,0,0));
        jButton9.setBorder(null);
        jButton9.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setOpaque(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new Color(0,0,0,0));
        jTextField1.setFont(new java.awt.Font("Ubuntu Mono", 1, 40)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("ADMIN PANEL");
        jTextField1.setBorder(null);
        jTextField1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1.setOpaque(false);
        kGradientPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 280, 60));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       
        LocalDate oDate = date1.getDate();
        String date = oDate.getYear() + "-" + oDate.getMonthValue() + "-" + oDate.getDayOfMonth();
        Connections.AddPlane(name.getText(), c1.getSelectedItem().toString(), c2.getSelectedItem().toString(), ld1.getText(), lo1.getText(), date);

        name.setText("");
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        Admin admin = new Admin();
        admin.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void showCities() {

        ArrayList<City> cList = new ArrayList<>();
        cList = Connections.GetCities();
       
        if (cList != null) {
           
            for (City P : cList) {
                c1.addItem(P.getName());
                c2.addItem(P.getName());
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JComboBox<String> c2;
    private com.github.lgooddatepicker.components.DatePicker date1;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private com.github.lgooddatepicker.components.TimePicker ld1;
    private com.github.lgooddatepicker.components.TimePicker lo1;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
