class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();

        int threshold = nums.length / 2;
        for(int num : nums) {
            int count = counts.getOrDefault(num, 0) + 1;
            counts.put(num, count);

            if (count > threshold) {
                return num;
            }
        } 
        return -1;  
    }
}