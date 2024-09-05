import java.util.*;
public class patt18 {
    public static void main(String[] args) {
        ///space  n-i-1
        // num=2*i+1
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("  ");
            }
            int num=1;
            int breakpoint=(2*i+1/2);
            for(int k=0;k<2*i+1;k++) {
                System.out.print(num+" ");
                if (k < breakpoint) {
                    num++;
                } else {
                    num--;
                }
            }
                for(int l=0;l<n-i-1;l++){
                    System.out.print(" ");
                }
                System.out.println();


        }
    }
}
