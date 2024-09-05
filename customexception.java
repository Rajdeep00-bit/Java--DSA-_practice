import java.util.*;

class RajdeepException extends Exception {
    // Constructor with a string message
    public RajdeepException(String str) {
        super(str);
    }
}

public class customexception {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        try {
            i = 18 / j; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            try {
                // Throwing custom exception
                throw new RajdeepException("No need");
            } catch (RajdeepException re) {
                // Handling custom exception
                System.out.println("RajdeepException: " + re.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Problem is: " + e);
        }
    }
}
