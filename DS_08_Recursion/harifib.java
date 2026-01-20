public class harifib {
    public static int  fibo(int n){
        if (n==1||n==0){
            return n;
        }

        int f1=fibo(n-1);
        int f2=fibo(n-2);
        int f=f1+f2;
        return f;
    }

    public static void nto1(int n){
        if(n==1){
            System.out.println(n+" ");
            return;
        }
        nto1(n-1);
        System.out.println(n+" ");

    }


    public static int fact(int n){
        if (n==0){
            return 1;
        }
        // int fn=n*fact(n-1);
        // return fn;
        return n*fact(n-1);
    }

    public static int sumOfn(int n){
        if(n==1){
            return n;
        }
        return n+sumOfn(n-1);
    }

    public static void main(String args[]){
        int n=5;
        // int result=fibo(n);
        // System.out.println(result);
        // nto1(n);
        // System.out.println(nto(n)));
        // System.out.println(fact(n));
        System.out.println(sumOfn(n));
        
    }

    
}
