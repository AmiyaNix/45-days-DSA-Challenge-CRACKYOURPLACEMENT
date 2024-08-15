class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 1;  
        int high = position[position.length - 1] - position[0];
        while(low<=high){
            int mid= (low+high)/2;
            if(canWePlace(position, mid, m)){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return high;
        
    }
    public static boolean canWePlace(int[] position, int minDist, int balls){
        int noOfBalls = 1;
        int last = position[0];
        for(int i=0; i<position.length; i++){
            if(position[i] - last >= minDist){
                last = position[i];
                noOfBalls++;
            }
            
        }
        if(noOfBalls>=balls){
            return true;
        }
        return false;


    }
}
