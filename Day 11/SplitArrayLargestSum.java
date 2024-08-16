class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            maxi = Math.max(maxi, nums[i]);
            sum+=nums[i];
        }
        int low = maxi;
        int high = sum;
        while(low<=high){
            int mid = (low+high)/2;
            int noOfParts = countParts(nums, n, mid);
            if(noOfParts>k){
                low = mid+1;
            } 
            else{
                high = mid-1;
            }
        }
        return low;
    }
    public static int countParts(int[] arr, int n, int maxSum){
        int noOfParts = 1;
        int sum = 0;
        for(int i=0; i<n; i++){
            if(sum+arr[i]<=maxSum){
                sum += arr[i];
            }
            else{
                noOfParts++;
                sum = arr[i];
            }
        }
        return noOfParts;
    }
}


