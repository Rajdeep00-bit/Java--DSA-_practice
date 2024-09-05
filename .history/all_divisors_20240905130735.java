public class all_divisors {
    public static void main(String[] args) {
        Scanner sc=new scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            if(i%n==0){
                System.out.println(i);
            }
        }
    }
}
