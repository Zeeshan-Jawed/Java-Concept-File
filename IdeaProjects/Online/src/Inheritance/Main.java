package Inheritance;

public class Main {
    public static void main(String[] args) {
    Animals animals=new Animals("Animal",4, 67 );
    Dogs dogs=new Dogs("Puppy",45,2,32,1,32);
     // dogs.eat();
    dogs.walk();
        System.out.println(dogs.getEyes()+" "+dogs.getName());



    }


    }
