import java.util.*;
public class reversenumber {
    public static void main(String[] args) {
        int rev_n=0,lastdigit;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            lastdigit=n%10;
            rev_n=(rev_n*10)+lastdigit;
            n=n/10;
        }
        System.out.println("Reverse number is:"+rev_n);
    }
}
