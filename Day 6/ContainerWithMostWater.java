class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int left = 0;
        int right = height.length - 1;

        while(left<right){
            int water =(right-left)*Math.min(height[left], height[right]);
            res = Math.max(water, res);
            if(height[left] < height[right]) left++;
            else right--;
        }
        return res;
        
    }
}
