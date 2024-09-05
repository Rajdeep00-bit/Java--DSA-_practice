import java.util.*;
class raj extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Rajdeep");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();

            }
        }
    }
}
class saha extends Thread{
    public void run(){
        for (int i=0;i<100;i++){
            System.out.println("Saha");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();

            }
        }
    }
}
public class demothreads {
    public static void main(String[] args) {
        raj obj=new raj();
        saha obj2 =new saha();
        obj.start();
        try{
            Thread.sleep(10);
        }catch(InterruptedException e){
            e.printStackTrace();

        }

        obj2.start();

    }
}
