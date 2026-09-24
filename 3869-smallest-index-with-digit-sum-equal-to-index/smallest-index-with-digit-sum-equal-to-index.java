class Solution {
    private int sumOfDigits(int num) {
        int sum = 0;

        while(num > 0) {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        return sum;
    }

    public int smallestIndex(int[] nums) {
        int len = nums.length;

        for(int index = 0; index < len; index++) {
            if(index == sumOfDigits(nums[index])) {
                return index;
            }
        }
        return -1;
    }
}