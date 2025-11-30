// package DS_09_Recursion2;

public class friendsPairingProblem {

    public static int friendsPairing(int n){
        //base case
        if(n==1||n==2){
            return n;
        }

        // //single
        // int fmn1=friendsPairing(n-1);

        // //pair
        // int fmn2=friendsPairing(n-2);
        // int pairways=(n-1)*fmn2;

        // int totalways=fmn1+pairways;

        // return totalways;
        

        //or

        return friendsPairing(n-1)+ (n-1)*friendsPairing(n-2);
    }

    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
    
}
