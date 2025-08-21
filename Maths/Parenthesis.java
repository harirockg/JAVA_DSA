import java.util.*;

class Parenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()) {
            if (x == '(') {
                stack.push(')');
            } else if (x == '{') {
                stack.push('}');
            } else if (x == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != x) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter parentheses string: ");
        String input = sc.nextLine();

        Parenthesis obj = new Parenthesis();
        if (obj.isValid(input)) {
            System.out.println("Valid Parentheses");
        } else {
            System.out.println("Invalid Parentheses");
        }
    }
}

