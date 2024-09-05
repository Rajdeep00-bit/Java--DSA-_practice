//import java.util.*;
//public class exception {
//    public static void main(String[] args) {
//        int i=0;
//        int j=0;
//        try{
//            j=j/i;
//        }catch(Exception e){
//            System.out.println("problem");
//
//        }
//        System.out.println(j);
//    }
//}
//try and multiple catch

import java.util.*;
public class exception{
    public static void main(String[] args) {
        int i=0;
        int j=2;
        int nums[]=new int[5];
        try{
            i=18/i;
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in limit");
        }catch(Exception e){
            System.out.println("problem is="+e);
        }
    }
}