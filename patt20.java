public class patt20 {
    public static void main(String[] args) {
        int n=5;
        int space=0;
        for(int i=0;i<n;i++){
           
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for(int k=0;k<space;k++){
                System.out.print(" ");

            }
            for(int l=0;l<n-i;l++){
                System.out.print("*");
            }
            space+=2;
            System.out.println();
        }
        int space2 =8;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int k=0;k<space2;k++){
                System.out.print(" ");
            }
            for(int l=0;l<i;l++){
                System.out.print("*");
            }
            space2 -=2;
            System.out.println();
        }
    }    
}
