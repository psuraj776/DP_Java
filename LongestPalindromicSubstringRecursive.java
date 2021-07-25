//Recursive

import java.util.*;

class GFG {
	public static void main (String[] args) {
		String S = "abababababa";
		System.out.println(re(S));
	}
	public static int re(String S){
	    if(S.length()==0) return 0;
	    
	    if(S.length()==1) return 1;
	    
	    if(S.charAt(0) == S.charAt(S.length()-1)){
	        return 2+re(S.substring(1,S.length()-1));
	    }
	    
	    else{
	        return Math.max(re(S.substring(1,S.length())),re(S.substring(0,S.length()-1)));
	    }
	}
}
