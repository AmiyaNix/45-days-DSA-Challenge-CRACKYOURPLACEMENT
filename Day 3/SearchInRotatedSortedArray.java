class Solution {
    public int search(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            // left sorted
            if (arr[mid] >= arr[low]) {
                if (arr[low] <= target && arr[mid] >= target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // right sorted
            else {
                if (arr[mid] <= target && arr[high] >= target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
