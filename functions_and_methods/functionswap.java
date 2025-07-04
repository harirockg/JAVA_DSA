//package functions_and_methods;

public class functionswap {
    public static void swap(int a,int b){ //parameters or formal parametrs  
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        
    }

    // for find product of a and b 
    public static int multiply(int a,int b){ //parameters or formal parametrs  
        int product=a*b;
        //System.out.println("product of "+a+ " and "+b+" = "+product);
        return product;
        
    }
        
    public static void main(String[] args) {
        //  swap - values exchange
        // int a=5;
        // int b= 10;
        //swap
        //swap(a,b);
        
        // System.out.println("a= "+a);   
        // System.out.println("b= "+b);  // agar ye yaha rahenge to same value print kar ke denge
        
        // for product 
        int a=3;
        int b= 5;
        //multiply(a,b);
        int prod=multiply(a,b);
        System.out.println("product of "+a+ " and "+b+" = "+prod);

        prod=multiply(10,20);
        System.out.println("a*b= "+prod);
    }
    
}

