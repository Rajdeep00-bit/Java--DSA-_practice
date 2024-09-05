import java.util.*;
class rom implements Runnable{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("RAjdeep");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();

            }
        }
    }
    static  class romd implements Runnable{
        public void run(){
            for(int i=0;i<100;i++){
                System.out.println("Saha");
                try{
                    Thread.sleep(10);
                }catch(InterruptedException e){
                    e.printStackTrace();

                }
            }
        }
    }
}
public class run {
    public static void main(String[] args) {
        Runnable obj1=new rom();
        Runnable obj2=new rom.romd();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
    }

}
