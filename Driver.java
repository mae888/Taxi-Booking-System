package TaxiBookingSystem.Classes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Driver extends User {

    protected String plateNumber;
    private String password;
    private double income = 0;
    private int deliveries = 0;
    private String vehicleType;

    public Driver() {
    }

    public Driver(String Name, String Phone, String password, String vehicleType) {
        super(Name, Phone);
        this.plateNumber = generatePlateNumber(vehicleType);
        this.password = password;
        this.income = 0;
        this.deliveries = 0;
        this.vehicleType = vehicleType;
    }

    public String generatePlateNumber(String type) {
        Random r = new Random();
        int n1 = r.nextInt(10);
        int n2 = r.nextInt(10);
        int n3 = r.nextInt(10);
        int n4 = r.nextInt(10);
        int n5 = r.nextInt(10);
        int n6 = r.nextInt(10);
        String pn = "";
        if (type.equalsIgnoreCase("standard")) {
            pn = "S-" + n1 + "" + n2 + "" + n3 + n4 + n5 + n6 + "";
        } else {
            pn = "F-" + n1 + "" + n2 + "" + n3 + n4 + n5 + n6 + "";
        }
        return pn;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getIncome() {
        return income;
    }

    public int getDeliveries() {
        return deliveries;
    }

    public String getVehicleType() {
        return vehicleType;
    }


    public String getPlateNumber() {
        return plateNumber;
    }

    
    public void deliveryComplete(Booking b){
        this.deliveries++;
        this.income += (0.25 * b.getFee());
    }
    
    
    public Booking generateBooking(){
        Random r = new Random();
        Booking[] bookings = new Booking[15];
        bookings[0] = new Booking("Mohammed Salem","0501547665");
        bookings[1] = new Booking("Ahmed Khalid","0556734211");
        bookings[2] = new Booking("Waleed Omran","0543568234");
        bookings[3] = new Booking("Hamad Ahmed","0567829805");
        bookings[4] = new Booking("Malik Azzam","0527465892");
        bookings[5] = new Booking("Omer Mohammed","0552020807");
        bookings[6] = new Booking("Khalifa Mohammed","0508823441");
        bookings[7] = new Booking("Ahmed Hesham","0558972341");
        bookings[8] = new Booking("Abdulla Salem","0563868612");
        bookings[9] = new Booking("Hussain Ahmed","0543287732");
        bookings[10] = new Booking("Abdulrahman Adam","0508743320");
        bookings[11] = new Booking("Anas Jamal","0508976053");
        bookings[12] = new Booking("Saad Yonus","0553486679");
        bookings[13] = new Booking("Yousif Zain","0523875419");
        bookings[14] = new Booking("Yaslam Ibrahim","0558926778");
        return bookings[r.nextInt(15)]; 
    }
    
    
    @Override
    public String toString() {
        return super.toString();
    }

}
