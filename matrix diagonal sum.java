class Solution {
    public int diagonalSum(int[][] mat) {
        int rows=mat.length;
        int col=mat[0].length;
        int sum=0;
        for(int i=0;i<rows;i++){
            int j=i;
            sum=sum+mat[i][j];
            
        }
        int j=0;
        for(int i=rows-1;i>=0;i--){
            if(i!=j){
            sum=sum+mat[i][j];

                    }
                    j++;        }
        return sum;
    }
}
