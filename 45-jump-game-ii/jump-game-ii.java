class Solution {
    public int jump(int[] nums) {
       int jum=0;
       int end=0;
       int f=0;
       for(int i=0;i<nums.length-1;i++){
        f=Math.max(f,i+nums[i]);
        if(i==end){
            jum++;
            end=f;
        }
       }
       return  jum;
    }
}