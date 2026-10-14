class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int maxArea = 0;

        while(l < r) {
            int h = Math.min(height[l], height[r]);
            int w = r - l;
            int area = h * w;

            maxArea = Math.max(maxArea, area);

            while (l < r && height[l] <= h) l++;
            while (l < r && height[r] <= h) r--;
        }
        return maxArea;
    }
}