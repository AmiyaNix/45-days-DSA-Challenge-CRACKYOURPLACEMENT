class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        int min = Integer.MAX_VALUE;
        for(int i=0; i+m-1<n; i++){
            int dif = (a.get(i+m-1) - a.get(i));
            min = Math.min(min, dif);
            
        }
        return min;
    }
}
