class Solution {
    public int[] leftRightDifference(int[] nums) {
 int leftsum[]=new int[nums.length];
 int rightsum[]=new int[nums.length];  
 int result[]=new int[nums.length];
 int lsum=0;
 int rsum=0;
 int k=0;
 int l=nums.length;
 int diff=0;
      if(nums.length<=1){
        return result;
      }
      for(int i=0;i<nums.length;i++){
leftsum[i]=lsum;
        lsum=lsum+nums[i];
        ;
      }
      for(int i=nums.length-1;i>=0;i--){
         rightsum[i]=rsum;
        rsum=rsum+nums[i];
        }

        for(int j=0;j<nums.length;j++){
result[j]=Math.abs(leftsum[j]-rightsum[j]);
        }
        return result;}
            }
