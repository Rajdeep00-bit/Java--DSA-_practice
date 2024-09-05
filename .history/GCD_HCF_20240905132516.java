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
   

}    
}
