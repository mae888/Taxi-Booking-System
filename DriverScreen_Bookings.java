package TaxiBookingSystem.GUIs;

import TaxiBookingSystem.Classes.Booking;
import TaxiBookingSystem.Classes.Driver;
import javax.swing.JOptionPane;

public class DriverScreen_Bookings extends javax.swing.JFrame {
    
    Driver d = new Driver();
    Booking b = d.generateBooking();
    
    public DriverScreen_Bookings() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        refLBL = new javax.swing.JLabel();
        acceptLBL = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        numOfDTF = new javax.swing.JTextField();
        estIncomeTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        ta.setColumns(20);
        ta.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        ta.setRows(5);
        ta.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ta.setEnabled(false);
        jScrollPane1.setViewportView(ta);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel2.setText("Booking Requests");

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TaxiBookingSystem/Icons/icons8_taxi_driver_65px_1.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TaxiBookingSystem/Icons/icons8_login_45px_1.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        refLBL.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        refLBL.setText("  Refresh  ");
        refLBL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        refLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refLBLMouseClicked(evt);
            }
        });

        acceptLBL.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        acceptLBL.setText("  Accept ");
        acceptLBL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        acceptLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acceptLBLMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TaxiBookingSystem/Icons/icons8_taxi_route_35px.png"))); // NOI18N
        jLabel6.setText(" Number Of Deliveries ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TaxiBookingSystem/Icons/icons8_Cheque_35px.png"))); // NOI18N
        jLabel7.setText(" Estimated Income ");

        numOfDTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numOfDTF.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        numOfDTF.setEnabled(false);
        numOfDTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numOfDTFActionPerformed(evt);
            }
        });

        estIncomeTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        estIncomeTF.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        estIncomeTF.setEnabled(false);
        estIncomeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estIncomeTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(refLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(acceptLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addComponent(numOfDTF)
                            .addComponent(estIncomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 52, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numOfDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(estIncomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(acceptLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {acceptLBL, refLBL});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ta.setText(" Refresh To Accept Available Orders");
        numOfDTF.setText(" 0");
        estIncomeTF.setText(" 0 AED");
    }//GEN-LAST:event_formWindowActivated

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        DriverLoginScreen l = new DriverLoginScreen();
        dispose();
        l.setVisible(true);

    }//GEN-LAST:event_jLabel3MouseClicked

    private void numOfDTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numOfDTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numOfDTFActionPerformed

    private void estIncomeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estIncomeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estIncomeTFActionPerformed

    private void refLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refLBLMouseClicked
        ta.setText(b.generateFDiverReciept());
    }//GEN-LAST:event_refLBLMouseClicked

    private void acceptLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceptLBLMouseClicked
        if (ta.getText().equals(" Refresh To Accept Available Orders")) {
            JOptionPane.showMessageDialog(this, "Refresh First!");
        } else if (ta.getText().equals(" Booking Accepted!")) {
            ta.setText(" Refresh To Accept More Orders");
        } else { 
            ta.setText("Booking Accepted!");
            d.deliveryComplete(b);
            numOfDTF.setText(" " + d.getDeliveries());
            estIncomeTF.setText(" " + d.getIncome() + " AED");
        }
    }//GEN-LAST:event_acceptLBLMouseClicked
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DriverScreen_Bookings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acceptLBL;
    private javax.swing.JTextField estIncomeTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField numOfDTF;
    private javax.swing.JLabel refLBL;
    private javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables
}
