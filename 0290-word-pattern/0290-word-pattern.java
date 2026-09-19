class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        int n=pattern.length();
        if(n!=words.length){
            return false;
        }
        HashMap<String,Character> mp= new HashMap<>();
        HashSet<Character> used= new HashSet<>();
        for(int i=0;i<n;i++){
            String word=words[i];
            char ch=pattern.charAt(i);
            if(!mp.containsKey(word) && !used.contains(ch)){
                used.add(ch);
                mp.put(word,ch);
            } else if(!mp.containsKey(word) || mp.get(word)!=ch){
                return false;
            }
        }
        return true;
    }
}