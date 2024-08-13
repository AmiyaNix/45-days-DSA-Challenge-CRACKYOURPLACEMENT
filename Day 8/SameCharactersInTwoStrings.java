class Solution {
    int sameChar(String A, String B) {
        int count = 0;
        int n = A.length();
        
        for (int i = 0; i < n; i++) {
            if (Character.toLowerCase(A.charAt(i)) == Character.toLowerCase(B.charAt(i))) {
                count++;
            }
        }
        
        return count;
    }
}
