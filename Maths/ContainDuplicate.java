import java.util.*;

public class ContainDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.contains(nums[i])) return true;
            map.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        ContainDuplicate obj = new ContainDuplicate();
        boolean result = obj.containsDuplicate(nums);

        if (result) {
            System.out.println("Contains duplicate elements");
        } else {
            System.out.println("No duplicates found");
        }
        
        sc.close();
    }
}

