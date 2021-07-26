import java.util.*;

class GFG {
	public static void main (String[] args) {
	    int N = 4;
		int[] weight = {2, 3, 4, 5};
		int[] value  = {3, 4, 5, 6};
		int capacity = 5;
		System.out.println(re(weight, value, N, capacity));
	}
	public static int re(int[] weight, int[] value, int N, int capacity){
	    
	    if(N<=0 || capacity<=0) return 0;
	    
	    if(weight[N-1]>capacity){
	        return re(weight, value, N-1, capacity);
	    }
	    //N-1 item included
	    int X = value[N-1] + re(weight, value, N-1, capacity-weight[N-1]);
	    //N-1 item not included
	    int Y = re(weight, value, N-1, capacity);
	    
	    return Math.max(X,Y);
	}
}