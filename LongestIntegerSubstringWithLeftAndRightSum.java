/*
Find the length of longest substring of a given string of digits,
such that sum of the digit n the first half and second half of the substring id
same.
Example : "142124"
Here ans is 6 because if we take whole string 142124
then sum of left half 1+4+2 == sum of right half 1+2+4

*/

// Time O(n2)
// Space O(n2)
import java.io.*;

class GFG {
	public static void main (String[] args) {
		String s = "234234";
		int n = s.length();
		int[][] sum = new int[n][n];
		for(int i=0;i<n;i++){
		    for(int j=i;j<n;j++){
		        if(i == j){
		            sum[i][j] = s.charAt(i)-'0';
		        }
		        else{
		            sum[i][j] = sum[i][j-1]+s.charAt(j)-'0';
		        }
		    }
		}
		int ans = 0;
		n = (n/2)*2;
		for(int i=2;i<=n;i+=2){
		    for(int j=0;j<=n-i;j++){
		        if(sum[j][j+(i/2)-1] == sum[j+(i/2)][j+i-1]){
		            ans = Math.max(ans,i);
		        }
		    }
		}
		System.out.println(ans);
	}
}





//Space Optimized O(n)

import java.io.*;

class GFG {
	public static void main (String[] args) {
		String s = "234234";
		int n = s.length();
		int[] sum = new int[n];
		sum[0] = s.charAt(0)-'0';
		for(int i=1;i<n;i++){
		    sum[i] = sum[i-1]+s.charAt(i)-'0';
		}
		int ans = 0;
		n = (n/2)*2;
		for(int i=2;i<=n;i+=2){
		    for(int j=0;j<=n-i;j++){
		        int left = i/2 - 1 < 0?0:i/2 - 1;
		        if(sum[left] == sum[j+i-1] - sum[left]){
		            ans = Math.max(ans,i);
		        }
		    }
		}
		System.out.println(ans);
	}
}
