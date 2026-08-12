class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> result =new HashSet<>();
        HashSet<Integer> set1= new HashSet<>();
        for(int n : nums1){
            set1.add(n);
        }
        for(int n2 : nums2){
        if(set1.contains(n2))
        result.add(n2);
        }
        int[] ans =new int[result.size()];
        int i=0;
        for(int n3:result){
            ans[i++]=n3;
        }
        return ans;
    }
}