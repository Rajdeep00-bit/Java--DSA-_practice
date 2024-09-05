import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt(),ld,rev_num=0,dup=n;
            while(n>0){
                ld=n%10;
                rev_num=(rev_num*10)+ld;
                n=n/10;

            }
            if(rev_num==dup){
                System.out.println("Yes,It's a palindrome");
            }else{
                s
            }
    }
}
