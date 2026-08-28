class Solution {
    public int subtractProductAndSum(int num) {
        int pro=1;
        int sum=0;
        while(num>0){
        int r=num%10;
        pro=pro*r;
        sum=sum+r;
        num/=10;
        }
        return pro-sum;
        
    }
}