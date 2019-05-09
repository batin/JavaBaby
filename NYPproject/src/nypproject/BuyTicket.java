package nypproject;

import com.github.lgooddatepicker.components.DatePickerSettings;
import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BuyTicket extends javax.swing.JFrame {

    static ArrayList<Plane> Planes = new ArrayList<>();
    static ArrayList<Plane> Planes2 = new ArrayList<>();
    Connections con = new Connections();
    public boolean oneWay = false;
    public static String From;
    public static String To;
    public static String Date1;
    public static String Date2;
    public static int people;
    public static boolean Way;

    public BuyTicket() {
        initComponents();
        sayi.setText("1");
        showCities();
        jButton3.setOpaque(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setBorderPainted(false);
        jButton4.setOpaque(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setBorderPainted(false);
        d1.setDate(LocalDate.now()); // bu günün tarihi
        d2.setDate(LocalDate.now());

        DatePickerSettings settings1 = d1.getSettings();
        DatePickerSettings settings2 = d2.getSettings();
        settings1.setGapBeforeButtonPixels(-2);
        settings2.setGapBeforeButtonPixels(-2);
        settings1.setFontVetoedDate(new java.awt.Font("Ubuntu Mono", 1, 24));
        settings2.setFontVetoedDate(new java.awt.Font("Ubuntu Mono", 1, 24));
        settings1.setFontValidDate(new java.awt.Font("Ubuntu Mono", 1, 24));
        settings2.setFontValidDate(new java.awt.Font("Ubuntu Mono", 1, 24));
        settings1.setColor(DatePickerSettings.DateArea.TextFieldBackgroundValidDate,new Color(0, 0, 0, 0));
        settings2.setColor(DatePickerSettings.DateArea.TextFieldBackgroundValidDate, new Color(0, 0, 0, 0));
        d1.getComponentToggleCalendarButton().setText("From");
        d2.getComponentToggleCalendarButton().setText("To");
        d1.getComponentToggleCalendarButton().setBackground(new Color(0, 0, 0, 0));
        d2.getComponentToggleCalendarButton().setBackground(new Color(0, 0, 0, 0));
        d1.getComponentToggleCalendarButton().setFont(new java.awt.Font("Ubuntu Mono", 1, 18));
        d2.getComponentToggleCalendarButton().setFont(new java.awt.Font("Ubuntu Mono", 1, 18));
        d1.setDateToToday();
        JTextField dd1 = d1.getComponentDateTextField();
        JTextField dd2 = d2.getComponentDateTextField();
        dd1.setBackground(new Color(0, 0, 0, 0));
        dd1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        dd1.setFont(new java.awt.Font("Ubuntu Mono", 1, 24));
        dd1.setForeground(Color.BLACK);
        dd2.setBackground(new Color(0, 0, 0, 0));
        dd2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        dd2.setFont(new java.awt.Font("Ubuntu Mono", 1, 24));
        dd2.setForeground(Color.BLACK);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        c2 = new javax.swing.JComboBox<>();
        c1 = new javax.swing.JComboBox<>();
        d1 = new com.github.lgooddatepicker.components.DatePicker();
        d2 = new com.github.lgooddatepicker.components.DatePicker();
        btn1 = new javax.swing.JRadioButton();
        btn2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        sayi = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        message = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 400));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        c2.setBackground(new Color(0,0,0,0));
        c2.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        c2.setForeground(new java.awt.Color(255, 255, 255));
        c2.setMaximumRowCount(100);
        c2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        c2.setOpaque(false);
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 51, 284, 51));

        c1.setBackground(new Color(0,0,0,0));
        c1.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        c1.setForeground(new java.awt.Color(255, 255, 255));
        c1.setMaximumRowCount(100);
        c1.setToolTipText("");
        c1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        c1.setOpaque(false);
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 51, 284, 51));

        d1.setBackground(new Color(0,0,0,0));
        d1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        d1.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        d1.setForeground(new Color(0,0,0,0));
        d1.setNextFocusableComponent(d1);
        d1.setOpaque(false);
        getContentPane().add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 290, 50));
        d1.getAccessibleContext().setAccessibleParent(jLabel3);

        d2.setBackground(new Color(0,0,0,0));
        d2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        d2.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        d2.setForeground(new Color(0,0,0,0));
        d2.setOpaque(false);
        getContentPane().add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 280, 50));
        d2.getAccessibleContext().setAccessibleParent(jLabel3);

        btn1.setBackground(new Color(0,0,0,0));
        buttonGroup1.add(btn1);
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 138, -1, 24));

        btn2.setBackground(new Color(0,0,0,0));
        buttonGroup1.add(btn2);
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 168, -1, -1));

        jButton1.setBackground(new Color(0,0,0,0));
        jButton1.setFont(new java.awt.Font("Ubuntu Mono", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("+");
        jButton1.setBorder(null);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, 30));

        sayi.setBackground(new Color(0,0,0,0));
        sayi.setFont(new java.awt.Font("Ubuntu Mono", 1, 48)); // NOI18N
        sayi.setForeground(new java.awt.Color(0, 0, 0));
        sayi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sayi.setBorder(null);
        sayi.setOpaque(false);
        getContentPane().add(sayi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 57, 78));

        jButton2.setBackground(new Color(0,0,0,0));
        jButton2.setFont(new java.awt.Font("Ubuntu Mono", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("-");
        jButton2.setBorder(null);
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, 33));

        jButton3.setBackground(new Color(0,0,0,0));
        jButton3.setFont(new java.awt.Font("Ubuntu Mono", 1, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("FIND FLIGHT TICKET");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 330, 69));

        jButton4.setBackground(new Color(0,0,0,0));
        jButton4.setFont(new java.awt.Font("Ubuntu Mono", 1, 30)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Back");
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, 40));

        message.setEditable(false);
        message.setBackground(new Color(0,0,0,0));
        message.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        message.setForeground(new java.awt.Color(255, 0, 0));
        message.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        message.setBorder(null);
        message.setOpaque(false);
        getContentPane().add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 410, 30));

        jLabel1.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel1.setText("FROM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 30, 40, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel2.setText("TO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 30, 30, -1));

        lb3.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        lb3.setText("Date of Return");
        getContentPane().add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 114, 130, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel4.setText("Date of Departure");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 114, 160, -1));

        jLabel5.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel5.setText("One Way");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 138, 80, 24));

        jLabel6.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel6.setText("Round Trip");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 168, 100, 21));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nypproject/images/buy.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed

        d2.setVisible(true);
        lb3.setVisible(true);
        oneWay = true;

    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed

        d2.setVisible(false);
        lb3.setVisible(false);
        oneWay = false;

    }//GEN-LAST:event_btn1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int num = (Integer.parseInt(sayi.getText()));
        num++;
        sayi.setText("" + num);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int num = (Integer.parseInt(sayi.getText()));
        if (num > 1) {
            num--;
        }
        sayi.setText("" + num);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        LocalDate oDate = d1.getDate();
        String date1 = oDate.getYear() + "-" + oDate.getMonthValue() + "-" + oDate.getDayOfMonth();

        From = c1.getSelectedItem().toString();
        To = c2.getSelectedItem().toString();
        Date1 = date1;
        people = Integer.parseInt(sayi.getText());
        Way = oneWay;//gidiş dönüş ise true

        if (To.equals(From)) {

            message.setText("*Departure & Arrival City Must Be Different*");

        } else if (btn1.isSelected() == false && btn2.isSelected() == false) {

            message.setText("*You Must Select One Way Or Round Trip*");

        } else {

            if (!oneWay) {
                Planes = con.GetSelectedPlanes(From, To, Date1);
                System.out.println(Date1);
                if (!Planes.isEmpty()) {
                    OneWay q = new OneWay();
                    q.setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(this, "There Is No Flight On Choosen Dates");
                }
            } else {

                LocalDate oDate2 = d2.getDate();
                String date2 = oDate2.getYear() + "-" + oDate2.getMonthValue() + "-" + oDate2.getDayOfMonth();
                Date2 = date2;

                if (Date2.compareTo(Date1) <= 0) {
                    if (!Planes.isEmpty()) {
                        RoundTrip rt = new RoundTrip();
                        rt.setVisible(true);
                        this.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(this, "There Is No Flight On Choosen Dates");
                    }
                } else {

                    message.setText("*Date Of Arrival Can Not Be Earlier Than Date Of Departure*");

                }
            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        UserInterface Ui = new UserInterface(Login.em, Login.passw);
        this.setVisible(false);
        Ui.setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

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
    private javax.swing.JRadioButton btn1;
    private javax.swing.JRadioButton btn2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JComboBox<String> c2;
    private com.github.lgooddatepicker.components.DatePicker d1;
    private com.github.lgooddatepicker.components.DatePicker d2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lb3;
    private javax.swing.JTextField message;
    private javax.swing.JTextField sayi;
    // End of variables declaration//GEN-END:variables

}
