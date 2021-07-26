/*Coin Change with repetition minimum number of coin to make a value */

//DP

import java.util.*;

class GFG {
	public static void main (String[] args) {
	    int N = 4;
	    int value_to_make = 13;
		int[] Available_coins = {1, 5, 6, 9};
    int result = re(Available_coins, value_to_make,N) == Integer.MAX_VALUE?-1 : re(Available_coins, value_to_make,N);
		System.out.println(result);
	}
	public static int re(int[] len, int val, int N){
	    
	    if(N==0 || val <= 0) return 0;
	    
	    int[] dp = new int[val+1];
	    dp[0] = 0;
	    for(int i=1; i<=val; i++){
	        dp[i] = Integer.MAX_VALUE;
	    }
	    for(int i=1; i<=val; i++){
	        
	        for(int j=0; j<len.length; j++){
	            if(len[j] <= i){
	                int temp = dp[i - len[j]];
                    if(temp != Integer.MAX_VALUE && temp+1 < dp[i]){
                        dp[i] = temp+1;
                    }
	            }
	        }
	        
	    }
	    
	    return dp[val];
	    
	}
}


