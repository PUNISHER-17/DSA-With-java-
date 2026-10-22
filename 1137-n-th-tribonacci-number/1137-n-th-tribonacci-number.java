class Solution {
    public int tribonacci(int n) {
        int t0=0,t1=1,t2=1;
        if(n==0)return t0;
        if(n==1)return t1;
        if(n==2)return t2;
       int  loopvalue=n-2;
        int sum=0;
        while(loopvalue>0){
            sum=t0+t1+t2;
            t0=t1;
            t1=t2;
            t2=sum;
            loopvalue--;
        }
        return sum;
    }
}