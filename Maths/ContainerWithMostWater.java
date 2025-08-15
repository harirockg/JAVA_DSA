import java.util.*;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int area = (right - left) * Math.min(height[left], height[right]);
            if (area > max) {
                max = area;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        int[] height = new int[n];
        System.out.println("Enter the heights:");
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        
        ContainerWithMostWater obj = new ContainerWithMostWater();
        int result = obj.maxArea(height);
        
        System.out.println("Maximum water area: " + result);
        
        sc.close();
    }
}
