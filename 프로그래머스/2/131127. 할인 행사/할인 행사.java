import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int size = 10;
        List<String> search = Arrays.asList(want);
        
        int[] values = new int[number.length];
        for (int j = 0; j < size; j++) {
			if(search.contains(discount[j])) {
				int index = search.indexOf(discount[j]);
				values[index]++;
			}
		}
        if(Arrays.equals(number, values)) {
        	answer++;
        }
        
        for (int i = 0; i < discount.length - size; i++) {
			if(search.contains(discount[i])) {
				int left = search.indexOf(discount[i]);
				values[left]--;
			}
			if(search.contains(discount[size+i])) {
				int right = search.indexOf(discount[size + i]);
				values[right]++;
			}
        	if(Arrays.equals(number, values)) {
				answer++;
			}
		}
        
        return answer;
    }
}