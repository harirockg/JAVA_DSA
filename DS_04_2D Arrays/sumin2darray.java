public class sumin2darray {
    public static int sumofSecondRow(int matrix[][]){
        int sum=0;
        for(int i=1;i<=1;i++){
            for(int j=0;j<matrix[0].length;j++){
                sum+=matrix[i][j];
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        int matrix[][]={{1,4,9},
                        {11,4,3},
                        {2,2,3}};
        
        System.out.println(sumofSecondRow(matrix));
    }
    
}
