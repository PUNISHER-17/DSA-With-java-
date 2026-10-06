class Solution {
    public int minimum(int[] nums){
        int sum=nums[0];
        int minsum=nums[0];
        for(int i=1;i<nums.length;i++){
            sum=Math.min(sum+nums[i],nums[i]);
            minsum=Math.min(minsum,sum);
        }
        return minsum;
    }
    public int maximum(int[] nums){
        int sum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            sum=Math.max(sum+nums[i],nums[i]);
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
    }
    public int maxSubarraySumCircular(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        int minsum=minimum(nums);
        int maxsum=maximum(nums);
        int circularsum=sum-minsum;
        if(maxsum>0)return Math.max(maxsum,circularsum);
        return maxsum;
        
    }
}