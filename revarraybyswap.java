import java.util.*;

class swap{
    public static void swap(int arr[],int i1,int i2){
        int temp=arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=temp;
    }
    public static void reverse(int arr[]){
        int start=0;
        int end=arr.length-1;
        if(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
public class revarraybyswap {
    public static void main(String[] args) {

        int arr[]={23,43,55,45,12,11,43,56};

        swap.reverse(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
