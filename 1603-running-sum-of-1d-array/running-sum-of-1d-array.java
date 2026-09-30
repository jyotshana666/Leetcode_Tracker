class Solution {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        if(len == 0) return new int[0];

        int[] res = new int[len];
        res[0] = nums[0];
        for(int i = 1; i < len; i++) {
            res[i] = res[i-1] + nums[i];
        }
        return res;
    }
}