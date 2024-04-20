import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
    	int length = numbers.length;
    	List<Integer> result = new ArrayList<>();
        for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
				int sum = numbers[i] + numbers[j];
				if(!result.contains(sum)) {
					result.add(sum);
				}
			}
		}
        return result.stream()
        			.sorted()
        			.mapToInt(Integer::valueOf)
        			.toArray();
    }
}