import java.util.*;
public class loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[1];
        for(int i=0;i<arr.length;i++){
            arr[0]=sc.nextInt();
        }
        int range=sc.nextInt();
        for(int i=1;i<=range;i++){
            System.out.println(arr[0]+"*"+i+"="+(arr[0]*i));
        }
    }
}


