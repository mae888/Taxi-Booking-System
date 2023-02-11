package TaxiBookingSystem.GUIs;

import TaxiBookingSystem.Classes.Driver;
import TaxiBookingSystem.Classes.DriverLogin;
import javax.swing.JOptionPane;

public class NewDriver extends javax.swing.JFrame {

    boolean add = true;

    public NewDriver() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pass1TF = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        standRB = new javax.swing.JRadioButton();
        familyRB = new javax.swing.JRadioButton();
        pass2TF = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        clearBTN = new javax.swing.JButton();
        addBTN = new javax.swing.JButton();
        nameTF = new javax.swing.JTextField();
        pnTF = new javax.swing.JTextField();
        clearBTN1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("        New Driver");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));

        jPanel3.setBackground(new java.awt.Color(204, 51, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        pass1TF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Password:\n");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Confirm Password:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Vehicle type:");

        BG1.add(standRB);
        standRB.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        standRB.setText(" Standard");
        standRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standRBActionPerformed(evt);
            }
        });

        BG1.add(familyRB);
        familyRB.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        familyRB.setText(" Family");
        familyRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familyRBActionPerformed(evt);
            }
        });

        pass2TF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Full Name");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Phone Number");

        clearBTN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clearBTN.setText("Clear");
        clearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTNActionPerformed(evt);
            }
        });

        addBTN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addBTN.setText("ADD");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        nameTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        pnTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        clearBTN1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clearBTN1.setText("Return");
        clearBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTN1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(clearBTN1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(familyRB)
                        .addGap(46, 46, 46)
                        .addComponent(standRB))
                    .addComponent(pass1TF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameTF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pass2TF, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(clearBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addBTN, clearBTN, clearBTN1});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {nameTF, pass1TF, pass2TF, pnTF});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pnTF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(standRB)
                    .addComponent(familyRB))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pass2TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBTN)
                    .addComponent(clearBTN1))
                .addGap(22, 22, 22))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {nameTF, pass1TF, pass2TF, pnTF});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addBTN, clearBTN, clearBTN1});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void standRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standRBActionPerformed

    }//GEN-LAST:event_standRBActionPerformed

    private void familyRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familyRBActionPerformed

    }//GEN-LAST:event_familyRBActionPerformed

    private void clearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTNActionPerformed
        nameTF.setText("");
        pnTF.setText("");
        BG1.clearSelection();
        pass1TF.setText("");
        pass2TF.setText("");
    }//GEN-LAST:event_clearBTNActionPerformed

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        add = true;
        
        
        if (nameTF.getText().equals("") || pnTF.getText().equals("") || (!familyRB.isSelected() && !standRB.isSelected()) || pass1TF.getText().equals("") || pass2TF.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Fill The New Driver Details");
        } else {
            String name = nameTF.getText();
            String pn = pnTF.getText();
            String pass = "";
            String vType = "";
            
            
            if (!pass1TF.getText().equals(pass2TF.getText())) {
                add = false;
                JOptionPane.showMessageDialog(this, "Please Enter MATCHING Passwords");
            } else {
                pass = pass1TF.getText();
            }
            
            
            if (familyRB.isSelected()) {
                vType = "Family";
            } else {
                vType = "Standard";
            }
            
            if (!isValidNum(pn)) {
                add = false; 
            }
            
            if (add) {
                DriverLogin dl = new DriverLogin();
                dl.addDriver(new Driver(name, pn, pass, vType));
                JOptionPane.showMessageDialog(this, "Driver Added");
                clearBTN.doClick();
                DriverLoginScreen dls = new DriverLoginScreen();
                dispose();
                dls.setVisible(true);
            }
        }
    }//GEN-LAST:event_addBTNActionPerformed

    private void clearBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTN1ActionPerformed
        DriverLoginScreen dls = new DriverLoginScreen();
        dispose();
        dls.setVisible(true);
    }//GEN-LAST:event_clearBTN1ActionPerformed

    public boolean isValidNum(String n) {
        if (n.length() != 10) {
            JOptionPane.showMessageDialog(this, "Error - The number has more/less than 10 digits", "Error", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else if (!n.substring(0, 2).equals("05")) {
            JOptionPane.showMessageDialog(this, "Error - The number does not start with 05", "Error", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewDriver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BG1;
    private javax.swing.JButton addBTN;
    private javax.swing.JButton clearBTN;
    private javax.swing.JButton clearBTN1;
    private javax.swing.JRadioButton familyRB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nameTF;
    private javax.swing.JPasswordField pass1TF;
    private javax.swing.JPasswordField pass2TF;
    private javax.swing.JTextField pnTF;
    private javax.swing.JRadioButton standRB;
    // End of variables declaration//GEN-END:variables
}
