package nypproject;

import java.awt.Color;
import java.util.ArrayList;

public class UserInterface extends javax.swing.JFrame {

    String Mail;
    String Pass;

    public UserInterface(String Mail, String Pass) {
        this.Mail = Mail;
        this.Pass = Pass;

        initComponents();
        Info();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        InfoHolder = new javax.swing.JTextField();
        InfoHolder1 = new javax.swing.JTextField();
        InfoHolder2 = new javax.swing.JTextField();
        BUYT = new javax.swing.JTextField();
        EXIT = new javax.swing.JTextField();
        MYT = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        my = new javax.swing.JLabel();
        by = new javax.swing.JLabel();
        pp = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(600, 400));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(42, 162, 252));
        kGradientPanel1.setkGradientFocus(300);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 51, 102));
        kGradientPanel1.setkTransparentControls(false);
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InfoHolder.setEditable(false);
        InfoHolder.setBackground(new Color(0,0,0,0));
        InfoHolder.setFont(new java.awt.Font("Ubuntu Mono", 1, 36)); // NOI18N
        InfoHolder.setForeground(new java.awt.Color(255, 255, 255));
        InfoHolder.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InfoHolder.setToolTipText("");
        InfoHolder.setBorder(null);
        InfoHolder.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        InfoHolder.setOpaque(false);
        kGradientPanel1.add(InfoHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 150, 30));

        InfoHolder1.setEditable(false);
        InfoHolder1.setBackground(new Color(0,0,0,0));
        InfoHolder1.setFont(new java.awt.Font("Ubuntu Mono", 1, 36)); // NOI18N
        InfoHolder1.setForeground(new java.awt.Color(255, 255, 255));
        InfoHolder1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InfoHolder1.setToolTipText("");
        InfoHolder1.setBorder(null);
        InfoHolder1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        InfoHolder1.setOpaque(false);
        kGradientPanel1.add(InfoHolder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, 30));

        InfoHolder2.setEditable(false);
        InfoHolder2.setBackground(new Color(0,0,0,0));
        InfoHolder2.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        InfoHolder2.setForeground(new java.awt.Color(255, 255, 255));
        InfoHolder2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        InfoHolder2.setToolTipText("");
        InfoHolder2.setBorder(null);
        InfoHolder2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        InfoHolder2.setOpaque(false);
        kGradientPanel1.add(InfoHolder2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 190, 30));

        BUYT.setEditable(false);
        BUYT.setBackground(new Color(0,0,0,0));
        BUYT.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        BUYT.setForeground(new java.awt.Color(255, 255, 255));
        BUYT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BUYT.setText("BUY TICKET");
        BUYT.setToolTipText("");
        BUYT.setBorder(null);
        BUYT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BUYT.setOpaque(false);
        kGradientPanel1.add(BUYT, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, 20));

        EXIT.setEditable(false);
        EXIT.setBackground(new Color(0,0,0,0));
        EXIT.setFont(new java.awt.Font("Ubuntu Mono", 1, 20)); // NOI18N
        EXIT.setForeground(new java.awt.Color(255, 255, 255));
        EXIT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EXIT.setText("EXIT");
        EXIT.setToolTipText("");
        EXIT.setBorder(null);
        EXIT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EXIT.setOpaque(false);
        kGradientPanel1.add(EXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 40, -1));

        MYT.setEditable(false);
        MYT.setBackground(new Color(0,0,0,0));
        MYT.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        MYT.setForeground(new java.awt.Color(255, 255, 255));
        MYT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MYT.setText("MY TICKETS");
        MYT.setToolTipText("");
        MYT.setBorder(null);
        MYT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MYT.setOpaque(false);
        kGradientPanel1.add(MYT, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, 20));

        jButton4.setBackground(new Color(0,0,0,0));
        jButton4.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("LOG OUT");
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 92, 39));

        my.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nypproject/images/tickets2.png"))); // NOI18N
        my.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        my.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myMouseClicked(evt);
            }
        });
        kGradientPanel1.add(my, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 190, 180));

        by.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nypproject/images/flight2.png"))); // NOI18N
        by.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        by.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                byMouseClicked(evt);
            }
        });
        kGradientPanel1.add(by, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 180, 160));

        pp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nypproject/images/default-user.png"))); // NOI18N
        kGradientPanel1.add(pp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 140));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nypproject/images/exit.png"))); // NOI18N
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        kGradientPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 170, 140));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myMouseClicked

        MyTickets myt = new MyTickets(Mail);
        this.setVisible(false);
        myt.setVisible(true);

    }//GEN-LAST:event_myMouseClicked

    private void byMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_byMouseClicked

        BuyTicket byt = new BuyTicket();
        this.setVisible(false);
        byt.setVisible(true);

    }//GEN-LAST:event_byMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked

        System.exit(0);

    }//GEN-LAST:event_exitMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        OpeninPage opn = new OpeninPage();
        opn.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void Info() {

        ArrayList<Account> arr = new ArrayList();
        arr = Connections.GetAccounts();

        for (Account account : arr) {

            if (account.geteMail().equals(Mail) && account.getPassword().equals(Pass)) {

                InfoHolder.setText(account.getName());
                InfoHolder1.setText(account.getSurname());
                InfoHolder2.setText(account.geteMail());

            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BUYT;
    private javax.swing.JTextField EXIT;
    private javax.swing.JTextField InfoHolder;
    private javax.swing.JTextField InfoHolder1;
    private javax.swing.JTextField InfoHolder2;
    private javax.swing.JTextField MYT;
    private javax.swing.JLabel by;
    private javax.swing.JLabel exit;
    private javax.swing.JButton jButton4;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel my;
    private javax.swing.JLabel pp;
    // End of variables declaration//GEN-END:variables
}
