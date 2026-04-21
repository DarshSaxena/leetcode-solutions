class Solution {
    public int longestPalindromeSubseq(String s) {
         int n=s.length();
        String rev="";
        for(int i=n-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        int m=rev.length();
        int t[][]=new int[n+1][m+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s.charAt(i-1)==rev.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                
                }
                else{
                    t[i][j]=Math.max(t[i][j-1],t[i-1][j]);
                }
            }
        }
        return t[n][m];
    }
}
