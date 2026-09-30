class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        List<Integer> result=new ArrayList<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
            if(mp.get(num)>nums.length/3){
                if(!result.contains(num)){
                    result.add(num);
                }
            }
        }
        Collections.sort(result);
        return result;
    }
}