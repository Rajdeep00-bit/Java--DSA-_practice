//public method

//import java.util.*;
//public class method {
//    public void show(){
//        System.out.println("This is show method");
//
//    }
//
//    public static void main(String[] args) {
//        method m1=new method();
//        m1.show();
//    }
//}

//static method
//import java.util.*;
//public class method{
//    static void display(){
//        System.out.println("This is a static method");
//    }
//
//    public static void main(String[] args) {
//        display();
//    }
//}


//public method passing attributes


import java.util.*;
public class method{
    private int roll_no;
    private String n;
    public void show(int roll,String name){
        this.roll_no=roll;
        this.n=name;
        System.out.println(n);
        System.out.println(roll_no);


    }

    public static void main(String[] args) {
        method m1=new method();
        m1.show(5,"Rajdeep");
    }
}


