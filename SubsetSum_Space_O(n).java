import java.io.*;

class GFG {
	public static void main (String[] args) {
		int[] ar = {3, 3, 4, 3};
		int N = 6;
		boolean[] isPossible = new boolean[7];
		isPossible[0] = true;
		for(int i=0;i<ar.length;i++){
		    isPossible[ar[i]] = true;
		}
		for(int i=0;i<ar.length;i++){
		    for(int j=1;j<=6;j++){
		        if(j - ar[i]>=0 && isPossible[j - ar[i]]){
		            isPossible[j] = isPossible[j - ar[i]];
		        }
		    }
		}
		for(int i=0;i<=N;i++){
		    System.out.println(i+" "+isPossible[i]);
		}
	}
}
