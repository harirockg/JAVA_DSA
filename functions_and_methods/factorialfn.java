//package functions_and_methods;

public class factorialfn {
    public static int factorial(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
    public static int binCoeff(int n,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nmr_fact=factorial(n-r);
        int BC=n_fact/(r_fact*nmr_fact); // BC is Binomial Coefficient nCr
        return BC;
    }
    public static void main(String[] args) {
        //int n=4;
        //int fact=factorial(n);
        //System.out.println("factorial of "+n+ " is : "+fact);

        //simple way  and direct way easy tooo
        //System.out.println(factorial(5));
        //System.out.println(factorial(7));

        // for Binomial Coefficient nCr
        System.out.println(binCoeff(5,2));
        


    }

    

}
