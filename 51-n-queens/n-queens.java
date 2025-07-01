class Solution {

    private boolean isSafe(int n,char[][] nqueen,int row,int col){
        for(int i = 0; i < n; i++){
            if (nqueen[i][col] =='Q'){
                return false;
            }
        }
        for(int i = row - 1, j = col - 1;i >= 0 && j >= 0; i--,j--){
            if (nqueen[i][j] =='Q'){
                return false;
            }
        }
        for(int i=row-1,j = col+1;i>=0 &&j <n;i--,j++){
            if (nqueen[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    private void Puzzle (int n,List<List<String>> output,char[][] nqueen,int row){
        if (row == n ){
            List<String> solution = new ArrayList<>();
            for (char[] rowArray : nqueen){
                solution.add(new String(rowArray));
            }
            output.add(solution);
            return;
        }
        for(int col = 0; col < n; col++){
            if (isSafe(n,nqueen,row,col)){
                nqueen[row][col] = 'Q';
                Puzzle(n,output,nqueen,row +1);
                nqueen[row][col] ='.';
            }
        }
    } 
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> output = new ArrayList<>();
        char[][] nqueen = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(nqueen[i],'.');
        }
        Puzzle(n,output,nqueen,0);
        return output;
    }
}