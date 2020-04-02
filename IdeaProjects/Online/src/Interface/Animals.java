package Interface;

interface Animal {
    void eat();
    void sound();
}
interface Dog{
    void sleep();

}
class Cat implements Animal,Dog{
  public void eat(){
      System.out.println("cat is eating");
  }
  public void sound(){
      System.out.println("meow meow");
  }
  public void sleep(){
      System.out.println("sleeping");
  }

}
public class Animals{
    public static void main(String[] args) {
        Cat c=new Cat();
        c.eat();
        c.sound();
        c.sleep();
    }
}