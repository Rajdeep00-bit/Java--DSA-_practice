import java.util.*;
class C{
    public void show1(){
        System.out.println("show method");
    }
}
class D extends C{
    public void show2(){
        System.out.println("show method 2");
    }
}
public class casting {
    public static void main(String[] args) {
        C obj =(C)new D();
        obj.show1(); ///upcasting

        D obj1=(D)obj;//Downcasting
        obj1.show2();
    }

}
