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
	    
	    int[] dp = new int[rod_len+1];
	    
	    for(int i=1;i<=rod_len;i++){
	        dp[i] = Integer.MIN_VALUE;
	        for(int j=0;j<i;j++){
	            dp[i] = Math.max(dp[i], pri[j]+dp[i-j-1]);
	        }
	    }
	    
	    return dp[rod_len];
	}
}

https://ide.geeksforgeeks.org/Pv8eniEz5b