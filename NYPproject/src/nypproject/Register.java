package nypproject;

import com.github.lgooddatepicker.components.DatePickerSettings;
import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JTextField;

public class Register extends javax.swing.JFrame {

    public Register() {
        Connections con = new Connections();
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
        mailingAddress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        surname = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        eMail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        address1 = new javax.swing.JTextField();
        message = new javax.swing.JTextField();
        d1 = new com.github.lgooddatepicker.components.DatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(650, 250));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mailingAddress.setBackground(new Color(0,0,0,0));
        mailingAddress.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        mailingAddress.setForeground(java.awt.Color.white);
        mailingAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        mailingAddress.setOpaque(false);
        kGradientPanel1.add(mailingAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 263, 90));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("R E G I S T E R   H E R E");
        jLabel2.setFont(new java.awt.Font("Ubuntu Mono", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 450, 39));

        jButton3.setText("REGISTER");
        jButton3.setBackground(new Color(0,0,0,0));
        jButton3.setBorder(null);
        jButton3.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 590, -1, 39));

        jButton4.setText("BACK");
        jButton4.setBackground(new Color(0,0,0,0));
        jButton4.setBorder(null);
        jButton4.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 92, 39));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("E-MAIL");
        jLabel3.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, 36));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("PASSWORD");
        jLabel9.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, 36));

        surname.setBackground(new Color(0,0,0,0));
        surname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        surname.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        surname.setForeground(java.awt.Color.white);
        surname.setOpaque(false);
        kGradientPanel1.add(surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 263, 36));

        name.setBackground(new Color(0,0,0,0));
        name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        name.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        name.setForeground(java.awt.Color.white);
        name.setOpaque(false);
        kGradientPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 263, 36));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NAME");
        jLabel1.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 53, 36));

        eMail.setBackground(new Color(0,0,0,0));
        eMail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        eMail.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        eMail.setForeground(java.awt.Color.white);
        eMail.setOpaque(false);
        kGradientPanel1.add(eMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 263, 36));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SURNAME");
        jLabel4.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, 36));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BIRTH DAY");
        jLabel5.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 36));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MAILING");
        jLabel6.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, 24));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ADDRESS");
        jLabel7.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, 24));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ADDRESS");
        jLabel8.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, 36));

        pass.setBackground(new Color(0,0,0,0));
        pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        pass.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        pass.setForeground(java.awt.Color.white);
        pass.setOpaque(false);
        kGradientPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 263, 36));

        address1.setBackground(new Color(0,0,0,0));
        address1.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        address1.setForeground(java.awt.Color.white);
        address1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        address1.setOpaque(false);
        kGradientPanel1.add(address1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 263, 90));

        message.setEditable(false);
        message.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        message.setBackground(new Color(0,0,0,0));
        message.setBorder(null);
        message.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        message.setForeground(new java.awt.Color(0, 0, 0));
        message.setOpaque(false);
        kGradientPanel1.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, 240, 36));

        d1.setBackground(new Color(0,0,0,0));
        d1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        d1.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        d1.setForeground(new Color(0,0,0,0));
        d1.setOpaque(false);
        kGradientPanel1.add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 270, 40));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String nm = name.getText();
        String snm = surname.getText();
        LocalDate oDate = d1.getDate();
        String adr = mailingAddress.getText();
        String adr2 = mailingAddress.getText();
        String mail = eMail.getText();
        String passw = new String(pass.getPassword());

        boolean flag = true;

        if (nm.equals("") || snm.equals("") || oDate == null || adr.equals("") || mail.equals("") || nm.equals("") || adr2.equals("")) {

            message.setText("*All Areas Must Be Filled*");

        } else {

            String birth = oDate.getYear() + "-" + oDate.getMonthValue() + "-" + oDate.getDayOfMonth();
            ArrayList<Account> ac = new ArrayList();
            ac = Connections.GetAccounts();

            for (Account account : ac) {

                if (account.geteMail().equals(mail)) {

                    flag = false;

                }
            }

            if (flag) {

                Connections.Register(nm, snm, birth, adr, adr2, mail, passw);
                OpeninPage opn = new OpeninPage();
                opn.setVisible(true);
                this.setVisible(false);

            } else {

                message.setText("*E-Mail has been used*");

            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        OpeninPage opn = new OpeninPage();
        opn.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address1;
    private com.github.lgooddatepicker.components.DatePicker d1;
    private javax.swing.JTextField eMail;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField mailingAddress;
    private javax.swing.JTextField message;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField surname;
    // End of variables declaration//GEN-END:variables
}
