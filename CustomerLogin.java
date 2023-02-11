package TaxiBookingSystem.GUIs;

import TaxiBookingSystem.GUIs.DriverLoginScreen;
import javax.swing.JOptionPane;

public class CustomerLogin extends javax.swing.JFrame {

    public static String name;
    public static String phoneNumber;

    public CustomerLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        exitLBL = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        phoneNumberTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        loginLBL = new javax.swing.JLabel();
        driverLBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 908, 396));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(908, 396));
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TaxiBookingSystem/Icons/icons8_user_100px.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Login");

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        exitLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TaxiBookingSystem/Icons/icons8_exit_35px_1.png"))); // NOI18N
        exitLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLBLMouseClicked(evt);
            }
        });

        nameTF.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        nameTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameTFFocusGained(evt);
            }
        });

        phoneNumberTF.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        phoneNumberTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneNumberTFFocusGained(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TaxiBookingSystem/Icons/icons8_name_70px_1.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TaxiBookingSystem/Icons/icons8_phone_70px.png"))); // NOI18N

        loginLBL.setBackground(new java.awt.Color(255, 255, 255));
        loginLBL.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        loginLBL.setText("       Enter ");
        loginLBL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        loginLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginLBLMouseClicked(evt);
            }
        });

        driverLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TaxiBookingSystem/Icons/icons8_taxi_driver_35px.png"))); // NOI18N
        driverLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                driverLBLMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(driverLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitLBL))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(phoneNumberTF)
                            .addComponent(nameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 202, Short.MAX_VALUE)
                .addComponent(loginLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(driverLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(phoneNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(loginLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLBLMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLBLMouseClicked

    private void nameTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTFFocusGained
    }//GEN-LAST:event_nameTFFocusGained

    private void phoneNumberTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNumberTFFocusGained
    }//GEN-LAST:event_phoneNumberTFFocusGained

    private void loginLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLBLMouseClicked
        name = nameTF.getText();
        phoneNumber = phoneNumberTF.getText();
        if ((isValidName(name) && isValidNum(phoneNumber))) {
            Customer_Screen n = new Customer_Screen();
            dispose();
            n.setVisible(true);
        }
    }//GEN-LAST:event_loginLBLMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    }//GEN-LAST:event_formWindowActivated

    private void driverLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_driverLBLMouseClicked
        DriverLoginScreen n = new DriverLoginScreen();
        dispose();
        n.setVisible(true);
    }//GEN-LAST:event_driverLBLMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerLogin().setVisible(true);
            }
        });
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

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

    public boolean isValidName(String n) {
        for (int i = 0; i < n.length(); i++) {
            if (n.equals("") || n.equals(" ") || n.length() <= 2) {
                return false;
            }
            if ( !Character.isAlphabetic(n.charAt(i)) && (n.charAt(i) != ' ') )  {
                System.out.println(n.charAt(i) + "");
                JOptionPane.showMessageDialog(this, "Error - Enter a Valid Name", "Error", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel driverLBL;
    private javax.swing.JLabel exitLBL;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel loginLBL;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField phoneNumberTF;
    // End of variables declaration//GEN-END:variables
}
