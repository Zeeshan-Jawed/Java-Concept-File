package Interface;
interface Employee {
    String bank_name="HBL";
    void account();
    void deposit();
}
interface Customer{
    String bank_name="Habib";
    void customer_id();
    void customer_name();
}
class Demo implements Employee,Customer{

    public  void account(){
        System.out.println("thats my account ");
    }
    public void deposit(){
        System.out.println("deposit rupees");
    }
    public void customer_id(){
        System.out.println("rimsha123");
    }
    public void customer_name() {
        System.out.println("Rimsha");

    }

    public static void main(String[] args) {
        Demo d=new Demo();
        d.account();
        d.deposit();
        d.customer_id();
        d.customer_name();


    }
}