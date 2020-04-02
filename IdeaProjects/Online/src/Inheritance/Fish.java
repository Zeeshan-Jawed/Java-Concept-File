package Inheritance;

public class Fish extends Animals{
    private int eyes;
    private int gills;
    private int fins;

    public Fish(String name, int weight, int eyes, int gills, int fins) {
        super(name, 1, weight);
        this.eyes = eyes;
        this.gills = gills;
        this.fins = fins;
    }
    private void rest(){

    }
    private void moveMuscles(){

    }
    private void backfins(){

    }
    private void swim(int speed){
    moveMuscles();
    backfins();
    super.move(speed);
    }
}
