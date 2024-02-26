import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int length = elements.length;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < length; i++) {
        	int temp = elements[i];
        	set.add(temp);
        	for(int j = i + 1; j < length + i; j++) {
        		temp += elements[j % length];
        		set.add(temp);
        	}
        }
        
        return set.size();
    }
}