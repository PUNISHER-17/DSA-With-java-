class Solution {
    int m=1000000007;
    public int lengthAfterTransformations(String s, int t) {
        int[] mp=new int[26];
        for(char ch: s.toCharArray()){
            mp[ch-'a']++;
        }
        for(int count=1;count<=t;count++){
            int[] temp=new int[26];
            for(int i=0;i<26;i++){
                char ch=(char)(i+'a');
                int freq=mp[i];
                if(ch!='z'){
                    temp[(ch+1)-'a']=(temp[(ch+1)-'a']+freq)%m;
                }else{
                    temp['a'-'a']=(temp['a'-'a']+freq)%m;
                    temp['b'-'a']=(temp['b'-'a']+freq)%m;
                }
            }
            mp=temp;
        }
        int result=0;
        for(int i=0;i<26;i++){
            result=(result+mp[i])%m;
        }
        return result;
    }
}