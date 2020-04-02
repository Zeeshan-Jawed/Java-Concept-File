
interface Multiple {
    void a2();


}
interface Multiple2 {

    void a1();
}
    class Multiple3 implements Multiple,Multiple2{
   public void a2(){
        System.out.println("hey");
    }
   public void a1(){

       System.out.println("heyyyy");
    }
}
