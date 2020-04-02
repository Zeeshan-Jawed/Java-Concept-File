package Inheritance;

public class Animals {
    private String name;
    private int brain;
    private int weight;

    public Animals(String name, int brain, int weight) {
        this.name = name;
        this.brain = brain;
        this.weight = weight;
    }
    public void eat(){
        System.out.println("Animals eat() called");
    }
    public void move (int speed){
        System.out.println("Animal move at "+speed);

    }
    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }


    public int getWeight() {
        return weight;
    }
}

