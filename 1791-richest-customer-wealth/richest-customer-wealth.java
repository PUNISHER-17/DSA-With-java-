class Solution {
    public int maximumWealth(int[][] account) {
        
        int presum=0;
        for(int i=0;i<account.length;i++){
            int sum=0;
            for(int j=0;j<account[i].length;j++){
                sum=sum+account[i][j];
            }
            if(presum<sum)
            presum=sum;
        }
        return presum;
        
    }
}