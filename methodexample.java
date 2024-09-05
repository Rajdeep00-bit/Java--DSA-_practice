import java.util.*;

class buying{
    public String buying(int cost){
        if(cost>=15){
            return "Buying done";
        }else{
            return"paisa lao";
        }
    }
}
public class methodexample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        buying b1=new buying();

        String str= b1.buying(sc.nextInt());
        System.out.println(str);
    }

}
