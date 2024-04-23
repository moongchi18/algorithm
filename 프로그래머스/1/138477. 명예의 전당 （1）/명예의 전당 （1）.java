import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
    	PriorityQueue<Integer> que = new PriorityQueue<>();
    	int[] result = new int[score.length];
    	
    	for (int i = 0; i < score.length; i++) {
			que.add(score[i]);
			if(que.size() > k) {
				que.poll();
			} 
			result[i] = que.peek();
		}
    	
    	
        return result;
    }
}