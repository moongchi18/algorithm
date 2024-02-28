import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
//    	ver1
//    	int[][] array = new int[n][n];
//    	
//    	for (int i = 0; i < array.length; i++) {
//    		array[i][i] = i + 1;
//    		for (int j = 0; j < i; j++) {
//    			array[j][i] = i + 1;
//    			array[i][j] = i + 1;
//    		}
//		}
//    	int[] temp = Arrays.stream(array)
//		    		.flatMapToInt(Arrays::stream)
//		    		.toArray();
    	
//    	ver2
//    	int[] result = new int[(int)(right - left) + 1];
//
//    	for (int i = 0; i < result.length; i++) {
//    		int value = (int)(left + 1 + i) % n == 0 ? n:(int)(left + 1 + i) % n;
//    		int plus = (int)((left + 1 + i) / n) + 1;
//    		
//    		if(value <= plus
//    				&& plus <= n) {
//    			result[i] = plus;
//    		} else if(value < n){
//    			result[i] = value;
//    		} else {
//    			result[i] = n;
//    		}
//    		value++;
//    	}
    	
    	int[] result = new int[(int)(right - left) + 1];

    	for (int i = 0; i < result.length; i++) {
    		int y = (int)(left % n) + 1;
    		int x = (int)(left / n) + 1;
    		
    		left++;
    		result[i] = Math.max(x, y);
    	}
    	
    	return result;
    }
}