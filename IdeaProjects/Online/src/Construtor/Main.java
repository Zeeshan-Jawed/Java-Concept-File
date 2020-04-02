package Construtor;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //   Bank_Account zeeshan=new Bank_Account();
//    zeeshan.setNumber("1233");
//    zeeshan.setCustomername("Zeeshan");
//    zeeshan.setCustomeremail("jawedW@gmail.com");
//    zeeshan.setCustomermoblienumber("033132032");
        //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//   System.out.println(zeeshan.getCustomername());
//        System.out.println(zeeshan.getBalance());
//        Scanner sc=new Scanner(System.in);
//    zeeshan.deposit(1009.0);
//        System.out.println("Enter withdrawal Amount");
//        zeeshan.withdraw(sc.nextDouble());
//        Bank_Account omer=new Bank_Account("omer","omer@gmail.com","03132442352");
//        System.out.println(omer.getNumber()+" Name "+omer.getCustomername());
        //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx


//        Vip person1=new Vip();
//        System.out.println(person1.getName());
//        Vip person2=new Vip("bob",250000);
//        System.out.println(person2.getName());
//        Vip person3=new Vip("Tim",10909,"tim@gmail.com");
//        System.out.println(person3.getName());

        Bank_Account obj = new Bank_Account();
//       Bank_Account obj1 = new Bank_Account("Zeeshan", "zeeshan@gmail.com","033332323232");
        System.out.println(obj.getCustomername()+ " "+obj.getCustomeremail()+" "+obj.getCustomermoblienumber());

    }
}
