import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
	public long solution(int n, int[] works) {
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
		return que.stream()
					.mapToLong(i -> i * i)
					.sum();
	}
}