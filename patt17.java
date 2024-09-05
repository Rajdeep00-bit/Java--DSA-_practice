import java.util.*;
public class patt17 {
    public static void main(String[] args) {
        ///space n-i-1
        // alp 2*i+1
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("  ");
            }
            char ch ='A';int breakpoint=(2*i+1)/2;
            for(int k=0;k<2*i+1;k++){
                System.out.print(ch+" ");
                if(k<breakpoint){
                    ch++;
                }else{
                    ch--;
                }
                }
                for(int l=0;l<n-i-1;l++){
                    System.out.print(" ");
                }
                System.out.println();

        }
    }
}
