import java.util.*;
public class prime_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0,n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("It's a prime number");
        }else{
            System.out.println("It's not a prime number");
        }
    }
}
