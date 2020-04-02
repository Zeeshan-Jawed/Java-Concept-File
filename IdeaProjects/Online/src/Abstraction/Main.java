package Abstraction;
 abstract class Ubit{
     Ubit (){
         System.out.println("hello");
     }
     abstract void member();
 }
 abstract class Student extends Ubit{

     abstract void ubitstudent();
     void member(){
         System.out.println(".....");
     }
 }

class Show2 extends Student{
    @Override
    void ubitstudent() {
        System.out.println("====");
    }

    public static void main(String[] args) {
        Show2 obj=new Show2();
        obj.member();


    }
}