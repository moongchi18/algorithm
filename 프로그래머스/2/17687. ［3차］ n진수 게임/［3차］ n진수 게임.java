import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
    	long startTime = System.currentTimeMillis();
        StringBuilder result = new StringBuilder();
        int num = 0;
        int index = 0;
        int order = p - 1;
        for (int i = 0; i < t * m; ) {
			String numStr = Integer.toString(num++, n).toUpperCase();
			for (int j = 0; j < numStr.length(); j++) {
				if(index < t * m
						&& index++ % m == order) {
					result.append(numStr.charAt(j));
				}
			}
			i += numStr.length();
		}
        
        long endTime = System.currentTimeMillis();
        System.out.printf("### 실행시간 : %,d ms %n", (endTime - startTime));
        return result.toString();
    }
}