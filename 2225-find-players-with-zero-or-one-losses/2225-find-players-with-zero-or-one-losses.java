class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer>lostmap= new HashMap<>();
        for(int i=0;i<matches.length;i++){
            int loser=matches[i][1];
            lostmap.put(loser,lostmap.getOrDefault(loser,0)+1);
        }
        List<Integer>notLost=new ArrayList<>();
        List<Integer>onceLost=new ArrayList<>();
        for(int i=0;i<matches.length;i++){
            int winner=matches[i][0];
            int loser=matches[i][1];
            if(!lostmap.containsKey(winner)){
                notLost.add(winner);
                lostmap.put(winner,2);
            }
            if(lostmap.get(loser)==1){
                onceLost.add(loser);
                lostmap.put(loser,2);
            }
        }
        Collections.sort(notLost);
        Collections.sort(onceLost);
        List<List<Integer>> result =new ArrayList<>();
        result.add(notLost);
        result.add(onceLost);
        return result;

        
    }
}