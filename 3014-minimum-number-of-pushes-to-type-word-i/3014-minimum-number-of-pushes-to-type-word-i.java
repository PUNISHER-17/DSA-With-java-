class Solution {
    public int minimumPushes(String word) {
        int result=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
        int ak=2;
        for(char ch:word.toCharArray()){
            if(ak>9){
                ak=2;
            }
            mp.put(ak,mp.getOrDefault(ak,0)+1);
            result+=mp.get(ak);
            ak++;
        }
      return result;   
    }
}