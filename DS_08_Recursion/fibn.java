public class fibn {
    public static int fibn(int n){
        if(n==0||n==1){
            return n;
        }

        int fmn1=fibn(n-1);
        int fmn2=fibn(n-2);
        return fmn1+fmn2;
    }

    public static void main(String[] args) {
        int n=6;
        System.out.println(fibn(n));
    }
    
}
