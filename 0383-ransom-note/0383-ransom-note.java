class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>ransom=new HashMap<>();
        HashMap<Character,Integer>magazin=new HashMap<>();
        for(char ch:ransomNote.toCharArray()){
            ransom.put(ch,ransom.getOrDefault(ch,0)+1);
        }
        for(char ch:magazine.toCharArray()){
            magazin.put(ch,magazin.getOrDefault(ch,0)+1);
        }
        for(char key:ransom.keySet()){
            if(ransom.get(key)>magazin.getOrDefault(key,0)) return false;
        }

     return true;   
    }
}