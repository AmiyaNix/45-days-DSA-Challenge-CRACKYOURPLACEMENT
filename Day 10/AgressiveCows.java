import java.util.*;
import java.lang.*;

public class AggressiveCows{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] stalls = new int[n];
		for(int i =0; i<n; i++){
			stalls[i] =  sc.nextInt();
		}
		int k = sc.nextInt();
		int maxD = aggressiveCows(stalls, k);
        System.out.println(maxD);
	}
	public static int aggressiveCows(int []stalls, int k) {
        Arrays.sort(stalls);
        int n = stalls.length;
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            maxi= Math.max(maxi, stalls[i]);
            mini = Math.min(mini, stalls[i]);
        }
        
        int low = 1, high = maxi-mini;
        while(low<=high){
            int mid = (low+high)/2;
            if(canWePlace(stalls, mid, k)){
                low=mid+1;
            }
            else{
                high = mid-1;
            }
            
        }
        return high;
        
    }

    public static boolean canWePlace(int[] arr, int minDist, int cows){
        int noOfCows = 1;
        int last = arr[0];
        for(int i=0; i<arr.length; i++){
            if((arr[i]-last)>=minDist){
                last = arr[i];
                noOfCows++;
            }
        }
        if(noOfCows>=cows){
            return true;
        }
        return false;
    }
}
