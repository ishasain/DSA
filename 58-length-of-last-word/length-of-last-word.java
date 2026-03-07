class Solution {
    public int lengthOfLastWord(String s) {
        int count =0;
        int ptr=s.length()-1;
        while(ptr>=0 && s.charAt(ptr)==' '){
            ptr--;
        }
        while(ptr>=0 && s.charAt(ptr)!=' '){
            count++;
            ptr--;
        }
        return count;
    }
}