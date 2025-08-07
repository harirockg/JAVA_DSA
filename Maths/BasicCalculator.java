import java.util.*;

public class BasicCalculator {
    public int calculate(String s) {
        Stack<Integer> stk = new Stack<>();
        int num = 0;
        int result = 0;
        int sign = 1;
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = (num * 10) + (c - '0');
            } else if (c == '+') {
                result += (sign * num);
                num = 0;
                sign = 1;
            } else if (c == '-') {
                result += (sign * num);
                num = 0;
                sign = -1;
            } else if (c == '(') {
                stk.push(result);
                stk.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += (sign * num);
                num = 0;
                result *= stk.pop(); // pop sign
                result += stk.pop(); // pop result
            }
        }
        result += sign * num;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the expression: ");
        String s = sc.nextLine();

        BasicCalculator calc = new BasicCalculator();
        int result = calc.calculate(s);
        System.out.println("Result: " + result);
    }
}

