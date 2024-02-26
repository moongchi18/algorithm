import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < elements.length; i++) {
        	int temp = elements[i];
        	set.add(temp);
        	int times = 1;
        	for(int j = i + 1; j < elements.length * 2; j++) {
        		temp += elements[j % elements.length];
        		set.add(temp);
        		times++;
        		if(times == elements.length) {
        			break;
        		}
        		
        	}
        }
        
        return set.size();
    }
}