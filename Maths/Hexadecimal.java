import java.util.Scanner;

public class Hexadecimal {
    public String toHex(int num) {
        StringBuilder sb = new StringBuilder();
        int runer = 32;
        if (num == 0) return "0";

        while (runer != 0 && num != 0) {
            int res = num & 15; // get last 4 bits
            if (res > 9) {
                sb.append((char) (res - 10 + 'a')); // 'a' = 97 in ASCII
            } else {
                sb.append(res);
            }
            num = num >>> 4; // unsigned right shift
            runer -= 4;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        Hexadecimal hex = new Hexadecimal();
        System.out.println("Hexadecimal: " + hex.toHex(num));
        sc.close();
    }
}
