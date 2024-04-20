import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
    	int length = numbers.length;
    	Set<Integer> result = new TreeSet<>();
        for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
				int sum = numbers[i] + numbers[j];
				result.add(sum);
			}
		}
        return result.stream()
        			.mapToInt(Integer::valueOf)
        			.toArray();
    }
}