// package DS_08_Recursion;

public class fibonacci {
    public static int fibonacci(int n){
        // if(n==0){
        //     return 0;
        // }else if(n==1){
        //     return 1;
        // }
        
        if(n==0 || n==1){
            return n;
        }

        int fbnm1=fibonacci(n-1);
        int fbnm2=fibonacci(n-2);
        int fb=fbnm1+fbnm2;
        return fb;
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(fibonacci(n));
    }
    
}
