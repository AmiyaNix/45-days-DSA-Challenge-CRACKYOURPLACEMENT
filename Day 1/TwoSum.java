class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int sum = nums[i]+nums[j];
                if(sum==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
        
    }
}
