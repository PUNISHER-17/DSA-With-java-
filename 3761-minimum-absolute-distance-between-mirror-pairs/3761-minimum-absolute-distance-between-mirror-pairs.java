class Solution {
    public int rev(int n){
        int rev=0;
        while(n!=0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        return rev;
    }
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int mindis=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            
            if(mp.containsKey(nums[i]))
            mindis=Math.min(mindis,i-mp.get(nums[i]));
            mp.put(rev(nums[i]),i);
        }
        return mindis==Integer.MAX_VALUE?-1:mindis;
    }
}