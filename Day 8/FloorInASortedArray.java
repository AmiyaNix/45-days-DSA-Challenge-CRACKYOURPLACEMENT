class Solution {

    // Function to find floor of x
    // n is the size of array
    static int findFloor(long arr[], int n, long x) {
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<=x){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
}
