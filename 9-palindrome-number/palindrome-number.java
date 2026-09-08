class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int digit=0;
        int n=x;
        if(x<0){
            x=x*(-1);
        }
        while(x!=0){
            rev*=10;
            digit=x%10;
            rev=rev+digit;
            x=x/10;
        }
        if(n==rev) return true;
        else return false;
    }
}