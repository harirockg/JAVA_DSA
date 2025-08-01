import java.util.Scanner;

public class Rectangle {
    public int[] constructRectangle(int area) {
        int[] ans = new int[2];
        int diff = Integer.MAX_VALUE;
        int sqr = (int) Math.sqrt(area);

        for(int i = 1; i <= sqr; i++){
            if(area % i == 0){
                int a = i;
                int b = area / a;

                if(Math.abs(a - b) < diff){
                    diff = Math.abs(a - b);
                    ans[0] = Math.max(a, b);
                    ans[1] = Math.min(a, b);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter area: ");
        int area = sc.nextInt();

        Rectangle rect = new Rectangle();
        int[] result = rect.constructRectangle(area);

        System.out.println("Length = " + result[0] + ", Width = " + result[1]);
    }
}

