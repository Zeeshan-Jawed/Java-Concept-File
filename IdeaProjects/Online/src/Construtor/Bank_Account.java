package Construtor;
public class Bank_Account {
    private String Number;
    private double balance;
    private String customername;
    private String customeremail;
    private String customermoblienumber;
    public Bank_Account() {
        this("3e434e4",77.8,"rimsha","@f=.com","033121213313");

        System.out.println("Empty constructor called");

    }
    public Bank_Account(String Number,double balance,String customername,String customeremail,
                        String customermoblienumber){
        System.out.println("Account constructor with parameters called");
        this.Number = Number;
        this.balance = balance;
        this.customername = customername;
        this.customeremail = customeremail;
        this.customermoblienumber = customermoblienumber;
    }

    public Bank_Account(String customername, String customeremail, String customermoblienumber) {
        this("9997",100.5,customername,customeremail,customermoblienumber);
    }

    public void deposit (double depositAmount){
        this.balance+=depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }
    public void withdraw(double withdrawalAmount){
        if(this.balance - withdrawalAmount <0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed, Remaining balance = " + this.balance);
        }
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        this.Number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomeremail() {
        return customeremail;
    }

    public void setCustomeremail(String customeremail) {
        this.customeremail = customeremail;
    }

    public String getCustomermoblienumber() {
        return customermoblienumber;
    }

    public void setCustomermoblienumber(String customermoblienumber) {
        this.customermoblienumber = customermoblienumber;
    }


}
