class Solution {
    public int countDigits(int num) {
      return helper(num,num);
    }
    public int helper(int original,int n){
        if(n==0)
        return 0;
        int digit=n%10;
        if(digit!=0 && original%digit==0){
            return 1+helper(original,n/10);
        }
        return helper(original,n/10);
    }
}