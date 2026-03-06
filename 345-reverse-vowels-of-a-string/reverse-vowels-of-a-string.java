class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int slow=0;
        int fast=arr.length-1;
        while(slow<fast){
            while (slow < fast && 
                  arr[slow] != 'a' && arr[slow] != 'e' && arr[slow] != 'i' && 
                  arr[slow] != 'o' && arr[slow] != 'u' && 
                  arr[slow] != 'A' && arr[slow] != 'E' && arr[slow] != 'I' && 
                  arr[slow] != 'O' && arr[slow] != 'U') {
                slow++;
            }
           while (slow < fast && 
                  arr[fast] != 'a' && arr[fast] != 'e' && arr[fast] != 'i' && 
                  arr[fast] != 'o' && arr[fast] != 'u' && 
                  arr[fast] != 'A' && arr[fast] != 'E' && arr[fast] != 'I' && 
                  arr[fast] != 'O' && arr[fast] != 'U') {
                fast--;
            }

            char temp=arr[slow];
            arr[slow]=arr[fast];
            arr[fast]=temp;
            slow++;
            fast--;
        }
        return new String(arr);
    }
}