class Solution {
    public int findDuplicate(int[] nums) {
        int j,i;
        Arrays.sort(nums);
        for(i=0;i<nums.length;i++){
            j=i+1;
            if(nums[i]==nums[j]){
                return nums[i];
            }
        }
        return 0;
        
    }
}