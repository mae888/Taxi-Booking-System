package TaxiBookingSystem.Classes;

public class Address {

    // Abdulla Alkaabi - 202030083
    private String to;
    private String toStreet;
    private String from;
    private String fromStreet;

    public Address() {
        this.to = "";
        this.from = "";
        this.fromStreet = "";
        this.toStreet = "";
    }

    public Address(String From, String fromStreet, String To, String toStreet) {
        this.to = To;
        this.from = From;
        this.fromStreet = fromStreet;
        this.toStreet = toStreet;
    }

    public String getToStreet() {
        return toStreet;
    }

    public String getFromStreet() {
        return fromStreet;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    @Override
    public String toString() {
        return "Address{" + "to=" + to + ", from=" + from + '}';
    }

}
