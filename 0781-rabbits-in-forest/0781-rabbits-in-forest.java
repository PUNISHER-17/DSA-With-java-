class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int total=0;
        for(int x:answers){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
            int x=entry.getKey();
            int count=entry.getValue();
            int groupsize=x+1;
            int group=(int)Math.ceil((double)count/groupsize);
            total+=group*groupsize;
        }
        return total;
        
    }
}