public class SudokuLeetcode {

    public static boolean isSafe(char board[][], int row, int col, char digit,int n){
        //column
        for(int i=0; i<=n-1; i++){
            if(board[i][col] == digit){
                return false;
            }
        }

        // row
        for(int j=0; j<=n-1; j++){
            if(board[row][j] == digit){
                return false;
            }
        }

        //grid
        int sr=(row/3)*3;  // starting row
        int sc=(col/3)*3;  //starting col

        //3*3 grid small one
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j] ==  digit){
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokuSolver(char board[][], int row, int col,int n){
        // base case
        if(row == n ){ //&& col == 0
            return true;
        }

        //recursion
        int nextRow=row, nextCol=col+1;
        if(col+1 == n){
            nextRow=row+1;
            nextCol=0;
        }

        if(board[row][col] != '.'){
            return sudokuSolver(board, nextRow, nextCol,n);
        }

        for(char digit='1'; digit<='9'; digit++){
            if(isSafe(board,row,col,digit,n)){
                board[row][col]=digit;
                if(sudokuSolver(board, nextRow, nextCol,n)){  //soln exists
                    return true;
                }
                board[row][col]='.';
            }
        }

        return false;

    }

    // public static void printSudoku(char board[][],int n){
        
    //     for(int i=0; i<n; i++){
    //         System.out.println("[");
    //         for(int j=0; j<n; j++){
    //             System.out.print('"'+board[i][j]+'"');
    //             if(j<n-1){
    //                 System.out.print(",");
    //             }
    //         }
    //         System.out.println("]");
    //         if(i<n-1){
    //             System.out.println(",");
    //         }
    //         //System.out.println();
    //     }
    // }

    public void solveSudoku(char[][] board) {
        int n=board.length;
        //System.out.println("[");
        if(sudokuSolver(board, 0, 0, n)){
            //System.out.println("Solution exist");
            //printSudoku(board,n);
        }
        //System.out.println("]");
    }
}