public class Butterfly {
    // public static void Butterfly_mine_bad(int n,int m){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*"); // for left side  up *
    //         }
    //         for(int k=i+1;k<=(m-i*2)+i;k++){
    //             System.out.print(" ");  // for middle up space 
    //         }
    //         for(int l=(m-i*2)+i+1;l<=m;l++){
    //             System.out.print("*");   // for right side up *
    //         }
    //         System.out.println();
    //     }
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=((n-i)+1);j++){
    //             System.out.print("*");  // for left side down *
    //         }
    //         for(int k=(n-i)+2;k<=n+i-1;k++){
    //             System.out.print(" ");   // for middle down Space 
    //         }
    //         for(int l=n+i;l<=m;l++){
    //             System.out.print("*");  // for right side down *
    //         }
    //         System.out.println();
    //     }
    // }
    public static void Butterfly(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        //Butterfly_mine_bad(4, 8);
        Butterfly(4);
    }
    
}
