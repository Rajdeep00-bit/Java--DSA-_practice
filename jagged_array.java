
import java.util.*;
public class jagged_array {
    public static void main(String[] args) {
        int num[][]=new int[2][];
        num[0]=new int [2];
        num[1]=new int [2];
        Random rand=new Random();
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                num[i][j] = rand.nextInt(100);
            }
        }
        for(int row[]:num){
            for(int m:row){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}
