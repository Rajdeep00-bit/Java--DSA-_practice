//import java.util.*;
//public class object {
//    int id=10;
//    public static void main(String args[]){
//        object o1=new object();
//        System.out.println(o1.id);
//    }
//}
import java.util.*;
public class object{
    int roll=10;
    String name="Rajdeep";

    public static void main(String[] args) {
        object o1=new object();
        System.out.println(o1.name+" "+o1.roll);
        //modify
        o1.name="Rajdeep Saha";
        System.out.println(o1.name+" "+o1.roll);
    }
}