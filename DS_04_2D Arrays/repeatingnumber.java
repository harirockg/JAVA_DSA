public class repeatingnumber {
    public static int repeat(int matrix[][],int key){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(key==matrix[i][j]){
                    count++;
                }
            }
            
        }
        return count;

    }
    public static void main(String[] args) {
        int matrix[][]={{4,7,8},
                        {8,8,7}};
        int key=8;
        System.out.println(repeat(matrix, key));
    }
    
}
