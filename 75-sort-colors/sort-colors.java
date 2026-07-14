class Solution {
    public void sortColors(int[] nums) {
      int n=nums.length;
        int i, j, temp;
        boolean swapped;
        for (i =0; i <n; i++) {
            swapped = false;
            for (j = n-1; j >= 1; j--) {
                if (nums[j] < nums[j - 1]) {

                    temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
        for(int index=0;index<n;index++){
          System.out.println(nums[index]);
        }  
    }
}