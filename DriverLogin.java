package TaxiBookingSystem.Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class DriverLogin {

    public boolean addDriver(Driver o) {
        String phoneNumber = o.getPhoneNum();
        String password = o.getPassword();
        boolean found = false;
        try {
            FileWriter r = new FileWriter("Drivers", true);
            if (!PhoneNumberExists(phoneNumber)) {
                r.write(phoneNumber + "-" + password);
                r.flush();
                r.close();
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Phone Number is Already In Use, Log In Please");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }

    public boolean PhoneNumberExists(String pn) {
        String phoneNumber = "";
        String password = "";
        try {
            Scanner scan = new Scanner(new FileReader("Drivers"));
            scan.useDelimiter("[-\n]");
            while (scan.hasNext()) {
                phoneNumber = scan.next();
                password = scan.next();
                if (phoneNumber.equals(pn)) {
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e + "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "");
        }
        return false;
    }

    public boolean login(String pn, String pass) {
        String phoneN = "";
        String Pass = "";
        try {
            Scanner s = new Scanner(new FileReader("Drivers"));
            s.useDelimiter("[-\n]");
            while (s.hasNext()) {
                phoneN = s.next();
                Pass = s.next();
                if (phoneN.equals(pn) && Pass.equals(pass)) {
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "File Not Found!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "");
        }
        return false;
    }

    public void resetPassword(String pn, String newPass) {
        File oldF = new File("Drivers");
        File temp = new File("Temp.txt");
        String phone = "", pass = "";
        try {
            Scanner scan = new Scanner(new FileReader("Drivers"));
            FileWriter r = new FileWriter(temp);
            scan.useDelimiter("[-\n]");
            while (scan.hasNext()) {
                phone = scan.next();
                pass = scan.next();
                if (!phone.equalsIgnoreCase(pn)) {
                    r.write(phone + "-" + pass + "\n");
                }
            }
            r.write(pn + "-" + newPass + "\n");
            scan.close();
            r.flush(); 
            r.close();
            oldF.delete();
            File f = new File("Drivers");
            temp.renameTo(f);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }

}
/*

  public void resetPassword(String pn, String newPass) {
//        if (PhoneNumberExists(pn)) {
        File oldF = new File("Drivers");
        File temp = new File("Temp.txt");
        String phone = "", pass = "";
        try {
            Scanner scan = new Scanner(new FileReader("Drivers"));
            FileWriter r = new FileWriter(temp);
            scan.useDelimiter("[-\n]");
            while (scan.hasNext()) {
                phone = scan.next();
                pass = scan.next();
                if (!phone.equalsIgnoreCase(pn)) {
                    r.write(phone + "-" + pass + "\n");
                }
            }
            r.write(pn + "-" + newPass + "\n"); 
            scan.close();
            r.flush();
            r.close();
            oldF.delete();
            File f = new File("Drivers");
            temp.renameTo(f);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
//            return true;
//        } else {
//            JOptionPane.showMessageDialog(null, "The Entered Phone Number Is Not Registered");
//        }
//        return false;
    }
 */
