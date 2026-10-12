class Solution {
    public String replaceVowels(String word){
        return word.replaceAll("[aeiou]","*");
    }
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String>exact=new HashSet<>();
        Map<String,String>casemap=new HashMap<>();
        Map<String,String>vowelmap=new HashMap<>();
        for(String word:wordlist){
            exact.add(word);
            String lower=word.toLowerCase();
            casemap.putIfAbsent(lower,word);
            String vowel=replaceVowels(lower);
            vowelmap.putIfAbsent(vowel,word);
        }
        String[] ans=new String[queries.length];
        for(int i=0;i<queries.length;i++){
            String query=queries[i];
            if(exact.contains(query)){
                ans[i]=query;
            } else if(casemap.containsKey(query.toLowerCase())){
                ans[i]=casemap.get(query.toLowerCase());
            }else{
                String vowel=replaceVowels(query.toLowerCase());
                if(vowelmap.containsKey(vowel)){
                    ans[i]=vowelmap.get(vowel);
                }else{
                    ans[i]="";
                }
            }
        }
        return ans;
    }
}