import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bufferreader {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            System.out.println("Input a number:");
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            reader = new BufferedReader(inputStreamReader);
            int num = Integer.parseInt(reader.readLine());
            System.out.println("You entered: " + num);
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("An error occurred while closing the reader.");
                e.printStackTrace();
            }
        }
    }
}
