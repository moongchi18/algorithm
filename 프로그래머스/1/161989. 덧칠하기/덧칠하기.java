import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int n, int m, int[] section) {
        List<Integer> list = Arrays.stream(section)
        							.boxed()
        							.collect(Collectors.toList());
        int count = 0;
        while(!list.isEmpty()) {
        	count++;
        	int index = list.get(list.size() - 1);
        	list.removeIf(i -> i > (index - m));
        }
    	return count;
    }
}