import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int[] solution(String[] operations) {
    	PriorityQueue<Integer> que = new PriorityQueue<>();
    	PriorityQueue<Integer> reverseQue = new PriorityQueue<>(Comparator.reverseOrder());
    	
    	for (String op : operations) {
			if(op.startsWith("I")) {
				int num = Integer.parseInt(op.substring(2));
				que.add(num);
				reverseQue.add(num);
			} else {
				if(op.equals("D 1")) {
					que.remove(reverseQue.poll());
				} else {
					reverseQue.remove(que.poll());
				}
			}
		}
    	
    	if(que.size() > 1) {
    		return new int[] {reverseQue.poll(), que.poll()};
    	} else {
    		return new int[] {0, 0};
    	}
    }
}