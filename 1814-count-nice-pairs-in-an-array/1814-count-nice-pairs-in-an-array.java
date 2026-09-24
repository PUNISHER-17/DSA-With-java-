class Solution {
     public int rev(int n){
            int r=0;
            while(n!=0){
                int d=n%10;
                r=r*10+d;
                n/=10;
            }
            return r;
        }
    public int countNicePairs(int[] nums) { 
       
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]-rev(nums[i]);
        }
        long result=0;
        int MOD = 1000000007;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int num:nums){
            result=(result+mp.getOrDefault(num,0))%MOD;
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        return (int)result;
    }
}