class Solution {
    public int findNumbers(int[] nums) {
        int even=0;
        for(int num:nums){
        
            if ((num>=10 && num<=99)||(num>=1000 && num<=9999)||(num==100000)){
                even++;
            }
        }
        return even;
        
    }
}