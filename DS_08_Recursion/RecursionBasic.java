// package DS_08_Recursion;

public class RecursionBasic {

    // print numbers from n to 1 decreasing order
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    // print numbers from 1 to n increasing order
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
        
    }

    // factorial of n
    public static int fact(int n){

         if(n==0){
            return 1; 
         }

        int fnm1=fact(n-1);    //fnm1=f(n-1)
        int fn=n*fact(n-1);
        return fn;
    }


    // print sum of first n natural numbers
    public static int sumOfn(int n){
        if(n==1){
            return 1;
        }
        int snm1=sumOfn(n-1);
        int sn=n+snm1;
        return sn;
    }


    
    public static void main(String[] args) {
        int n=5;
        // printDec(n);
        // printInc(n);

        // int h=fact(n);
        // System.out.println(h);
        System.out.println(sumOfn(n));


    }
}
