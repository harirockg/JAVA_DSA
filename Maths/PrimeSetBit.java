import java.util.Scanner;

public class PrimeSetBit {

    // Precomputed prime flags for possible bit counts (0..32)
    private static final boolean[] isPrime = new boolean[33];
    static {
        // Sieve-like fill for small range
        for (int i = 0; i < isPrime.length; i++) isPrime[i] = true;
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i < isPrime.length; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            int bitCount = Integer.bitCount(i); // faster & cleaner
            if (isPrime[bitCount]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter left and right (space separated): ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input.");
            return;
        }
        int left = sc.nextInt();
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input.");
            return;
        }
        int right = sc.nextInt();
        if (left > right) {
            System.out.println("Left should be <= right.");
            return;
        }

        PrimeSetBit solver = new PrimeSetBit();
        int result = solver.countPrimeSetBits(left, right);
        System.out.println("Count of numbers in [" + left + ", " + right + "] with prime number of set bits: " + result);
    }
}
