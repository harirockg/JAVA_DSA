//package pattern1;
public class star1 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){ // samjho i= no of line and j= no of star in one line
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
