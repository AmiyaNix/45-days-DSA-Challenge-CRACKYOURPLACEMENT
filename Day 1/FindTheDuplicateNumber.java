class Solution {
    public int findDuplicate(int[] nums) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int it : nums){
            map.put(it, map.getOrDefault(it, 0)+1);
        }
        for(int i=0; i<nums.length; i++){
            if(map.get(nums[i])>=2){
                ans = nums[i];
            }
        }
        return ans;
        
    }
}
