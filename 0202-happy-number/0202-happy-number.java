class Solution {
    public boolean isHappy(int n) {
        Set<Integer> notHappy = new HashSet<>();
        while(true){
            int sum=0;
            while(n!=0){ 
                int r=(n%10);
                sum+=r*r;
                n=n/10;
            }
            if(sum==1) return true;
            n=sum;
            if(notHappy.contains(n))
            return false;
            notHappy.add(n);
        }
        
    }
}