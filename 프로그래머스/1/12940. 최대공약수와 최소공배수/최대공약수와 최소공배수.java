import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        
        int gcd = gcd(max, min);
        int lcm = (max * min) / gcd;
        
        return new int[] {gcd, lcm};
    }
    
    public int gcd(int max, int min) {
    	if(min == 0) {
    		return max;
    	} else {
    		return gcd(min, max % min);
    	}
    }
}