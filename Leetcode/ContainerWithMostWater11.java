class Solution {
    public int maxArea(int[] height) {
            int right = height.length - 1;
            int left = 0;
            int max = 0;
            while (left < right) {
                int minHeight = Math.min(height[left], height[right]);
                int currentArea = minHeight * (right - left);
                max = Math.max(max, currentArea);
                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }
            return max;
        }
    }
