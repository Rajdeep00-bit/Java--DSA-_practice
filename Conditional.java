//import java.util.*;
//
//public class Conditional {
//    int a; // Variable to be used in the switch statement
//
//    // Constructor to initialize 'a' with a value
//    public Conditional(int value) {
//        this.a = value;
//    }
//
//    // Method to evaluate the value of 'a' using a switch statement
//    public void evaluate() {
//        switch (a) {
//            case 1:
//                System.out.println("Case 1: The value is 1");
//                break;
//            case 2:
//                System.out.println("Case 2: The value is 2");
//                break;
//            case 3:
//                System.out.println("Case 3: The value is 3");
//                break;
//            default:
//                System.out.println("Default case: The value does not match any case");
//                break;
//        }
//    }
//
//    public static void main(String[] args) {
//        // Create a Scanner object to take user input
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt the user to enter a value for 'a'
//        System.out.print("Enter a value for 'a' (1, 2, 3, or any other number): ");
//        int userInput = scanner.nextInt(); // Read the integer input from the user
//
//        // Create an instance of Conditional with the user-provided value
//        Conditional condition = new Conditional(userInput);
//
//        // Evaluate the instance based on the user input
//        condition.evaluate();
//
//        // Close the scanner
//
//    }
//}


///updated switch case
import java.util.*;
public class Conditional{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String day=sc.nextLine();
        String morning_time=" ";
        morning_time=switch(day){
            case  "Saturday","Sunday"->"6 a.m";
            default->"7 a.m";
        };
        System.out.println("Wakeup_time:" +morning_time);

    }

}