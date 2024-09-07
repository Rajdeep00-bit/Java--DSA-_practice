import java.util.*;
class recur{
    int count=1;
    public void print(){
        if(count>4){
            return;
        }
        System.out.println(count);
        count++;
        print();

    }

}
public class recursion {
    public static void main(String[] args) {
        recur r=new recur();
        r.print();
    }
}
