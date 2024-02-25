import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        int max = Arrays.stream(tangerine).max().orElse(0);
        int[] countList = new int[max+1];
        
        for (int i = 0; i < tangerine.length; i++) {
        	int val = tangerine[i];
			countList[val]++;
		}
        
        Arrays.sort(countList);
        
        int sum = 0;
        for (int i = max; i >= 0; i--) {
			sum += countList[i];
			answer++;
			if(sum >= k) break; 
		}
        
        return answer;
    }
}
