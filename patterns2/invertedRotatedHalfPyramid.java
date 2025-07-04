public class invertedRotatedHalfPyramid {
    public static void invertedRotatedHalfPyramid(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){ // for spaces
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){  // for *
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
    public static void Inverted_Half_Pyramid_Numbers(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i+1);j++){
                System.out.print(j);
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        //invertedRotatedHalfPyramid(7);
        Inverted_Half_Pyramid_Numbers(5);
    }
    
}
