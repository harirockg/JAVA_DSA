import java.util.*;
public class CheckPalindrome {
    public static boolean isPalindrome(int n){
        int rev=0;
        int y=n;
        while(n>=0){
            int lastdigit=n%10;
            rev=rev*10+lastdigit;
            n=n/10;
            
        }
        if(rev==y){
            System.out.println("palindrome");
            return true;
        }else{
            System.out.println("not palindrome");
            return false;
        }
        //return  String;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        isPalindrome(n);
        
    }

    
    
}
