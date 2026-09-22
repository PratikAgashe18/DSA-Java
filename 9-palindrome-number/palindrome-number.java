class Solution {
    public boolean isPalindrome(int n) {
        if(n<0){
            return false;
        }
        int reverse=0;
        int org=n;
        while(n>0){
            int dig=n%10;
            reverse=reverse*10+dig;
            n=n/10;
        }
        if(reverse==org){
            return true;
        }else{
            return false;
        }


        
    }
}