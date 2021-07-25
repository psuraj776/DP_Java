/*Coin Change with repetition minimum number of coin to make a value */

//Recursive

import java.util.*;

class GFG {
	public static void main (String[] args) {
	    int N = 4;
	    int value_to_make = 13;
		int[] Available_coins = {1, 5, 6, 9};
		System.out.println(re(Available_coins, value_to_make,N));
	}
	public static int re(int[] len, int val, int N){
	    if(N==0 || val <= 0) return 0;
	    
	    int res = Integer.MAX_VALUE;
	    
	    for(int i=0;i<N;i++){
	        if(len[i] <= val){
	            int temp = re(len, val-len[i], N);
	            if(temp+1 < res){
	                res = temp+1;
	            }
	        }
	    }
	    return res;
	}
}


