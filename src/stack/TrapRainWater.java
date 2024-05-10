package stack;

public class TrapRainWater {
    public int trap(int[] height) {
        int leftIndex = 0, rightIndex = height.length - 1;
        int maxLeft = 0, maxRight = 0;
        int ans = 0;

        while (leftIndex <= rightIndex) {
            if (height[leftIndex] <= height[rightIndex]) {
                if (height[leftIndex] >= maxLeft) {
                    maxLeft = height[leftIndex];
                } else {
                    ans += maxLeft - height[leftIndex];
                }
                leftIndex++;
            } else {
                if (height[rightIndex] >= maxRight) {
                    maxRight = height[rightIndex];
                } else {
                    ans += maxRight - height[rightIndex];
                }
            }
        }
        return ans;

    }
}
