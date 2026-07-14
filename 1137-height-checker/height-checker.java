class Solution {
    public int heightChecker(int[] heights) {
        int i,j,temp;
        int[] expected = heights.clone();

        // Bubble Sort
        int n = expected.length;
        boolean swapped;
        int count=0;
        for(i=0;i<n;i++){
          swapped=false;
            for(j=0;j<n-1;j++){
                if(expected[j] > expected[j+1]){
                temp = expected[j];
                expected[j] = expected[j+1];
                expected[j+1] = temp;
                swapped=true;
}
            }
            if (swapped == false)
                break;
        }
        for (int inx = 0; inx < n; inx++) {
            if (heights[inx] != expected[inx])
                count++;
        }
      return count;
    }
}