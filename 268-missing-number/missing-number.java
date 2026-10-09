class Solution {
    public int missingNumber(int[] nums) {
            int n=nums.length;
            int actualSum=(n*(n+1))/2;
            int curSum=0;
            for(int i=0;i<nums.length;i++){
                curSum=curSum+nums[i];
            }
            int ans=actualSum-curSum;
            return ans;


    }
}