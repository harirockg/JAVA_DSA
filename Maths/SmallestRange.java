import java.util.Scanner;

public class SmallestRange {
    public int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        
        int diff = max - min;
        int reduced = diff - 2 * k;
        
        return Math.max(0, reduced);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        SmallestRange sr = new SmallestRange();
        int result = sr.smallestRangeI(nums, k);

        System.out.println("Smallest possible range: " + result);
    }
}

