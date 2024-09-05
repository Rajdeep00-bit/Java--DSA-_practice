import java.util.*;

public class count {
    public static void main(String[] args) {
        int n, r, count = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        // Ensure n is positive for the loop
        if (n < 0) {
            n = -n; // Convert to positive if n is negative
        }

        // Loop to count the digits
        while (n > 0) {
            r = n % 10;
            count = count + 1;
            n = n / 10;
        }

        // Output the count
        System.out.println("Number of digits: " + count);
    }
}
