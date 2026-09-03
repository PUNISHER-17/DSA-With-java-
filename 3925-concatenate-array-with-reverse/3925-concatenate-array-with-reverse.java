class Solution {
    public int[] concatWithReverse(int[] nums) { 
        int[] num=new int[(nums.length*2)];
        for(int i=0;i<nums.length;i++){
            num[i]=nums[i];
        }
        int j=0;
        for(int i=nums.length;i<num.length;i++){
            j++;
            num[i]=num[i-j];
            j++;

        }
        return num;
    }
}