import java.util.*;
//package loops;

public class nfactorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
            //System.out.println("factorial of "+n+ "is : "+fact);
        }
        System.out.println("factorial of "+n+ " is : "+fact);
    }
    
}
