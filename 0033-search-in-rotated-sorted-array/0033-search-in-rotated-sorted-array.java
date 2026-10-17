class Solution {
    public int findPivot(int[] nums,int n){
        int low=0;
        int high=n-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[high]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return  low;
    }
    public int binarySearch(int l,int r,int[] nums,int target){
        int idx=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                idx=mid;
                break;
            }else if(nums[mid]>target){
                r=mid-1;
            }else
            l=mid+1;
        }
return idx;
    }
    public int search(int[] nums, int target) {
        int n=nums.length;
        int pivot_index=findPivot(nums,n);
        int idx=binarySearch(0,pivot_index-1,nums,target);
        if(idx!=-1){
            return idx;
        }
        return idx=binarySearch(pivot_index,n-1,nums,target);
        
        
    }
}