package TaxiBookingSystem.Classes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

public class Booking {

    // Abdulla Alkaabi - 202030083
    private String date; // will be entered by user othwerwise generated
    private String time; // will be entered by user othwerwise generated
    private Address address;
    // has 2 parameters (Location , Destination) or (to , from)

    private double fee;
    private String vehicle;
    private Driver driver = new Driver();
    public Customer customer;
    public static ArrayList<Driver> driverL = new ArrayList();

    public Booking(String Farea, String FStreet, String Tarea, String TStreet, String vehicle) {
        this.date = generateDate();
        this.time = generateTime();
        this.address = new Address(Farea, FStreet, Tarea, TStreet);
        this.fee = generateFee();
        this.vehicle = vehicle;
        this.driver = generateDriver(vehicle);
        customer = new Customer("", "");
    }
    

    //Book Later constructor
    public Booking(String date, String time, String Farea, String FStreet, String Tarea, String TStreet, String vehicle) {
        this.date = "Date: " + date;
        this.time = "Time: " + time;
        this.address = new Address(Farea, FStreet, Tarea, TStreet);
        this.fee = generateFee();
        this.driver = generateDriver(vehicle);
        customer = new Customer("", "");
        this.vehicle = vehicle;
    }
    
    
    public Booking(String name , String pn){
        this.date = generateDate();
        this.time = generateTime();
        this.fee = generateFee();
        customer = new Customer(name, pn);
    }
    
    
    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public double getFee() {
        return fee;
    }

    public String getVehicle() {
        return vehicle;
    }

    public Driver generateDriver(String vehicle) {
        Random r = new Random();
        Driver[] standard = new Driver[5];
        Driver[] family = new Driver[5];
        standard[0] = new Driver("Mohammed Ali", "0506538879", "12345", "Standard");
        standard[1] = new Driver("Ahmed Omer", "0558971464", "12345", "Standard");
        standard[2] = new Driver("Jamal Mohammed", "0547773327", "12345", "Standard");
        standard[3] = new Driver("Waleed Abdulla", "0559087453", "12345", "Standard");
        standard[4] = new Driver("Adnan Ibrahim", "0563324875", "12345", "Standard");
        family[0] = new Driver("Salem Hamza", "0503245665", "12345", "Family");
        family[1] = new Driver("Hamad Kareem", "0558984364", "12345", "Family");
        family[2] = new Driver("Anwar Khalifa", "0547009827", "12345", "Family");
        family[3] = new Driver("Mohammed Omran", "0553257453", "12345", "Family");
        family[4] = new Driver("Anas Majed", "0563334455", "12345", "Family");
        if (vehicle.equalsIgnoreCase("Standard")) {
            return standard[r.nextInt(5)];
        } else {
            return family[r.nextInt(5)];
        }

    }

    public double generateFee() {
        double[] feeGen = {30.0, 33.5, 31.50, 42.75, 42.75, 50.2};
        int index, Min, Max;
        Min = 0;
        Max = feeGen.length;

        index = (int) (Math.random() * (Max - Min) + Min);
        double value = feeGen[index];

        return value;
    }

    public String generateTime() {

        DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String Time = time.format(now);

        return "Time: " + Time;
    }

    public String generateDate() {
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyy");
        LocalDateTime now = LocalDateTime.now();
        String Date = date.format(now);

        return "Date: " + Date;
    }

    public String getDriverName() {
        return driver.getName();
    }

    public String getDriverPlateNumber() {
        return driver.getPlateNumber();
    }

    public void setCustomer(String name, String phoneNumber) {
        customer.setName(name);
        customer.setPhoneNum(phoneNumber);
    }

    
    public String generateReciept() {

        return "______________________Receipt___________________________" + "\n \n"
                + "  Booking Details : " + "\n"
                + "  Customer Name: " + this.customer.getName() + "\n"
                + "  Customer Phone Number: " + this.customer.getPhoneNum() + "\n"
                + "  " + this.date + "\n"
                + "  " + this.time + "\n"
                + "  Vehicle Type: " + this.vehicle + "\n"
                + "  Pickup Location: " + this.address.getFrom() + " " + this.address.getFromStreet() + "\n"
                + "  Destination: " + this.address.getTo() + " " + this.address.getToStreet() + "\n"
                + "  Driver Details: " + this.driver.toString() + "\n"
                + "  Vehicle Plate Number: " + this.driver.getPlateNumber() + "\n"
                + "  Fee:" + this.fee + "\n"
                + "________________________________________________________" + "\n";
    }
    
    
    public String generateFDiverReciept() {
        Random r = new Random();
        int[] distance = new int[15];
        int f = 0;
        for (int i = 4; i < 19; i++) {
          distance[f] = i;
          f++;
        }
        return  
                 " Booking Details : " + "\n"
                + " Customer Name: " + this.customer.getName() + "\n"
                + " Customer Phone Number: " + this.customer.getPhoneNum() + "\n"
                + " " + this.date + "\n"
                + " " + this.time + "\n"
                + " Customer Location: About " + distance[r.nextInt(15)] + " Km Away" +  "\n"
                + " Estimated Fee:" + this.fee + "\n"
                ;
    }

}
