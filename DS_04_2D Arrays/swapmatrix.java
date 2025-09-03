public class swapmatrix {
    public static int[][] transpose(int matrix[][]){
        int[][] transpose=new int[matrix.length][matrix[0].length];

        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                transpose[i][j]=matrix[j][i];
                
            }
        }
        return transpose;
    }
    

    public static void main(String[] args) {
        int matrix[][]={{1,4,9},
                        {11,4,3},
                        {2,2,3}};
        
        //System.out.println(swap(matrix));
        int[][] result=transpose(matrix);

        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+" ");  
            }
            System.out.println();
        }

    }
    
}
