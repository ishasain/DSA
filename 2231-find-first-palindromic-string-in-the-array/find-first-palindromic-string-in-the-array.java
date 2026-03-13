class Solution {
    public String firstPalindrome(String[] words) {
      for(String word:words){
        int s=0;
        int e=word.length()-1;
        boolean isPalindrome=true;
        while(s<e){
            if(word.charAt(s)!=word.charAt(e)){
                isPalindrome=false;
            }
            s++;
            e--;
        }
        if(isPalindrome){
            return word;
        }
      }  
      return "";
    }
}