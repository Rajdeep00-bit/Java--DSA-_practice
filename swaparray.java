import java.util.*;

class Swap {
    public static void swap(int arr[], int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    // Method to reverse the entire array
    public static void reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}

public class swaparray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Print the array before reversal
        System.out.println("Array before reversal:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Reverse the entire array
        Swap.reverseArray(arr);

        // Print the array after reversal
        System.out.println("Array after reversal:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
