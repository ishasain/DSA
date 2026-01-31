class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int actualsum=(n*(n+1))/2;
        int cursum=0;
        for(int i=0;i<nums.length;i++){
            cursum +=nums[i];
        }
        int ans =actualsum-cursum;
        return ans;
    }
}