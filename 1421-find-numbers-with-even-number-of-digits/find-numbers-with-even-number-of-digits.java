class Solution {
    public int findNumbers(int[] nums) {
        int count;
        int even=0;
        for(int i=0;i<nums.length;i++){
            count= String.valueOf(nums[i]).length();
            if (count%2==0){
                even++;
            }
        }
        return even;
        
    }
}