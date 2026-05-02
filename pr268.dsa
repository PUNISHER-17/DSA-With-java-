class Solution {
    public int missingNumber(int[] nums) {
        int b[]=new int[nums.length+1];
        Arrays.fill(b,-1);
        for(int i=0; i<nums.length;i++){
            b[nums[i]]=nums[i];
        }
        for(int i=0; i<b.length;i++){
            if(b[i]==-1)
            return i;
        }
        return 0;

    }
    }