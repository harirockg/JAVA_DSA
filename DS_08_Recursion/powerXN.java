// package DS_08_Recursion;

public class powerXN {
    public static int power(int x, int n){
        //base case
        if(n==0 ){
            return 1;
        }

        // int xnm1=power(x, n-1);
        // int xn=x*xnm1;
        // return xn;

        //in short recursion
        return x*power(x, n-1);

    }

    //Optimized O(logn)
    public static int OptimizedPower(int a,int n){
        //base case
        if(n==0){
            return 1;
        }

        int halfPower=OptimizedPower(a, n/2) ;
        int halfPowerSq=halfPower*halfPower;

        //n is odd
        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {
        //System.out.println(power(2, 10));
        int a=2;
        int n=10;
        System.out.println(OptimizedPower(a, n));
    }
    
}
