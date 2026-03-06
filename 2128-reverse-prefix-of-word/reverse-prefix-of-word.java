class Solution {
    public String reversePrefix(String word, char ch) {
        char[] arr=word.toCharArray();
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ch){
                index=i;
                break;
            }
        }
            int slow=0;
            int fast=index;
          while(slow<fast){
            char temp=arr[slow];
            arr[slow]=arr[fast];
            arr[fast]=temp;
            slow++;
            fast--;
          }
        return new String(arr);
    }
}