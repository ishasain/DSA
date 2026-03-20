class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int maxfreq=0;
        int count=0;
        for(int i:nums){
         int freq=map.getOrDefault(i,0)+1;
          map.put(i, freq);
         if(freq>maxfreq){
            maxfreq=freq;
            count=freq;

         }
         else if(freq==maxfreq){
         count=count+freq;
         }
        }
        return count;
     }
}