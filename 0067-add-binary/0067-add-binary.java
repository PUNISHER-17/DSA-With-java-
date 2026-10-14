class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        int m=s1.length()-1;
        int n=s2.length()-1;
        StringBuilder result=new StringBuilder();
        int sum=0;
        int carry=0;
        while(m>=0 || n>=0){
            sum=carry;
            if(m>=0){
                sum+=s1.charAt(m)-'0';
                m--;
            }
            if(n>=0){
                sum+=s2.charAt(n)-'0';
                n--;
            }
            result.append((sum%2==0)?'0':'1');
            carry=sum/2;
        }
        if(carry==1){
            result.append('1');
        }
        result.reverse();
        while(result.length()>1 && result.charAt(0)=='0'){
            result.deleteCharAt(0);
        }
        return result.toString();
    }
}