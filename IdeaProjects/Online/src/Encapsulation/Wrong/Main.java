package Encapsulation.Wrong;

public class Main {
    public static void main(String[] args) {
        Player player =new Player();
        player.name="Tim";
        player.health=20;
        player.weapon="Sword";
        int damage=10;
       player.losthealth(damage);
        System.out.println("Remaining Health "+player.remaininghealth());

         damage=11;
        player.losthealth(damage);
        System.out.println("Remaining Health "+player.remaininghealth());
    }

}

