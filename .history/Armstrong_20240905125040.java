import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),ld,sum=0,dup=n;
        while(n>0){
            ld=n%10;
            sum=sum+(ld*ld*ld);
            n=n/10;
        }
        if(dup ==sum){
            System.out.println("It's an armstrong numvber");
        }

        
    }
    
}
