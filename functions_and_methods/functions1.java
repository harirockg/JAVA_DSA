import java.util.*;
public class functions1 {
    public static void printHW(){
        System.out.println("HW");
        System.out.println("Helloworld");
        System.out.println("Haribhai");
        return; // jaruri hai yha to void khuch return nhi kar rha but aur sab karnege like int to likhnna padega
    }

    // yoha void ki jagah int 
    public static int calculateSum(int num1,int num2){ //parameters or formal parametrs  
        //(int a, int b) ye bhi ho sakta hai 
        //yaha parameter laga hai  jo main fn ke liye use honge
        // int sum=a+b;
        int sum=num1+num2;
        //System.out.println("sum is: "+sum);
        return sum;
    }

    public static void main(String[] args) {  
        //printHW(); // function ko call kar rha hai
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a:");
        int a=sc.nextInt();
        System.out.println("enter b:");
        int b=sc.nextInt();
        ///calculateSum(a,b); // a and b pass karwane ke liye dalna padega taki ye uper funcion mein call hote time num1 and num 2 ki jagah le le 
        int sum=calculateSum(a,b);// arguements or actual parameters
        System.out.println("sum is: "+sum);
    }
    
}
