class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        int prefixSum = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            prefixSum += nums[i];
            int remainder = prefixSum % k;
            if(remainder<0){
                remainder+=k;
            }
            if(mpp.containsKey(remainder)){
                count+=(mpp.get(remainder));

            }
            mpp.put(remainder, mpp.getOrDefault(remainder, 0)+1);

        }
        return count;
        
    }
}
