import java.util.*;
class mobile{
    String brand;
    int price;
    static String name;
    public static void show(mobile obj){
        System.out.println(obj.brand+":"+obj.price+":"+name);
    }
}
public class staticmethod {
    public static void main(String[] args) {
        mobile m1=new mobile();
        m1.brand="Apple";
        m1.price=1500000;

        mobile m2=new mobile();
        m2.brand="Samsung";
        m2.price=50000;
        mobile.name="Smartphone ";

        mobile.show(m1);
        mobile.show(m2);
    }

}
