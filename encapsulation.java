//encapsulation using abstract keyword
import java.util.*;
abstract class  car{
    public abstract void drive();
    private String model;
    public String getmodel(){
        return model;

        }
    public void setModel(String model){
        this.model=model;
    }
    public void playmusic(){
        System.out.println("play Music");
    }

        }
        class Wagonr extends car{
        public void drive(){
            System.out.println("can drive");
        }
        }
public class encapsulation {
    public static void main(String[] args) {
        Wagonr w1=new Wagonr();
        w1.setModel("Sedan");
        w1.drive();
        w1.playmusic();
        w1.getmodel();
        System.out.println("Car model: " + w1.getmodel());
    }

} 
