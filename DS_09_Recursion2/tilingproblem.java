// package DS_09_Recursion2;

public class tilingproblem {
    public static int tilingproblem(int n){   // 2 X n (floor size)
        //base case
        if(n==0||n==1){
            return 1;
        }
        //for vertical
        int fnm1=tilingproblem(n-1);
        //for horizontal
        int fnm2=tilingproblem(n-2);

        int totalways=fnm1+fnm2;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(tilingproblem(4));
        
    }

    
}
