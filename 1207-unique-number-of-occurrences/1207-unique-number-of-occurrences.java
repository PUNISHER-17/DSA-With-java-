class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>freqmap=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int valu=arr[i];
            freqmap.put(valu,freqmap.getOrDefault(valu,0)+1);
        }
        HashSet<Integer>set=new HashSet<>();
        for(int val: freqmap.values()){
            if(set.contains(val)){
                return false;
            } else {
                set.add(val);
            }
        }
        return true;
        
    }
}