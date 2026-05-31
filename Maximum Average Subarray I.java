class Solution {
    public double findMaxAverage(int[] nums, int k) {
     double sum=0;
     double max=Integer.MIN_VALUE;
     int size=nums.length;
     int j=0;
     int i=0; 
     while(j<size){
                 sum=sum+nums[j];

        if(j-i+1<k)
            j++;
        
      else  if(j-i+1==k){
            max=Math.max(max,sum);
            sum=sum-nums[i];
            i++;
            j++;
        }
     }
     return max/k;
    }
}
