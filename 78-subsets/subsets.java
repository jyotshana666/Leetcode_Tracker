class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        generate(nums, 0, current, res);

        return res;
    }

    private void generate(int[]nums, int index, List<Integer> current, List<List<Integer>> res) {
        if(index == nums.length) {
            res.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);
        generate(nums, index + 1, current, res);

        current.remove(current.size() - 1);

        generate(nums, index + 1, current, res);
    }
}