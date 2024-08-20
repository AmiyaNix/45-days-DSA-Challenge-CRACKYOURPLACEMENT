class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], true);
        }
        for(int i=1; i<arr.length; i++){
            if(!map.containsKey(i)){
                return i;
            }
        }
        return arr.length;
        
    }
}
