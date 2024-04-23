import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
    	PriorityQueue<Integer> que = new PriorityQueue<>((Integer o1, Integer o2) -> {
    		return o1.compareTo(o2);
    	});
    	int[] result = new int[score.length];
    	
    	for (int i = 0; i < score.length; i++) {
			que.add(score[i]);
			int min = Integer.MAX_VALUE;
			if(que.size() > k) {
				que.poll();
			} 
			min = que.peek();
			result[i] = min;
		}
    	
    	
        return result;
    }
}