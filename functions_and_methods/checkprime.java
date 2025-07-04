public class checkprime {
    /* 
    public static boolean isPrime(int n){
        if (n==2){
            return true;
        }
        boolean isPrime=true;// it should remove if there  is changes below 
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime=false;   // or only return false;
                break;  //or return isPrime;
            }
        }
        return isPrime;    // and here return true; is isprime line change to return false;
    }
    */

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    // to print prime in range 
    public static void PrimeinRange(int n){
        for(int i=2;i<=n;i++){
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //System.out.println(isPrime(7));
        //System.out.println(isPrime(2));
        PrimeinRange(20);
        PrimeinRange(100);
    }
    
}
