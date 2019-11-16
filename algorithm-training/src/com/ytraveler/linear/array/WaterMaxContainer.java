package com.ytraveler.linear.array;

/**
 * @author Faizal Hao
 * @version 1.0
 * description: Given n non-negative
 * integers a1, a2, ..., an , where each represents
 * a point at coordinate (i, ai).n vertical lines are
 * drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container,
 * such that the container contains the most water.
 * Note: You may not slant the container and n is at least 2.
 * {@link：https://leetcode-cn.com/problems/container-with-most-water}
 */
public class WaterMaxContainer {

    /**
     * The shortest edge control the size of the area. Because of the longest length,only the shortest edge
     * is max. Area is max.
     */
    public int doublePointerMaxArea(int[] height) {
        int rightMax = height.length - 1, leftMax = 0, area = 0;
        while (rightMax > leftMax) {
            area = Math.max(area, (rightMax - leftMax) * Math.min(height[rightMax], height[leftMax]));
            if (height[rightMax] > height[leftMax]) {
                leftMax++;
            } else {
                rightMax--;
            }
        }
        return area;
    }

    /**
     * Cycle through all area size.
     */
    public int violenceMaxArea(int[] height) {
        int area = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                area = Math.max(area, (j - i) * Math.min(height[i], height[j]));
            }
        }
        return area;
    }
}
