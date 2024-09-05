//import java.util.*;
//interface Acc{
//    void show(int i);
//}
//public class lambda {
//    public static void main(String[] args) {
//        int n = 5;
//
//            Acc obj = (i) -> System.out.println("in a show");
//            obj.show(5);
//
//    }
//}

import java.util.*;
interface Box{
    int add(int a ,int b);


}
public class lambda{
    public static void main(String[] args) {
        Box bb=(a,b)->a+b;
        int result=bb.add(5,4);
        System.out.println(result);
    }
}
