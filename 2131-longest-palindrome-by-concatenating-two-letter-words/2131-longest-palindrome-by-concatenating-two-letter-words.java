class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer>mp=new HashMap<>();
        int result=0;
        for(String word:words){
            String revword=""+word.charAt(1)+word.charAt(0);
            if(mp.getOrDefault(revword,0)>0){
                result+=4;
                mp.put(revword,mp.getOrDefault(revword,0)-1);
            } else {
                mp.put(word,mp.getOrDefault(word,0)+1);
            }
        }
        for(Map.Entry<String, Integer>entry:mp.entrySet()){
            String word=entry.getKey();
            int count=entry.getValue();
            if(word.charAt(0)==word.charAt(1)&&count>0){
                result+=2;
                break;
            }
        }
        return result;
    }
}