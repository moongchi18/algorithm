import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
    	if(length <= 1) return new int[] {-1};
    	
    	int min = Arrays.stream(arr)
    			.min()
    			.orElse(0);
    	return Arrays.stream(arr)
    					.filter(num -> num != min)
    					.toArray();
    }
}