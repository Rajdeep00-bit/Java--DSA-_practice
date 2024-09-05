import java.util.*;
public class trywithfinally {
    public static void main(String[] args) {
        int num=0;
        try{
            Scanner sc=new Scanner(System.in);
            num=sc.nextInt();
        }finally{
            System.out.println("not possible");
        }

    }
}
