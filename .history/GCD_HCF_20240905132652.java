import java.util.*;
public class GCD_HCF {
    public static int gcd(int a,int b){
        wjile(b!=0){
            int temp=b;
            b=a%b;
            a=temp;

        }
        return a;
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter first number:");
    int n1=sc.nextInt();
    System.out.println("Enter second number:");
    int n2=sc.nextInt();

    int result=gcd

}    
}
