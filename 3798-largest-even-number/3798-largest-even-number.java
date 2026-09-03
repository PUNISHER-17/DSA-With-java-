class Solution {
    public String largestEven(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=sb.length()-1;i>=0;i--){
            int digit=sb.charAt(i)-'0';
            if(digit%2!=0 || digit==1){
                
                sb.deleteCharAt(i);
            } else {
                return sb.toString();
            }
        }
        return sb.toString();
    }
}