import java.util.*;
public class JavaPrime{
    // this is not for bigger numbe so that code is good
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();

        if (n==2){
            System.out.println("prime");
        }else{
            for(int i=2;i<=n-1;i++){
                if(n%i==0){
                    System.out.println("not Prime");
                    break;
                }else{
                    System.out.println("prime");
                    break;
                }
            }
        }
    }
}