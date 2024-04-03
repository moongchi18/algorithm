import java.util.*;

class Solution {
    public int solution(int left, int right) {
    	List<Integer> array = new ArrayList<>(); // 숫자별 약수 개수 
    	for (int i = left; i <= right; i++) {
    		List<Integer> countArray = new ArrayList<>(); // 숫자의 약수 리스트
			
    		for (int j = 1; j <= i; j++) {
				if(i % j == 0) countArray.add(j);
			}
			
    		int size = countArray.size();
			if(size % 2 == 1) {
				array.add(i * -1);
			} else {
				array.add(i);
			}
		}
        return array.stream()
        			.mapToInt(Integer::valueOf)
        			.sum();
    }
}