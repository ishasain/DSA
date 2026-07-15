class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        s=s.toLowerCase();
        String temp = "";
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if( ch >='a' && ch <= 'z' || ch >= '0' && ch <= '9' ){
            temp += ch;
            }
        }
       int left=0;
       int right=temp.length()-1;
       while( left < right){
        if(temp.charAt(left) != temp.charAt(right)  ){
            return false;
        }
        left++;
        right--;
       }
        return true;
    }
}