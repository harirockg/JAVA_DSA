//package pattern1;
import java.util.Scanner;
public class charsABCD {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the desired no to print * :");
        int n=4;
        char ch='A';
        for(int i=1;i<=n;i++){ // samjho i= no of line 
            for(int chars=1;chars<=i;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }   
}
