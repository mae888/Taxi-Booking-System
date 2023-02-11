package TaxiBookingSystem.Classes;

public class User {

    // Abdulla Alkaabi - 202030083
    protected String name;
    protected String phoneNum;

    // bewary of construtor chaining
    // default constructor will be called by all subclass constructors
    public User() {

    }

    public User(String Name, String Phone) {
        this.name = Name;
        this.phoneNum = Phone;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return name + ", Phone Number: " + phoneNum;
    }

}
