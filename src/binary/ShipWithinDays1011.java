package binary;

import java.util.Arrays;

public class ShipWithinDays1011 {
	
	public int shipWithinDays(int[] weights, int days) {
        int min = Arrays.stream(weights).max().getAsInt();
        int max = Arrays.stream(weights).sum();

        while(min < max){
            int mid = (min + max) / 2;
            if(check(mid, weights, days)){
                max = mid;
            }else{
                min = mid + 1;
            }
        }

        return min;

    }	

    private static boolean check(int capacity, int[] weights, int days){
        int currLoad = 0;
        int currDays = 1;
        for(int weight: weights){
            if(currLoad + weight <= capacity){
                currLoad += weight;
            }else{
                currDays++;
                currLoad = weight;
            }
        }
        return currDays <= days ? true : false;
    }

}
