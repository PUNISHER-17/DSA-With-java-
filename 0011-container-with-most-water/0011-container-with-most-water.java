class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int max=0,min,distance,area;
        while(i<j){
            min=Math.min(height[i],height[j]);
            distance=j-i;
            area=distance*min;
            max=Math.max(max,area);
            if(height[i]<=height[j]){
                i++;
            }else{
                j--;
            }   
        }
        return max;
    }
}