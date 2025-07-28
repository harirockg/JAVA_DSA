import java.util.*;
class Solution {
    public boolean canWinNim(int n) {
        if(n%4==0)
        {
            return false;
        }
        return true;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        Solution sol = new Solution();
        boolean result = sol.canWinNim(n);
        System.out.println(result);
    }
}
