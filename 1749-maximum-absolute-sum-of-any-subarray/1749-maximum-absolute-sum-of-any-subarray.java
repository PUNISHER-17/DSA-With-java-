class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n=nums.length;
        int currsum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<n;i++){
            currsum=Math.max(nums[i],nums[i]+currsum);
            maxsum=Math.max(currsum,maxsum);
        }        
        int minsum=nums[0];
        currsum=nums[0];
        for(int i=1;i<n;i++){
            currsum=Math.min(nums[i],nums[i]+currsum);
            minsum=Math.min(minsum,currsum);
        }
        return Math.max(maxsum,Math.abs(minsum));
    }
}