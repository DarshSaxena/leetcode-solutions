class Solution {
    public int findTargetSumWays(int[] nums, int target) {
      int n=nums.length;
      int sum=0;
      for(int i=0;i<n;i++){
        sum=sum+nums[i];
      }  
              if(sum < Math.abs(target)) return 0;

       if((sum+target)%2!=0){
        return 0;
      }
      int diff=(sum+target)/2;
      int t[][]=new int[n+1][diff+1];
     
for(int i=0;i<n+1;i++){
t[i][0]=1;}
for(int j=1;j<diff+1;j++){
t[0][j]=0;}
for(int i=1;i<n+1;i++){
for(int j=0;j<diff+1;j++){
if(nums[i-1]<=j){
t[i][j]=t[i-1][j-nums[i-1]] + t[i-1][j];
}
else{
t[i][j]=t[i-1][j];}
}}
return t[n][diff];}
    }
