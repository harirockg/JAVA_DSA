import java.util.Scanner;

public class RangeAddition {
    public int maxCount(int m, int n, int[][] ops) {
        int min1 = m;
        int min2 = n;

        for (int i = 0; i < ops.length; i++) {
            min1 = Math.min(ops[i][0], min1);
            min2 = Math.min(ops[i][1], min2);
        }

        return min1 * min2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter m: ");
        int m = sc.nextInt();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter number of operations: ");
        int k = sc.nextInt();

        int[][] ops = new int[k][2];
        System.out.println("Enter operations (each with two integers):");
        for (int i = 0; i < k; i++) {
            ops[i][0] = sc.nextInt();
            ops[i][1] = sc.nextInt();
        }

        RangeAddition obj = new RangeAddition();
        int result = obj.maxCount(m, n, ops);
        System.out.println("Maximum count of integers: " + result);
    }
}
