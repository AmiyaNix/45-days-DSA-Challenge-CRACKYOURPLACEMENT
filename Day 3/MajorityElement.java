class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int vote = 0;
        int el = 0;
        for(int i=0; i<n; i++){
            if(vote == 0){
                vote+=1;
                el = nums[i];
            }
            else if(nums[i] == el){
                vote++;;
            }
            else{
                vote--;
            }

        }
        return el;
        
    }
}
