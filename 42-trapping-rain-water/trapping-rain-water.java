class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int total = 0;
        int leftMax = 0,rightMax = 0;
        int i = 0, j = n - 1;
        while(i < j){
            if(height[i] <= height[j]){
                if(leftMax > height[i]){
                    total += leftMax - height[i];
                }
                else leftMax = height[i];
                i = i + 1;
            }
            else{
                if(rightMax > height[j]){
                    total += rightMax - height[j];
                }
                else rightMax = height[j];
                j = j - 1;
            }
        }
        return total;
    }
}