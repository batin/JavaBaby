package nypproject;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class Plane extends javax.swing.JFrame {

    Connections con = new Connections();
    private String Name;
    private String Departure;
    private String Arrival;
    private String LandingTime;
    private String LiftOffTime;
    private String Date;
    private static String Seat1;
    private static String Seat2;
    private static double LastPrice;
    private static int PersonCount;
    private static boolean flag2 = false;

    public Plane(String Name, String Departure, String Arrival, String LandingTime, String LiftOffTime, String Date) {
        this.Name = Name;
        this.Departure = Departure;
        this.Arrival = Arrival;
        this.LandingTime = LandingTime;
        this.LiftOffTime = LiftOffTime;
        this.Date = Date;

        initComponents();

    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDeparture() {
        return Departure;
    }

    public void setDeparture(String Departure) {
        this.Departure = Departure;
    }

    public String getArrival() {
        return Arrival;
    }

    public void setArrival(String Arrival) {
        this.Arrival = Arrival;
    }

    public ButtonGroup getGrup() {
        return Grup;
    }

    public void setGrup(ButtonGroup Grup) {
        this.Grup = Grup;
    }

    public String getLandingTime() {
        return LandingTime;
    }

    public void setLandingTime(String LandingTime) {
        this.LandingTime = LandingTime;
    }

    public String getLiftOffTime() {
        return LiftOffTime;
    }

    public void setLiftOffTime(String LiftOffTime) {
        this.LiftOffTime = LiftOffTime;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grup = new javax.swing.ButtonGroup();
        A4 = new javax.swing.JRadioButton();
        B4 = new javax.swing.JRadioButton();
        C4 = new javax.swing.JRadioButton();
        D4 = new javax.swing.JRadioButton();
        A3 = new javax.swing.JRadioButton();
        B3 = new javax.swing.JRadioButton();
        C3 = new javax.swing.JRadioButton();
        D3 = new javax.swing.JRadioButton();
        C5 = new javax.swing.JRadioButton();
        D5 = new javax.swing.JRadioButton();
        A6 = new javax.swing.JRadioButton();
        B6 = new javax.swing.JRadioButton();
        C6 = new javax.swing.JRadioButton();
        D6 = new javax.swing.JRadioButton();
        A5 = new javax.swing.JRadioButton();
        B5 = new javax.swing.JRadioButton();
        C7 = new javax.swing.JRadioButton();
        D7 = new javax.swing.JRadioButton();
        C9 = new javax.swing.JRadioButton();
        D9 = new javax.swing.JRadioButton();
        A10 = new javax.swing.JRadioButton();
        B10 = new javax.swing.JRadioButton();
        C10 = new javax.swing.JRadioButton();
        D10 = new javax.swing.JRadioButton();
        A9 = new javax.swing.JRadioButton();
        B9 = new javax.swing.JRadioButton();
        A8 = new javax.swing.JRadioButton();
        B8 = new javax.swing.JRadioButton();
        C8 = new javax.swing.JRadioButton();
        D8 = new javax.swing.JRadioButton();
        A7 = new javax.swing.JRadioButton();
        B7 = new javax.swing.JRadioButton();
        C2 = new javax.swing.JRadioButton();
        D2 = new javax.swing.JRadioButton();
        A2 = new javax.swing.JRadioButton();
        B2 = new javax.swing.JRadioButton();
        A11 = new javax.swing.JRadioButton();
        B11 = new javax.swing.JRadioButton();
        C1 = new javax.swing.JRadioButton();
        D1 = new javax.swing.JRadioButton();
        A1 = new javax.swing.JRadioButton();
        B1 = new javax.swing.JRadioButton();
        C11 = new javax.swing.JRadioButton();
        D11 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        economy = new java.awt.TextField();
        comfort = new java.awt.TextField();
        bussiness = new java.awt.TextField();
        message = new javax.swing.JTextField();
        PlaneName = new javax.swing.JTextField();
        From = new javax.swing.JTextField();
        To = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 400));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Grup.add(A4);
        A4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(A4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, -1, -1));

        Grup.add(B4);
        B4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, -1, -1));

        Grup.add(C4);
        C4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, -1, -1));

        Grup.add(D4);
        D4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, -1, -1));

        Grup.add(A3);
        A3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });
        getContentPane().add(A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, -1, -1));

        Grup.add(B3);
        B3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, -1, -1));

        Grup.add(C3);
        C3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, -1, -1));

        Grup.add(D3);
        D3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, -1, -1));

        Grup.add(C5);
        C5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });
        getContentPane().add(C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, -1, -1));

        Grup.add(D5);
        D5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(D5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, -1, -1));

        Grup.add(A6);
        A6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(A6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, -1));

        Grup.add(B6);
        B6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, -1, -1));

        Grup.add(C6);
        C6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });
        getContentPane().add(C6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, -1, -1));

        Grup.add(D6);
        D6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(D6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, -1, -1));

        Grup.add(A5);
        A5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });
        getContentPane().add(A5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, -1, -1));

        Grup.add(B5);
        B5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, -1, -1));

        Grup.add(C7);
        C7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });
        getContentPane().add(C7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        Grup.add(D7);
        D7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(D7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, -1, -1));

        Grup.add(C9);
        C9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });
        getContentPane().add(C9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));

        Grup.add(D9);
        D9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(D9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        Grup.add(A10);
        A10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(A10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        Grup.add(B10);
        B10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(B10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        Grup.add(C10);
        C10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(C10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));

        Grup.add(D10);
        D10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(D10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        Grup.add(A9);
        A9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(A9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        Grup.add(B9);
        B9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(B9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        Grup.add(A8);
        A8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });
        getContentPane().add(A8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        Grup.add(B8);
        B8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(B8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        Grup.add(C8);
        C8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });
        getContentPane().add(C8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, -1));

        Grup.add(D8);
        D8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(D8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        Grup.add(A7);
        A7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });
        getContentPane().add(A7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

        Grup.add(B7);
        B7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(B7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, -1));

        Grup.add(C2);
        C2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, -1, -1));

        Grup.add(D2);
        D2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, -1, -1));

        Grup.add(A2);
        A2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });
        getContentPane().add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, -1, -1));

        Grup.add(B2);
        B2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, -1, -1));

        Grup.add(A11);
        A11.setFont(new java.awt.Font("Dialog", 0, 3)); // NOI18N
        A11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(A11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 20, 20));

        Grup.add(B11);
        B11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(B11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        Grup.add(C1);
        C1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });
        getContentPane().add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 170, -1, -1));

        Grup.add(D1);
        D1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 200, -1, -1));

        Grup.add(A1);
        A1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });
        getContentPane().add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 70, -1, -1));

        Grup.add(B1);
        B1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, -1, -1));

        Grup.add(C11);
        C11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(C11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        Grup.add(D11);
        D11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(D11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        jButton1.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 220, 90, 30));

        economy.setBackground(new java.awt.Color(255, 255, 255));
        economy.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        economy.setEditable(false);
        economy.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        economy.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(economy, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 50, -1));

        comfort.setBackground(new java.awt.Color(255, 255, 255));
        comfort.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        comfort.setEditable(false);
        comfort.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        comfort.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(comfort, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 50, -1));

        bussiness.setBackground(new java.awt.Color(255, 255, 255));
        bussiness.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        bussiness.setEditable(false);
        bussiness.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        bussiness.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(bussiness, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 50, -1));

        message.setEditable(false);
        message.setBackground(new Color(0,0,0,0));
        message.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        message.setForeground(new java.awt.Color(0, 0, 0));
        message.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        message.setBorder(null);
        message.setOpaque(false);
        getContentPane().add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, 220, 30));

        PlaneName.setEditable(false);
        PlaneName.setBackground(new Color(0,0,0,0));
        PlaneName.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        PlaneName.setForeground(new java.awt.Color(0, 0, 0));
        PlaneName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PlaneName.setBorder(null);
        PlaneName.setOpaque(false);
        getContentPane().add(PlaneName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 160, 30));

        From.setEditable(false);
        From.setBackground(new Color(0,0,0,0));
        From.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        From.setForeground(new java.awt.Color(0, 0, 0));
        From.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        From.setBorder(null);
        From.setOpaque(false);
        getContentPane().add(From, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 160, 30));

        To.setEditable(false);
        To.setBackground(new Color(0,0,0,0));
        To.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        To.setForeground(new java.awt.Color(0, 0, 0));
        To.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        To.setBorder(null);
        To.setOpaque(false);
        getContentPane().add(To, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 160, 30));

        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        label1.setText("Economy");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 60, -1));

        label2.setBackground(new java.awt.Color(255, 255, 255));
        label2.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 0, 0));
        label2.setText("Bussiness");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, -1, -1));

        label3.setBackground(new java.awt.Color(255, 255, 255));
        label3.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 0, 0));
        label3.setText("Comfort");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 60, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nypproject/images/0.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean flag1 = false;
        for (Enumeration<AbstractButton> buttons = Grup.getElements(); buttons.hasMoreElements();) {

            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                flag1 = true;
            }
        }
        if (flag1) {
            if (!BuyTicket.Way) {

                Seat1 = getSelectedButtonText(Grup);
                PassengerInfo pi = new PassengerInfo(Seat1, null);

                this.setVisible(false);
                pi.setVisible(true);
                UpdatePlane();

            } else {

                if (flag2) {
                    flag2 = false;
                    Seat2 = getSelectedButtonText(Grup);
                    PassengerInfo pi = new PassengerInfo(Seat1, Seat2);
                    BuyTicket.people--;

                    this.setVisible(false);
                    pi.setVisible(true);
                } else {

                    flag2 = true;
                    Seat1 = getSelectedButtonText(Grup);

                    RoundTrip.p2.UpdatePlane();

                    this.setVisible(false);
                    RoundTrip.p2.setVisible(true);
                }
            }
        } else {
            message.setText("*You Must Select Seat*");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        LastPrice = Double.parseDouble(Connections.CalculatePrice(Departure, Arrival));
        bussiness.setText(String.format("%.2f", LastPrice * 2.5));
        economy.setText(String.format("%.2f", LastPrice));
        comfort.setText(String.format("%.2f", LastPrice * 1.2));
        PersonCount = BuyTicket.people;

        A1.setActionCommand("A1");
        A2.setActionCommand("A2");
        A3.setActionCommand("A3");
        A4.setActionCommand("A4");
        A5.setActionCommand("A5");
        A6.setActionCommand("A6");
        A7.setActionCommand("A7");
        A8.setActionCommand("A8");
        A9.setActionCommand("A9");
        A10.setActionCommand("A10");
        A11.setActionCommand("A11");
        B1.setActionCommand("B1");
        B2.setActionCommand("B2");
        B3.setActionCommand("B3");
        B4.setActionCommand("B4");
        B5.setActionCommand("B5");
        B6.setActionCommand("B6");
        B7.setActionCommand("B7");
        B8.setActionCommand("B8");
        B9.setActionCommand("B9");
        B10.setActionCommand("B10");
        B11.setActionCommand("B11");
        C1.setActionCommand("C1");
        C2.setActionCommand("C2");
        C3.setActionCommand("C3");
        C4.setActionCommand("C4");
        C5.setActionCommand("C5");
        C6.setActionCommand("C6");
        C7.setActionCommand("C7");
        C8.setActionCommand("C8");
        C9.setActionCommand("C9");
        C10.setActionCommand("C10");
        C11.setActionCommand("C11");
        D1.setActionCommand("D1");
        D2.setActionCommand("D2");
        D3.setActionCommand("D3");
        D4.setActionCommand("D4");
        D5.setActionCommand("D5");
        D6.setActionCommand("D6");
        D7.setActionCommand("D7");
        D8.setActionCommand("D8");
        D9.setActionCommand("D9");
        D10.setActionCommand("D10");
        D11.setActionCommand("D11");

        jButton1.setOpaque(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
        
        PlaneName.setText("Plane Name " + Name.toUpperCase());
        From.setText("Departure " + Departure);
        To.setText("Arrival " + Arrival);
        
        UpdatePlane();
    }//GEN-LAST:event_formWindowOpened

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A4ActionPerformed

    public String getSelectedButtonText(ButtonGroup buttonGroup) {

        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {

            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getActionCommand();
            }
        }

        return null;
    }

    void UpdatePlane() {

        ArrayList<Passenger> PassengerList = new ArrayList<>();
        PassengerList = Connections.GetPassengers();

        if (PassengerList != null) {

            for (Passenger P : PassengerList) {

                for (Enumeration<AbstractButton> buttons = Grup.getElements(); buttons.hasMoreElements();) {

                    AbstractButton button = buttons.nextElement();

                    if (P.getSeat().equals(button.getActionCommand()) && P.getPlaneName().equals(Name)) {

                        button.setVisible(false);

                    }
                }

            }

        }
    }

    public static Double Prizes(String seat) {

        String[] part = seat.split("(?<=\\D)(?=\\d)");

        if (Integer.parseInt(part[1]) < 3) {

            return LastPrice * 2.5;

        } else if (Integer.parseInt(part[1]) < 3 && Integer.parseInt(part[1]) < 10) {

            return LastPrice;

        } else {

            return LastPrice * 1.2;

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A1;
    private javax.swing.JRadioButton A10;
    private javax.swing.JRadioButton A11;
    private javax.swing.JRadioButton A2;
    private javax.swing.JRadioButton A3;
    private javax.swing.JRadioButton A4;
    private javax.swing.JRadioButton A5;
    private javax.swing.JRadioButton A6;
    private javax.swing.JRadioButton A7;
    private javax.swing.JRadioButton A8;
    private javax.swing.JRadioButton A9;
    private javax.swing.JRadioButton B1;
    private javax.swing.JRadioButton B10;
    private javax.swing.JRadioButton B11;
    private javax.swing.JRadioButton B2;
    private javax.swing.JRadioButton B3;
    private javax.swing.JRadioButton B4;
    private javax.swing.JRadioButton B5;
    private javax.swing.JRadioButton B6;
    private javax.swing.JRadioButton B7;
    private javax.swing.JRadioButton B8;
    private javax.swing.JRadioButton B9;
    private javax.swing.JRadioButton C1;
    private javax.swing.JRadioButton C10;
    private javax.swing.JRadioButton C11;
    private javax.swing.JRadioButton C2;
    private javax.swing.JRadioButton C3;
    private javax.swing.JRadioButton C4;
    private javax.swing.JRadioButton C5;
    private javax.swing.JRadioButton C6;
    private javax.swing.JRadioButton C7;
    private javax.swing.JRadioButton C8;
    private javax.swing.JRadioButton C9;
    private javax.swing.JRadioButton D1;
    private javax.swing.JRadioButton D10;
    private javax.swing.JRadioButton D11;
    private javax.swing.JRadioButton D2;
    private javax.swing.JRadioButton D3;
    private javax.swing.JRadioButton D4;
    private javax.swing.JRadioButton D5;
    private javax.swing.JRadioButton D6;
    private javax.swing.JRadioButton D7;
    private javax.swing.JRadioButton D8;
    private javax.swing.JRadioButton D9;
    private javax.swing.JTextField From;
    private javax.swing.ButtonGroup Grup;
    private javax.swing.JTextField PlaneName;
    private javax.swing.JTextField To;
    private java.awt.TextField bussiness;
    private java.awt.TextField comfort;
    private java.awt.TextField economy;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private javax.swing.JTextField message;
    // End of variables declaration//GEN-END:variables
}
