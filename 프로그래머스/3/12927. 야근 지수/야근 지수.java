import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
	public long solution(int n, int[] works) {
		long answer = 0;
		PriorityQueue<Integer> que = new PriorityQueue<>(Comparator.reverseOrder());
		for (int i = 0; i < works.length; i++) {
			que.add(works[i]);
		}
		
		while(n != 0) {
			int cur = que.poll() - 1;
			if(cur < 0) {
				return 0;
			}
			que.add(cur);
			n--;
		}
		
		while(!que.isEmpty()) {
			int cur = que.poll();
			answer += cur * cur;
		}
		
		return answer;
	}
}