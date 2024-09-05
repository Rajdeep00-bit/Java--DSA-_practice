import java.util.*;
class Abs{
    public void show()throws ClassNotFoundException{
        Class.forName("calc");
    }
}
public class duckingexception {
    public static void main(String[] args) {
        Abs obj=new Abs();
        try{
            obj.show();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
