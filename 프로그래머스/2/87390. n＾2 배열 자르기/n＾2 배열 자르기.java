import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
    	int[] result = new int[(int)(right - left) + 1];

    	for (int i = 0; i < result.length; i++) {
    		int y = (int)(left % n);
    		int x = (int)(left / n);
    		
    		left++;
    		result[i] = Math.max(x, y) + 1;
    	}
    	
    	return result;
    }
}