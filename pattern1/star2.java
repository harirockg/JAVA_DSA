//package pattern1;
import java.util.Scanner;
 public class star2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the desired no to print * :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){ // samjho i= no of line and j= no of star in one line
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    

    
}
