class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        int count=0;
        Map<List<Integer>,Integer>mp=new HashMap<>();
        for(int row=0;row<n;row++){
            List<Integer>currentrow=new ArrayList<>();
            for(int col=0;col<n;col++){
                currentrow.add(grid[row][col]);
            }
            mp.put(currentrow,mp.getOrDefault(currentrow,0)+1);
        }
        for(int c=0;c<n;c++){
            List<Integer>temp=new ArrayList<>();
            for(int r=0;r<n;r++){
                temp.add(grid[r][c]);
            }
            count+=mp.getOrDefault(temp,0);
        }

        
      return count;  
    }
}