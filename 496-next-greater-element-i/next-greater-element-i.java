class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    //    int[] result=new int[nums1.length];
    //    for(int i=0;i<nums1.length;i++){
    //     int next=-1;
    //      for(int j=0;j<nums2.length;j++){
    //         if(nums1[i]==nums2[j]){
    //             for(int k=j+1;k<nums2.length;k++){
    //                     if(nums2[k] > nums1[i]) {
    //                         next = nums2[k];
    //                         break;
    //                     }
    //             }
    //             break;
    //         }
    //      }
    //       result[i]=next;
    //    }
    //    return result;

   Stack<Integer> s = new Stack<>();
    HashMap<Integer,Integer>map=new HashMap<>();
     int[] result = new int[nums1.length];
     for(int i=0;i<nums2.length;i++){
        while(!s.isEmpty() && nums2[i] > s.peek()){
            map.put((s.peek()),nums2[i]);
            s.pop();
        }
      s.push(nums2[i]);
     } 
      while(!s.isEmpty()){
         map.put((s.peek()),-1);
          s.pop();
      }
      for(int i=0;i<nums1.length;i++){
       result[i] = map.get(nums1[i]);
      }
     return result;
        }
}