import java.util.*;

public class InserPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (right >= left) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }

        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Input array elements (sorted array required for binary search)
        System.out.println("Enter elements of the array in sorted order:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target value
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        // Call method
        InserPosition obj = new InserPosition();
        int result = obj.searchInsert(nums, target);

        // Output
        System.out.println("Insert position: " + result);

        sc.close();
    }
}
