class Solution {
    public int[] sortedSquares(int[] nums) {
    int n=nums.length;
    int right=0,left=n-1;
    int[] result=new int[n];
    for(int i=n-1;i>=0;i--){
        if(Math.abs(nums[right])>Math.abs(nums[left])){
            result[i]=nums[right]*nums[right];
            right++;
        }else{
            result[i]=nums[left]*nums[left];
            left--;
        }
    }
    return result;
    }
}