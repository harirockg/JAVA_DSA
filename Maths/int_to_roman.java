import java.util.Scanner;

public class int_to_roman {
    public static String intToRoman(int num) {
        int[] nums  = {1000, 900, 500, 400, 100,  90,  50,  40,  10,   9,   5,  4, 1};
        String[] rom = {"M", "CM","D", "CD","C", "XC","L", "XL","X", "IX","V","IV","I"};
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            while (num >= nums[i]) {
                ans.append(rom[i]);
                num -= nums[i];
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer (1 to 3999): ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            sc.close();
            return;
        }
        int num = sc.nextInt();
        if (num < 1 || num > 3999) {
            System.out.println("Number out of range. Must be between 1 and 3999.");
        } else {
            String roman = intToRoman(num);
            System.out.println("Roman numeral: " + roman);
        }
        sc.close();
    }
}

