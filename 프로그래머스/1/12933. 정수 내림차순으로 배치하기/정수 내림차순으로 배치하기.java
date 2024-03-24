import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        PriorityQueue<Long> que = new PriorityQueue<>(Comparator.comparingLong(l -> l * -1));
        int count = 0;
        while(n > 0) {
        	que.add(n % 10);
        	n /= 10;
        	count++;
        }
        
        int size = que.size();
        for (int i = 0; i < count; i++) {
        	answer *= 10;
			answer += que.poll();
		}
        return answer;
    }
}