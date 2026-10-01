class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n=nums.size();
       int maj=-1;
       int count=0;
       for(int i=0;i<n;i++){
        if(count==0){
            maj=nums.get(i);
            count=1;
        }else if(nums.get(i)==maj){
            count++;
        }else{
            count--;
        }
       }
       int majcount=0;
       for(int num:nums){
        if(num==maj){
            majcount++;
        }
       }
       count=0;
       for(int i=0;i<n;i++){
        if(nums.get(i)==maj){
            count++;
        }
        int ream=majcount-count;
        int n1=i+1;
        int n2=n-i-1;
        if(count*2>n1 && ream*2>n2){
            return i;
        }
       }
       return -1;
    }
}