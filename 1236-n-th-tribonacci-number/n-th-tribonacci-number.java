class Solution {
    public int tribonacci(int n) {
        int a=0;
        int b=1;
        int c=1;
        for(int i=0;i<n;i++){
            
            int temp=a;
            a=b;
            b=c;
            c=temp+a+b;
        }
        return a;
    }
}