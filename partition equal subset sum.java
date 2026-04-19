class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
 sum=nums[i]+sum;
        }
        int target=sum/2;
        boolean t[][]=new boolean[n+1][target+1];
        if(sum%2!=0){
            return false;
        }
        for(int i=0;i<n+1;i++){
                    t[i][0]=true;}
        for(int j=0;j<target;j++){
        t[0][j]=false;
        }
        for(int i=1;i<n+1;i++){
         for(int j=1;j<target+1;j++){
if(nums[i-1]<=j){
    t[i][j]=t[i-1][j-nums[i-1]] || t[i-1][j];

}
else{
    t[i][j]=t[i-1][j];
}
        }
    }
    return t[n][target];
}}
