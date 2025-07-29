import java.util.Scanner;

class PerfectSquire {
    public boolean isPerfectSquare(int num) {
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        PerfectSquire sol = new PerfectSquire();
        boolean result = sol.isPerfectSquare(num);
        System.out.println("Is perfect square? " + result);
    }
}

