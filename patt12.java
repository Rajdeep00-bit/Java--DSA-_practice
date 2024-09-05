import java.util.Scanner;

public class patt12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // Read the input value for n


        for (int i = 1; i <= n; i++) {
            // Calculate the number of spaces
            int space = 2 * (n - i);

            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print spaces
            for (int k = 1; k <= space; k++) {
                System.out.print("  ");  // two spaces
            }

            // Print decreasing numbers
            for (int l = i; l >= 1; l--) {
                System.out.print(l + " ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
