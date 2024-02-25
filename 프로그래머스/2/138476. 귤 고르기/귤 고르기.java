import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        int max = Arrays.stream(tangerine).max().orElse(0);
        int[] list = new int[max+1];
        
        for (int i = 0; i < tangerine.length; i++) {
        	int val = tangerine[i];
			list[val]++;
		}
        
        Arrays.sort(list);
        
        int sum = 0;
        for (int i = max; i >= 0; i--) {
			sum += list[i];
			answer++;
			if(sum >= k) break; 
		}
        
        return answer;
    }
}