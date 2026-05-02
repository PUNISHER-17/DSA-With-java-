class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int a=0;
        
        for(int i=0;i<operations.length;i++){
        
           String s=operations[i];
            if(s.charAt(1)=='+'){
                a++;

            }else{
                a--;

            }
        }
        return a;
    }
}