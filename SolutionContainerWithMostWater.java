class SolutionContainerWithMostWater {
    public int maxArea(int[] height) {
        
        // 1, brute force solution. time complexity is O(n^2)
        // int max = 0;
        // for(int i = 0; i < height.length; i++){            
        //     for(int j = i + 1; j < height.length; j++){                
        //         max =Math.max(max, (j - i) * Math.min(height[i], height[j])); 
        //     }
        // }
        // return max;

        // 2, two pointers; Time complexity is O(n);
        // the max area is determined by max width and min height; 
        // starting from the max width(0, n), our goal is to keep the relative bigger height when 
        //  shrinking width gets smaller. Only in this way can we make area become the max. 
        // 夹逼法，每次向中间缩小一格，保留较长的柱子
        int i = 0, j = height.length - 1, max = 0;
        while (i < j) {
            max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
            if (height[i] <= height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}