package CLasses;
public class Cars {
    int num=100;
    public int doors;
    public int wheels;
    private String model;
    public String engine;
    public String colour;
    public void setModel (String model){
        if (model=="Carrera"||model=="911"){
            this.model=model;

        }
        else{
            this.model="Unkown";
        }
    }
    public String getModel(){
        return this.model;
    }
}
