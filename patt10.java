import java.util.*;
public class patt10 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<2*n-1;i++){
            int stars; // number of stars to print

            // Determine the number of stars to print based on the current line
            if (i < n) {
                stars = i + 1; // increasing stars up to the middle line
            } else {
                stars = 2 * n - 1 - i; // decreasing stars after the middle line
            }

            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
