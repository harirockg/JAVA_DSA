import java.util.*;
//package loops;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int even=0,odd=0;
        for( int i=1;i<=n;i++){
            System.out.print(" enter the numbers: ");
            int x=sc.nextInt();
            if(x%2==0){
                even+=x;
            }else{
                odd+=x;
            }
        }
        System.out.println("sum of even is :"+even);
        System.out.println("sum of odd is :"+odd);
    }

    
}
