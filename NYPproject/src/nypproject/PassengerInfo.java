package nypproject;

import com.github.lgooddatepicker.components.DatePickerSettings;
import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PassengerInfo extends javax.swing.JFrame {

    static ArrayList<String> seatlist = new ArrayList();
    static float CheckOut;
    private final String Seat1;
    private final String Seat2;

    public PassengerInfo(String Seat1, String Seat2) {
        Connections con = new Connections();
        this.Seat1 = Seat1;
        this.Seat2 = Seat2;
        initComponents();
        d1.setDate(LocalDate.now()); // bu günün tarihi
        DatePickerSettings settings1 = d1.getSettings();
        
        settings1.setGapBeforeButtonPixels(-2);
        
        settings1.setFontVetoedDate(new java.awt.Font("Ubuntu Mono", 1, 16));
        
        settings1.setFontValidDate(new java.awt.Font("Ubuntu Mono", 1, 16));
        
        settings1.setColor(DatePickerSettings.DateArea.TextFieldBackgroundValidDate,new Color(0, 0, 0, 0));
        
        d1.getComponentToggleCalendarButton().setText("Choose");
        
        d1.getComponentToggleCalendarButton().setBackground(new Color(0, 0, 0, 0));
        
        d1.getComponentToggleCalendarButton().setFont(new java.awt.Font("Ubuntu Mono", 1, 18));
        
        d1.setDateToToday();
        JTextField dd1 = d1.getComponentDateTextField();
        
        dd1.setBackground(new Color(0, 0, 0, 0));
        dd1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        dd1.setFont(new java.awt.Font("Ubuntu Mono", 1, 16));
        dd1.setForeground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jButton3 = new javax.swing.JButton();
        message = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        eMail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        surname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        address = new javax.swing.JTextField();
        mailingAddress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        d1 = new com.github.lgooddatepicker.components.DatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(650, 250));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new Color(0,0,0,0));
        jButton3.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Next");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 81, 39));

        message.setEditable(false);
        message.setBackground(new Color(0,0,0,0));
        message.setBorder(null);
        message.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        message.setForeground(new java.awt.Color(0, 0, 0));
        message.setOpaque(false);
        kGradientPanel1.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 240, 36));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NAME");
        jLabel1.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 81, 53, 36));

        eMail.setBackground(new Color(0,0,0,0));
        eMail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        eMail.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        eMail.setForeground(new java.awt.Color(255, 255, 255));
        eMail.setOpaque(false);
        kGradientPanel1.add(eMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 453, 263, 36));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("E-MAIL ADDRESS");
        jLabel3.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 452, -1, 36));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SURNAME");
        jLabel4.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 136, -1, 36));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BIRTHDATE");
        jLabel5.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 36));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MAILING");
        jLabel6.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 359, -1, 24));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ADDRESS");
        jLabel7.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 389, -1, 24));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ADDRESS");
        jLabel8.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 260, -1, 36));

        surname.setBackground(new Color(0,0,0,0));
        surname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        surname.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        surname.setForeground(new java.awt.Color(255, 255, 255));
        surname.setOpaque(false);
        kGradientPanel1.add(surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 145, 263, 36));

        jButton1.setText("For Me");
        jButton1.setBackground(new Color(0,0,0,0));
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 116, 40));

        address.setBackground(new Color(0,0,0,0));
        address.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        address.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        address.setForeground(java.awt.Color.white);
        address.setOpaque(false);
        kGradientPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 263, 90));

        mailingAddress.setBackground(new Color(0,0,0,0));
        mailingAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        mailingAddress.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        mailingAddress.setForeground(java.awt.Color.white);
        mailingAddress.setOpaque(false);
        kGradientPanel1.add(mailingAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 263, 90));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PASSENGER   INFOMATION");
        jLabel2.setFont(new java.awt.Font("Ubuntu Mono", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 370, 51));

        name1.setBackground(new Color(0,0,0,0));
        name1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        name1.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 255, 255));
        name1.setOpaque(false);
        kGradientPanel1.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 82, 263, 36));

        d1.setBackground(new Color(0,0,0,0));
        d1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        d1.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        d1.setForeground(new Color(0,0,0,0));
        d1.setOpaque(false);
        kGradientPanel1.add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 270, 40));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String birth = null;
        String nm = message.getText();
        String snm = surname.getText();
         LocalDate oDate = d1.getDate();
        String adr = address.getText();
        String adr2 = mailingAddress.getText();
        String mail = eMail.getText();

        if (nm.equals("") || snm.equals("") || oDate == null || adr.equals("") || mail.equals("") || nm.equals("") || adr2.equals("")) {

            message.setText("*All Areas Must Be Filled*");

        } else {

            if (!BuyTicket.Way) {

                birth = oDate.getYear() + "-" + oDate.getMonthValue() + "-" + oDate.getDayOfMonth();

                Connections.R_info(nm, snm, birth, adr, adr2, mail, OneWay.p1.getName(), Seat1);

                seatlist.add(Seat1);

                BuyTicket.people--;

                if (BuyTicket.people > 0) {
                    this.setVisible(false);
                    OneWay.p1.setVisible(true);
                } else {
                    seatlist.forEach((seat) -> {
                        CheckOut += Plane.Prizes(seat);
                    });
                     JOptionPane.showMessageDialog(this, String.format("Checkout: %2.2f $ ",CheckOut));
                    JOptionPane.showMessageDialog(this, "Registration is Completed");

                    OpeninPage p1 = new OpeninPage();
                    this.setVisible(false);
                    p1.setVisible(true);

                    System.exit(0);
                }

            } else {

                Connections.R_info(nm, snm, birth, adr, adr2, mail, RoundTrip.p1.getName(), Seat1);
                Connections.R_info(nm, snm, birth, adr, adr2, mail, RoundTrip.p2.getName(), Seat2);

                seatlist.add(Seat1);
                seatlist.add(Seat2);

                BuyTicket.people--;

                if (BuyTicket.people > 0) {

                    this.setVisible(false);
                    RoundTrip.p1.setVisible(true);

                } else {

                    seatlist.forEach((seat) -> {
                        CheckOut += Plane.Prizes(seat);
                    });

                     JOptionPane.showMessageDialog(this, String.format("Checkout: %2.2f $ ",CheckOut));
                    JOptionPane.showMessageDialog(this, "Registration is Completed");

                    System.exit(0);
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList<Account> arr = new ArrayList();
        arr = Connections.GetAccounts();
        for (Account account : arr) {
            if (account.geteMail().equals(Login.em) && account.getPassword().equals(Login.passw)) {

                if (!BuyTicket.Way) {

                    Connections.R_info(account.getName(), account.getSurname(), account.getBirthdate(), account.getAdress(), account.getMailingAdress(), account.geteMail(), OneWay.p1.getName(), Seat1);
                    seatlist.add(Seat1);

                    BuyTicket.people--;

                    if (BuyTicket.people > 0) {

                        this.setVisible(false);
                        OneWay.p1.setVisible(true);

                    } else {

                        seatlist.forEach((seat) -> {
                            CheckOut += Plane.Prizes(seat);
                        });

                      JOptionPane.showMessageDialog(this, String.format("Checkout: %2.2f $ ",CheckOut));
                        JOptionPane.showMessageDialog(this, "Registration is Completed");

                        OpeninPage p1 = new OpeninPage();
                        this.setVisible(false);
                        p1.setVisible(true);

                    }
                } else {

                    Connections.R_info(account.getName(), account.getSurname(), account.getBirthdate(), account.getAdress(), account.getMailingAdress(), account.geteMail(), RoundTrip.p1.getName(), Seat1);
                    Connections.R_info(account.getName(), account.getSurname(), account.getBirthdate(), account.getAdress(), account.getMailingAdress(), account.geteMail(), RoundTrip.p1.getName(), Seat2);
                    seatlist.add(Seat2);

                    BuyTicket.people--;

                    if (BuyTicket.people > 0) {

                        this.setVisible(false);
                        RoundTrip.p1.setVisible(true);

                    } else {

                        seatlist.forEach((seat) -> {
                            CheckOut += Plane.Prizes(seat);
                        });

                       JOptionPane.showMessageDialog(this, String.format("Checkout: %2.2f $ ",CheckOut));
                        JOptionPane.showMessageDialog(this, "Registration is Completed");

                        OpeninPage p1 = new OpeninPage();
                        this.setVisible(false);
                        p1.setVisible(true);

                    }
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private com.github.lgooddatepicker.components.DatePicker d1;
    private javax.swing.JTextField eMail;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField mailingAddress;
    private javax.swing.JTextField message;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField surname;
    // End of variables declaration//GEN-END:variables

}
