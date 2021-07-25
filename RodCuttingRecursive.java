/*Rod Cutting */

//Recursive

import java.util.*;

class GFG {
	public static void main (String[] args) {
	    int N = 8;
	    int rod_len = 4;
		int[] length_of_rod = {1, 2, 3, 4, 5,  6,  7,  8 };
		int[] price_accordi = {1, 5, 8, 9, 10, 17, 17, 20};
		System.out.println(re(length_of_rod, price_accordi,N,rod_len));
	}
	public static int re(int[] len, int[] pri, int N, int rod_len){
	    if(N==0 || rod_len <= 0) return 0;
	    
	    int profit = Integer.MIN_VALUE;
	    
	    for(int i=0;i<N;i++){
	        if(len[i] <= rod_len){
	            profit = Math.max(re(len, pri, N, rod_len - len[i]) + pri[i], profit);
	        }
	    }
	    return profit;
	}
}


