package Inheritance;

public class Dogs extends Animals {
    private int eyes;
    private int legs;
    private int tails;
    private int teeths;

    public Dogs(String name, int weight, int eyes, int legs, int tails, int teeths) {
        super(name,1, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tails = tails;
        this.teeths = teeths;
    }
    private void chew(){
        System.out.println("Dog .chew() called");
    }
    public void eat(){
        System.out.println("Dog .eat() called");
        chew();
        super.eat();
    }
    public void walk(){
        System.out.println("Dog.walk called ");
        move(5);
    }
    public void run(){
        System.out.println("Dog.run called ");
        move(10);
    }
    private void moveleg(int speed){
        System.out.println("move leg called "+speed);
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move called child");
        moveleg(speed);
        super.move(speed);
    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTails() {
        return tails;
    }

    public int getTeeths() {
        return teeths;
    }
}
