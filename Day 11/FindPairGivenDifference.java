class Solution {
    public int findPair(int n, int x, int[] arr) {
        Arrays.sort(arr);
        int left = 0;
        int right = 1;
        while (right < n) {
            int diff = Math.abs(arr[right] - arr[left]);
            if (diff == x) {
                return 1;
            } else if (diff < x) {
                right++;
            } else {
                left++;
                if (left == right) {
                    right++;
                }
            }
        }
        return -1;
    }
}
