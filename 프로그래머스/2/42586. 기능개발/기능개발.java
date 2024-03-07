import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
    	int length = progresses.length;
        int[] workDay = new int[length];
        
        for (int i = 0; i < length; i++) {
        	if((100 - progresses[i]) % speeds[i] == 0) {
        		workDay[i] = (100 - progresses[i]) / speeds[i];
        	} else {
        		workDay[i] = ((100 - progresses[i]) / speeds[i]) + 1;
        	}
		}
        
        int index = 0;
        List<Integer> list = new ArrayList<>();
        while(index < length) {
        	int count = 1;
        	for (int i = index + 1; i < length; i++) {
				if(workDay[index] >= workDay[i]) {
					count++;
				}else {
					break;
				}
			}
        	index += count;
        	
        	list.add(count);
        }
        
        return list.stream()
        			.mapToInt(Integer::intValue)
        			.toArray();
    }
}