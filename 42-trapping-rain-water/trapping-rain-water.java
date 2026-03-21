class Solution {
    public int trap(int[] height) {
     int n=height.length;
     int[] leftmost=new int[n];

     leftmost[0]=height[0];
     for(int i=1;i<height.length;i++) {
       leftmost[i]=Math.max(leftmost[i-1],height[i]);
     }   
     int[] rightmost=new int[n];
     rightmost[n-1]=height[n-1];
     for(int i=n-2;i>=0;i--){
        rightmost[i]=Math.max(rightmost[i+1],height[i]);
     }
     int ans=0;
     for(int i=0;i<n;i++){
        ans +=Math.min(leftmost[i],rightmost[i])-height[i];
     }
    return ans;
    }
}