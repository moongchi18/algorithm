import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int length = priorities.length;
        
        
        Queue<Integer[]> que = new LinkedList<Integer[]>();

        Integer[][] twoArray = new Integer[length][2];
        for (int i = 0; i < length; i++) {
        	twoArray[i][0] = priorities[i];
        	twoArray[i][1] = i;
        	que.add(twoArray[i]);
        }
        List<Integer[]> result = new ArrayList<>();
    	while(!que.isEmpty()) {
        	int max = que.stream()
        				.max(Comparator.comparing(k -> k[0]))
        				.orElse(new Integer[] {0,0})[0];
        	Integer[] current = que.poll();
        	if(current[0] == max) {
        		result.add(current);
        	} else {
        		que.add(current);
        	}
    	}
    	for (int i = 0; i < length; i++) {
			if(result.get(i)[1] == location) {
				answer = i + 1;
			}
		}
        
        return answer;
    }
}