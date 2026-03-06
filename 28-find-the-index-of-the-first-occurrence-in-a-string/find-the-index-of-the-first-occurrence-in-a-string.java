class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()){
           return 0; 
        }
        char[] arr = haystack.toCharArray();
        char[] arr1 = needle.toCharArray();

        for (int i = 0; i <= arr.length - arr1.length; i++) {  // <= instead of <
            int j = 0;
            while (j < arr1.length && arr[i + j] == arr1[j]) {
                j++;
            }
            if (j == arr1.length) {
                return i;
            }
        }
        return -1;
    }
}