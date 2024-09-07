import java.util.*;
class backtracking{
    public void print(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        print((i+1),n);

    }
}
public class recursion2 {
    public static void main(String[] args) {
        backtracking b=new backtracking();
        b.print(1,5);
    }
}
