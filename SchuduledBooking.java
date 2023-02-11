package TaxiBookingSystem.GUIs;

import TaxiBookingSystem.Classes.Booking;
import static TaxiBookingSystem.GUIs.BookingScreen.bookingsByUser;
import java.awt.Color;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class SchuduledBooking extends javax.swing.JFrame {

    public SchuduledBooking() {
        initComponents();
    }
    boolean book = true;
    String date;
    String time;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        feeTF = new javax.swing.JTextField();
        fStreetTF = new javax.swing.JTextField();
        bookLBL = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fvRB = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        svRB = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        fAreaTF = new javax.swing.JTextField();
        tStreetTF = new javax.swing.JTextField();
        tAreaTF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        driverNameTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        plateNumberTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        timeTF = new javax.swing.JTextField();
        dateTF = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1031, 655));
        setSize(new java.awt.Dimension(1031, 655));
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("        Book Now ");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Schudule A booking ");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("           History");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TaxiBookingSystem/Icons/icons8_taxi_100px_2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(75, 75, 75)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TaxiBookingSystem/Icons/icons8_user_45px_1.png"))); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TaxiBookingSystem/Icons/icons8_login_45px_1.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        feeTF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        feeTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        feeTF.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        feeTF.setEnabled(false);

        fStreetTF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        fStreetTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fStreetTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fStreetTFActionPerformed(evt);
            }
        });

        bookLBL.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bookLBL.setText("    Book   ");
        bookLBL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bookLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookLBLMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Destination");

        fvRB.setBackground(new java.awt.Color(255, 255, 255));
        BG1.add(fvRB);
        fvRB.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        fvRB.setText("Family (6 Passengers Max)");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("Area");

        svRB.setBackground(new java.awt.Color(255, 255, 255));
        BG1.add(svRB);
        svRB.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        svRB.setText("Standard (4 Passengers Max)");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("Street");

        fAreaTF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        fAreaTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tStreetTF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tStreetTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tStreetTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tStreetTFActionPerformed(evt);
            }
        });

        tAreaTF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tAreaTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setText("Driver Name");

        driverNameTF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        driverNameTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        driverNameTF.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        driverNameTF.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Vehicle");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setText("Plate Number");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Current Location");

        plateNumberTF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        plateNumberTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        plateNumberTF.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        plateNumberTF.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Area");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setText("Fee");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setText("Street");

        timeTF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        timeTF.setText("hour:minute");
        timeTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        timeTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeTFMouseClicked(evt);
            }
        });
        timeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeTFActionPerformed(evt);
            }
        });

        dateTF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        dateTF.setText("day/month/year");
        dateTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dateTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateTFMouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setText("Date");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel18.setText("Time");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel19.setText("Date And Time");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel17)
                                            .addGap(321, 321, 321)
                                            .addComponent(jLabel18))
                                        .addComponent(jLabel16))
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(timeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tStreetTF, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fStreetTF, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(feeTF)
                            .addComponent(driverNameTF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(plateNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(51, 51, 51)
                                .addComponent(svRB)
                                .addGap(42, 42, 42)
                                .addComponent(fvRB))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tAreaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(fAreaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(dateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(bookLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fvRB)
                    .addComponent(svRB))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fAreaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(fStreetTF, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tAreaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(tStreetTF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(timeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bookLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(driverNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(plateNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(feeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(89, 89, 89))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        jLabel5.setText(CustomerLogin.name);
    }//GEN-LAST:event_formWindowActivated

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        BookingScreen n = new BookingScreen();
        dispose();
        n.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        History n = new History();
        dispose();
        n.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        BookingScreen.bookingsByUser.clear();
        CustomerLogin l = new CustomerLogin();
        dispose();
        l.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void fStreetTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fStreetTFActionPerformed

    }//GEN-LAST:event_fStreetTFActionPerformed

    private void bookLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookLBLMouseClicked
        book = true;
        fAreaTF.setBackground(Color.white);
        tAreaTF.setBackground(Color.white);
        fStreetTF.setBackground(Color.white);
        tStreetTF.setBackground(Color.white);
        dateTF.setBackground(Color.white);
        timeTF.setBackground(Color.white);
        if (!svRB.isSelected() && !fvRB.isSelected()) {
            JOptionPane.showMessageDialog(this, "Please Choose The Vehicle Type");
            book = false;
        } else if (fAreaTF.getText().equals("")) {
            book = false;
            JOptionPane.showMessageDialog(this, "Please Enter The Pickup Area");
            fAreaTF.setBackground(Color.pink);
        } else if (fStreetTF.getText().equals("")) {
            book = false;
            JOptionPane.showMessageDialog(this, "Please Enter The Pickup Street");
            fStreetTF.setBackground(Color.pink);
        } else if (tAreaTF.getText().equals("")) {
            book = false;
            JOptionPane.showMessageDialog(this, "Please Enter The Designated Area");
            tAreaTF.setBackground(Color.pink);
        } else if (tStreetTF.getText().equals("")) {
            book = false;
            JOptionPane.showMessageDialog(this, "Please Enter The Designated Street");
            tStreetTF.setBackground(Color.pink);
        } else if (dateTF.getText().equals("day/month/year") || dateTF.getText().equals("")) {
            book = false;
            JOptionPane.showMessageDialog(this, "Please Enter The Date");
            dateTF.setBackground(Color.pink);
        } else if (timeTF.getText().equals("hour:minute") || timeTF.getText().equals("")) {
            book = false;
            JOptionPane.showMessageDialog(this, "Please Enter The Time");
            timeTF.setBackground(Color.pink);
        } else {
            date = dateTF.getText();
            time = timeTF.getText();
            
            // Exception Handling for the Date
            
            try {
                String[] d = date.split("/");
                int day = Integer.parseInt(d[0]), month = Integer.parseInt(d[1]), year = Integer.parseInt(d[2]);
                if ((day < 1 || day > 31) || (month < 1 || month > 12) || (year < 1)) {
                    book = false;
                    JOptionPane.showMessageDialog(this, "Please Enter A Valid Day, Month And Year Values In This Format d/m/y");
                    dateTF.setBackground(Color.pink);
                }
            } catch (NumberFormatException e) {
                book = false;
                JOptionPane.showMessageDialog(this, "Please Enter A Valid Day, Month And Year Values In This Format d/m/y" + e);
                dateTF.setBackground(Color.pink);
            } catch (Exception e){
                book = false;
                JOptionPane.showMessageDialog(this, "Please Enter A Valid Day, Month And Year Values In This Format d/m/y" + e);
                dateTF.setBackground(Color.pink);
            }
            
            // Exception Handling for the Time
            
            try {
                String[] t = time.split(":");
                int hour = Integer.parseInt(t[0]), min = Integer.parseInt(t[1]);
                if ((hour < 0 || hour > 23) || (min < 0 || min > 59)) {
                    book = false;
                    JOptionPane.showMessageDialog(this, "Please Enter A Valid Hour And Minute Values In This Format h:m");
                    timeTF.setBackground(Color.pink);
                }
            } catch (NumberFormatException e) {
                book = false;
                    JOptionPane.showMessageDialog(this, "Please Enter A Valid Hour And Minute Values In This Format h:m");
                    timeTF.setBackground(Color.pink);
            } catch (Exception e){
                book = false;
                    JOptionPane.showMessageDialog(this, "Please Enter A Valid Hour And Minute Values In This Format h:m");
                    timeTF.setBackground(Color.pink);
            }
            
            String vType = "";
            if (svRB.isSelected()) {
                vType = "Standard";
            } else {
                vType = "Family";
            }
            String fromArea = fAreaTF.getText();
            String fromStr = fStreetTF.getText();
            String toArea = tAreaTF.getText();
            String toStr = tStreetTF.getText();
            if (book) {
                Booking b = new Booking(date, time, fromArea, fromStr, toArea, toStr, vType);
                b.setCustomer(CustomerLogin.name, CustomerLogin.phoneNumber);
                JOptionPane.showMessageDialog(this, "Booking Complete!");
                driverNameTF.setText(" " + b.getDriverName());
                plateNumberTF.setText(" " + b.getDriverPlateNumber());
                feeTF.setText(" " + b.getFee());
                fAreaTF.setText("");
                fStreetTF.setText("");
                tAreaTF.setText("");
                tStreetTF.setText("");
                timeTF.setText("hour:minute");
                dateTF.setText("day/month/year");
                BG1.clearSelection();
                bookingsByUser.add(b);
            }
        }

    }//GEN-LAST:event_bookLBLMouseClicked

    private void tStreetTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tStreetTFActionPerformed

    }//GEN-LAST:event_tStreetTFActionPerformed

    private void timeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeTFActionPerformed

    private void dateTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateTFMouseClicked
        dateTF.setText("");
    }//GEN-LAST:event_dateTFMouseClicked

    private void timeTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeTFMouseClicked
        timeTF.setText("");
    }//GEN-LAST:event_timeTFMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SchuduledBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BG1;
    private javax.swing.JLabel bookLBL;
    private javax.swing.JTextField dateTF;
    private javax.swing.JTextField driverNameTF;
    private javax.swing.JTextField fAreaTF;
    private javax.swing.JTextField fStreetTF;
    private javax.swing.JTextField feeTF;
    private javax.swing.JRadioButton fvRB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField plateNumberTF;
    private javax.swing.JRadioButton svRB;
    private javax.swing.JTextField tAreaTF;
    private javax.swing.JTextField tStreetTF;
    private javax.swing.JTextField timeTF;
    // End of variables declaration//GEN-END:variables
}
