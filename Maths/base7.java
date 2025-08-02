import java.util.*;

class base7 {
    public String convertToBase7(int num) {
        if (num < 0)
            return "-" + convertToBase7(-num);
        if (num < 7)
            return String.valueOf(num);
        return convertToBase7(num / 7) + String.valueOf(num % 7);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        base7 obj = new base7();
        String result = obj.convertToBase7(num);
        
        System.out.println("Base 7: " + result);
    }
}
