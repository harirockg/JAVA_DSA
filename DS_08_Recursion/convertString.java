public class convertString {
    
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    
    public static void convert(int n){

        // System.out.println(n);

        if(n==0){
            return;
        }
        
        int lastDigit=n%10;
        convert(n/10);
        System.out.print(digits[lastDigit]+" ");
        
        
    }
    public static void main(String[] args) {
        int n=291;

        // Remove leading zeros
        

        convert(n);
    }
    
}
