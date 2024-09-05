import java.util.*;
public class wrapper_class {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Integer num1=num;
        int num2=num1;
        System.out.println(num2);
        sc.nextLine();
        String str=sc.nextLine();
        int num3=Integer.parseInt(str);
        System.out.println(num3*num);
    }
}
