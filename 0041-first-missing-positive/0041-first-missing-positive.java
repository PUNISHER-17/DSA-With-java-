class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int ones=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                ones=1;
            }
            if(nums[i]<=0 || nums[i]>n){
                nums[i]=1;
            }
        }
        if(ones==0) return 1;
        for(int i=0;i<n;i++){
            int num=Math.abs(nums[i]);
            int idx=num-1;
            if(nums[idx]<0) continue;
            nums[idx]*=-1;
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return n+1;
    }
}