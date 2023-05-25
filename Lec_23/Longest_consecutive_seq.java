class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        int ans=0;
        for(int i:nums){
            if(map.containsKey(i-1)){
                map.put(i,false);
            }
            else{
                map.put(i,true);
            }
            if(map.containsKey(i+1)){
                map.put(i+1,false);
            }
        }
        for(Integer i:map.keySet()){
            if(map.get(i)==true){
                int count=0;
                while(map.containsKey(i)){
                    count++;
                    i++;
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}
