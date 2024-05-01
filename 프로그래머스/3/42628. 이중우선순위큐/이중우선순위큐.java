import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(String[] operations) {
    	Queue<Integer> que = new LinkedList<>();
    	
    	for (String s : operations) {
    		String[] arr = s.split(" ");
    		String op = arr[0];
    		int num = Integer.parseInt(arr[1]);
    		
    		if(op.startsWith("I")) {
    			que.add(num);
    		} else {
    			if(que.isEmpty()) {
    				continue;
    			} else {
    				if(num > 0) {
    					int max = que.stream()
    							.mapToInt(Integer::intValue)
    							.max()
    							.orElse(0);
    					que.remove(max);
    				}else {
    					int min = que.stream()
    							.mapToInt(Integer::intValue)
    							.min()
    							.orElse(0);
    					que.remove(min);
    				}
    			}
    		}
		}
    	int min = que.stream()
					.mapToInt(Integer::intValue)
					.min()
    				.orElse(0);
    	int max = que.stream()
					.mapToInt(Integer::intValue)
					.max()
	    			.orElse(0);

        return new int[] {max, min};
    }
}