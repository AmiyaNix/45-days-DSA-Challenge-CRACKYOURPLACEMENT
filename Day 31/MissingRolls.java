class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int totalSumRequired = (n + m) * mean;

        for (int rollValue : rolls) {
            totalSumRequired -= rollValue;
        }

        if (totalSumRequired > n * 6 || totalSumRequired < n) {
            return new int[0];
        }

        int[] missingRolls = new int[n];

        Arrays.fill(missingRolls, totalSumRequired / n);

        for (int i = 0; i < totalSumRequired % n; ++i) {
            ++missingRolls[i];
        }

        return missingRolls;
        
    }
}
