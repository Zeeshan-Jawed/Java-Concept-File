package Construtor;

public class Vip {
    private String name;
    private double creditlimit;
    private String email;
    public Vip(){
        this("Default name", 50000.0, "default@gmail.com");
    }
    public Vip(String name, double creditlimit) {

        this(name,creditlimit,"unkown@gmail.com");
    }

    public Vip(String name, double creditlimit, String email) {
        this.name = name;
        this.creditlimit = creditlimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditlimit() {
        return creditlimit;
    }

    public String getEmail() {
        return email;
    }
}
