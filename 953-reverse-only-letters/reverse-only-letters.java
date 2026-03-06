class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr=s.toCharArray();
        int slow=0;
        int fast=arr.length-1;
        while(slow<fast){
            if(!Character.isLetter(arr[slow])){
                slow++;
            }
            else if(!Character.isLetter(arr[fast])){
                fast--;
            }
            else{
                 char temp=arr[slow];
            arr[slow]=arr[fast];
            arr[fast]=temp;
            slow++;
            fast--;
            }
        }
           return new String(arr);
     }
}