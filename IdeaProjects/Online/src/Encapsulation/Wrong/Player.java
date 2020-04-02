package Encapsulation.Wrong;

public class Player {
    public String name;
    public int health;
    public String weapon;
    public void losthealth(int damage){
        this.health=this.health-damage;
        if(this.health<=0){
            System.out.println("Player is knockedout");
            //Reduce number of live of reamining player
        }
    }
    public int remaininghealth(){
        return this.health;
    }
}
