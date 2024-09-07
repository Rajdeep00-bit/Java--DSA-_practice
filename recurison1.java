import java.util.*;
class printing{

    public void print(int i , int n){
        if(i>n){
            return;
        }
        System.out.println(i);

        print(i+1,n);

    }

}
public class recurison1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        printing p=new printing();
        p.print(1,n);
    }

}
