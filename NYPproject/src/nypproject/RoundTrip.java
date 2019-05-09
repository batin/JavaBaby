package nypproject;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RoundTrip extends javax.swing.JFrame {

    static DefaultTableModel model;
    static DefaultTableModel model2;
    Connections con = new Connections();
    static ArrayList<Plane> Planes = new ArrayList<>();
    static ArrayList<Plane> Planes2 = new ArrayList<>();
    public static Plane p1;
    public static Plane p2;

    public RoundTrip() {
        initComponents();
        model = (DefaultTableModel) Ftable2.getModel();
        model2 = (DefaultTableModel) Ftable1.getModel();
        showPlanes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Ftable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Ftable1 = new javax.swing.JTable();
        label1 = new java.awt.Label();
        label3 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 400));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ftable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plane Name", "Departure Time", "Arrival Time", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Ftable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 375, 275));

        jButton1.setText("Choose");
        jButton1.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 140, 37));

        jButton2.setText("Back");
        jButton2.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        Ftable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plane Name", "Departure Time", "Arrival Time", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(Ftable1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 375, 275));

        label1.setFont(new java.awt.Font("Ubuntu Mono", 1, 36)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("To");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 110, 30));

        label3.setFont(new java.awt.Font("Ubuntu Mono", 1, 36)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("From");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int selectedrow = Ftable2.getSelectedRow();
        if (selectedrow == -1) {
            if (model.getRowCount() == 0) {

                JOptionPane.showMessageDialog(this, "Table is Empty");

            } else {

                JOptionPane.showMessageDialog(this, "Please Choose a Plane");

            }

        } else {

            String name = (String) model.getValueAt(selectedrow, 0);
            String Dp = (String) model.getValueAt(selectedrow, 1);
            String Ar = (String) model.getValueAt(selectedrow, 2);
            String Date = (String) model.getValueAt(selectedrow, 3);

            String name2 = (String) model2.getValueAt(selectedrow, 0);
            String Dp2 = (String) model2.getValueAt(selectedrow, 1);
            String Ar2 = (String) model2.getValueAt(selectedrow, 2);
            String Date2 = (String) model2.getValueAt(selectedrow, 3);

            for (Plane P : Planes2) {

                if (P.getName().equals(name2)) {

                    Plane Pl = new Plane(name2, P.getDeparture(), P.getArrival(), Dp2, Ar2, Date2);
                    p2 = Pl;

                }
            }

            for (Plane P : Planes) {

                if (P.getName().equals(name)) {

                    Plane Pl = new Plane(name, P.getDeparture(), P.getArrival(), Dp, Ar, Date);
                    p1 = Pl;
                    this.setVisible(false);
                    P.setVisible(true);
                }
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    final public void showPlanes() {
        model.setRowCount(0);

        Planes = con.GetSelectedPlanes(BuyTicket.From, BuyTicket.To, BuyTicket.Date1);

        if (Planes != null) {

            for (Plane P : Planes) {

                Object[] add = {P.getName(), P.getLiftOffTime(), P.getLandingTime(), P.getDate()};

                model.addRow(add);

            }
        }

        Planes2 = con.GetSelectedPlanes(BuyTicket.To, BuyTicket.From, BuyTicket.Date2);

        if (!Planes2.isEmpty()) {

            for (Plane P : Planes2) {

                Object[] add = {P.getName(), P.getLiftOffTime(), P.getLandingTime(), P.getDate()};

                model2.addRow(add);

            }
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        BuyTicket by = new BuyTicket();
        this.setVisible(false);
        by.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Ftable1;
    private javax.swing.JTable Ftable2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label label1;
    private java.awt.Label label3;
    // End of variables declaration//GEN-END:variables
}
