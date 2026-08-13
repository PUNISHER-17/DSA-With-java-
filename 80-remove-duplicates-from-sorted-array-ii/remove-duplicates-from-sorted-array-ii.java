class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            
            if(nums[i]==nums[i+1])
            count++;
            else if(nums[i]!=nums[i+1] && count==2)
            count=1;
            if(count>2){
                for(int in=i+1;in<n-1;in++){
                    nums[in]=nums[in+1];
                }
                n--;
                i=i-1;
                count--;
            }
        }
        return n;
        
    }
}