class Solution {
    public int addDigits(int num) {
     
    if(num<10)
    {
        return num;
    }
    return addDigits(sum(num));
    }
    public int sum(int n){
        if(n==0)
        return 0;
        return n%10+sum(n/10);
    }
}