class Solution {
    public void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int colms=matrix[0].length;
        boolean row[]=new boolean[rows];
        boolean colm[]=new boolean[colms];

        for(int i=0;i<rows;i++){
            for(int j=0;j<colms;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    colm[j]=true;

                }
            }

        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<colms;j++){
                if(row[i] || colm[j]){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}
