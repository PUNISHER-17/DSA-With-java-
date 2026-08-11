class Solution {
    public int missingInteger(int[] nums) {
        int i=0;
        int sum=0;
        int dif=1;
        for(i=0;i<nums.length-1;i++){
           
            dif=nums[i+1]-nums[i];
            if(dif!=1)
            break;
        }
        for(int k=i;k>=0;k--) {
            sum=sum+nums[k];
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]==sum){
                sum++;
                j=0;
            }
        }
        return sum;
    }
}