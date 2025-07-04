//package pattern1;
import java.util.Scanner;
public class halfpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the desired no to print * :");
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++){ // samjho i= no of line and j= no of number in one line
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("ulta of upper pyramid");
        for(int i=1;i<=n;i++){ // samjho i= no of line and j= no of number in one line
            for(int j=1;j<=(n-i+1);j++){
                System.out.print(j);
            }
            System.out.println();
        }


        System.out.println("change in number updated");
        int p=1;
        for(int i=1;i<=n;i++){ // samjho i= no of line and j= no of number in one line
            for(int j=1;j<=i;j++){
                System.out.print(p);
                p++;
            }
            System.out.println();
        }

        System.out.println("ulta of upper pyramid");
        int q=1;
        for(int i=1;i<=n;i++){ // samjho i= no of line and j= no of number in one line
            for(int H=1;j<=(n-i+1);j++){
                System.out.print(q);
                q++;
            }
            System.out.println();
        }
        
    }
    
}
