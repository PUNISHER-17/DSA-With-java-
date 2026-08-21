class Solution {
    public boolean isPerfectSquare(int x) {
        int left=0;
        int right=x;
        while(left<=right)
{
    int mid=left+(right-left)/2;
    long sqr=(long)mid*mid;
    if(sqr==x){
        return true;
    }else if(x<sqr){
        right=mid-1;
    }else
    {
       left=mid+1;
    }
}        
return false;
    }
}