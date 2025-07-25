public class stairs {
    public int climbStairs(int n) {
        int f=1;
        int g=0;
        for(int i=0;i<n;i++){
            f=f+g;
            g=f-g;
        }
        return f;
        
    }
    public static void main(String[] args) {
        int n=2;
    }
}
