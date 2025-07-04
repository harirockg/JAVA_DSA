//package pattern1;

import java.util.Scanner;
public class floydpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the desired no to print the floyd's triangle * :");
        int n=sc.nextInt();
        int p=1;
        for(int i=1;i<=n;i++){ // samjho i= no of line and j= no of number in one line
            for(int j=1;j<=i;j++){
                System.out.print(p+"  ");
                p++;
            }
            System.out.println();
        }
    }
}
