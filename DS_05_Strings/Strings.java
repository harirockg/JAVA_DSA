//package DS_05_Strings;
import java.util.*;
public class Strings {

    public static void printletter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
        
    }

    public static void main(String[] args) {
        // char arr[]={'a','b','c','d'};
        // String str="abcd";
        // String st1=new String("xyz");

        // Scanner sc=new Scanner(System.in);
        // String name;
        // name=sc.next();
        // String name=sc.next();
        // String name=sc.nextLine();
        // System.out.println(name);

        // String fullname="Tony Stark";
        // System.out.println(fullname.length());

        //concatenation

        String firstname="Harivansh";
        String lastname="Chauhan";
        String fullname=firstname+" "+lastname;
        // System.out.println(fullname);

        //charat
        // System.out.println(fullname.charAt(3));

        //
        // String str="abcd";
        //printletter(str);

        
        printletter(fullname);



    }
    
}
