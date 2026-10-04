class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n=nums.length;
        int currsum=nums[0];
        int maxsum=nums[0];
        int mincurrsum=nums[0];
        int minsum=nums[0];
        for(int i=1;i<n;i++){
            currsum=Math.max(nums[i],nums[i]+currsum);
            maxsum=Math.max(currsum,maxsum);
            mincurrsum=Math.min(nums[i],nums[i]+mincurrsum);
            minsum=Math.min(minsum,mincurrsum);
        }        
       
        return Math.max(maxsum,Math.abs(minsum));
    }
}