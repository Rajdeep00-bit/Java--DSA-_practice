import java.util.*;
class A{
    public void show(){
        System.out.println("Show baby show");
    }
}
class B extends A{
    public void show(){
        System.out.println("showing baby showing");
    }
}
public class dynamicdispatch {
    public static void main(String[] args) {
        A obj =new A();
        obj.show();
//        obj =new B();
//        obj.show();






    }
}
