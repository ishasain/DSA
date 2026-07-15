class Solution {
    public int countDigits(int num) {
        int cp=num;
        int count=0;
     while(cp!=0){
        int digit=cp%10;
        if(num%digit==0){
        count++;
        }
        cp=cp/10;
     }   
     return count;

    }
}