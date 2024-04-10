import java.util.*;

class Solution {
    public int solution(int n) {
    	List<Integer> list = new ArrayList<>();
    	while(n > 0) {
    		list.add(n % 3);
    		n /= 3;
    	}
    	int sum = 0;
    	int m = 1;
    	for (int i = list.size() - 1; i >= 0; i--) {
			sum += list.get(i) * m;
			m *= 3;
		}
        return sum;
    }
}