class Solution {
    public String findRoot(String word,Set<String>st){
        for(int i=1;i<=word.length();i++){
            String root=word.substring(0,i);
            if(st.contains(root)){
                return root;
            }
        }
        return word;
    }
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String>st=new HashSet<>(dictionary);
        String[] words=sentence.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word:words){
            result.append(findRoot(word,st)).append(" ");
        }
        return result.toString().trim();
    }
}