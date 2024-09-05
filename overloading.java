import java.util.*;

// Class to perform calculations
class Calculate {
    // Method to add two integers
    public int add(int a, int b) {
        // Local variable 'result' to store the sum of 'a' and 'b'
        int result = a + b;
        // Return the result
        return result;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        // Local variable 'result' to store the sum of 'a', 'b', and 'c'
        int result = a + b + c;
        // Return the result
        return result;
    }
}

// Main class to test the Calculate class
public class overloading {
    public static void main(String[] args) {
        // Create an instance of the Calculate class
        Calculate c1 = new Calculate();

        // Call the add method with two integer arguments
        // Store the result in the 'add1' variable
        int add1 = c1.add(7, 87);

        // Call the add method with three integer arguments
        // Store the result in the 'add2' variable
        // Note: The result is stored in a double variable, which is incorrect here
        double add2 = c1.add(2, 76, 88);

        // Print the result of the first addition
        System.out.println(add1);

        // Print the result of the second addition (which should be of type 'int')
        System.out.println(add2);
    }
}
