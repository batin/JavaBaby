package nypproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditPlane extends javax.swing.JFrame {

    static DefaultTableModel model;
    Connections con = new Connections();

    public EditPlane() {
        initComponents();
        model = (DefaultTableModel) jTable1.getModel();
        showPlanes();
        showCities();
    }

    public static void showPlanes() {
        model.setRowCount(0);
        ArrayList<Plane> Planes = new ArrayList<>();
        Planes = Connections.GetPlanes();

        if (Planes != null) {
            for (Plane P : Planes) {
                Object[] add = {P.getName(), P.getDeparture(), P.getArrival(), P.getLiftOffTime(), P.getLandingTime(), P.getDate()};
                model.addRow(add);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        label2 = new java.awt.Label();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lft = new com.github.lgooddatepicker.components.TimePicker();
        lnd = new com.github.lgooddatepicker.components.TimePicker();
        arri = new javax.swing.JComboBox<>();
        dpc = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        dt = new com.github.lgooddatepicker.components.DatePicker();

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Ubuntu Mono", 1, 36)); // NOI18N
        label1.setText("ADMIN PANEL");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 400));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("ARRIVAL");
        jLabel2.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.red);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 175, 81, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("DEPARTURE");
        jLabel3.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.red);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 133, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "DEPARTURE", "ARRIVAL", "LIFTOFF", "LANDING", "DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFont(new java.awt.Font("Ubuntu Mono", 1, 12)); // NOI18N
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 329, 586, 223));

        jButton1.setText("UPDATE");
        jButton1.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 131, 276, 71));

        jButton2.setText("BACK");
        jButton2.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 242, 276, 36));

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("Ubuntu Mono", 1, 36)); // NOI18N
        label2.setText("ADMIN PANEL");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 586, 86));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("LIFT-OFF");
        jLabel4.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.red);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 216, 81, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("LANDING");
        jLabel5.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.red);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 246, 81, 25));
        getContentPane().add(lft, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 215, 97, -1));
        getContentPane().add(lnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 248, 97, -1));

        getContentPane().add(arri, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 173, 97, -1));

        getContentPane().add(dpc, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 131, 138, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("DATE");
        jLabel7.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 278, 81, 27));
        getContentPane().add(dt, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 282, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedrow = jTable1.getSelectedRow();
        String ar = arri.getSelectedItem().toString();
        String de = dpc.getSelectedItem().toString();
        String lo = lft.getText();
        String ld = lnd.getText();

        if (selectedrow == -1) {
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table is Empty");
            } else {
                JOptionPane.showMessageDialog(this, "Please Choose a Plane");
            }
        } else {

            String name = (String) model.getValueAt(selectedrow, 0);
            LocalDate oDate = dt.getDate();
            String D = oDate.getYear() + "-" + oDate.getMonthValue() + "-" + oDate.getDayOfMonth();

            Connections.EditPlane(name, ar, de, lo, ld, D);
            showPlanes();
            JOptionPane.showMessageDialog(this, "Updated Succesfully");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Admin admin = new Admin();
        admin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selectedrow = jTable1.getSelectedRow();

        dpc.setSelectedItem(model.getValueAt(selectedrow, 1));
        arri.setSelectedItem(model.getValueAt(selectedrow, 2));
        String lo1 = model.getValueAt(selectedrow, 3).toString();
        lft.setText(lo1);
        String lnd1 = model.getValueAt(selectedrow, 4).toString();
        lnd.setText(lnd1);

    }//GEN-LAST:event_jTable1MouseClicked

    private void showCities() {

        ArrayList<City> cList = new ArrayList<>();
        cList = Connections.GetCities();
        if (cList != null) {
            for (City P : cList) {
                arri.addItem(P.getName());
                dpc.addItem(P.getName());
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> arri;
    private javax.swing.JComboBox<String> dpc;
    private com.github.lgooddatepicker.components.DatePicker dt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private com.github.lgooddatepicker.components.TimePicker lft;
    private com.github.lgooddatepicker.components.TimePicker lnd;
    // End of variables declaration//GEN-END:variables
}
