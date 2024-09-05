import java.util.*;

public class count {
    public static void main(String[] args) {
        int n, r, count = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n > 0) {
            r = n % 10;
            count = count + 1;
            n = n / 10;
        }

       
        System.out.println("Number of digits: " + count);
    }
}
