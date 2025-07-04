public class pattern0_1 {
    public static void Pattern_Zero_One(int n){
        for(int i=1;i<=n;i++){ // samjho i= no of line and j= no of number in one line
            for(int j=i;j>=1;j--){
                if(j%2!=0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
                //p++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Pattern_Zero_One(5);
    }
    
}
