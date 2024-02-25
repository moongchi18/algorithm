import java.util.*;

class Solution {
    public long solution(int n) {
    	map.put(0, 0L);
    	map.put(1, 1L);
    	map.put(2, 2L);
    	map.put(3, 3L);
    	
        return fibonacci(n);
    }
    public static Map<Integer, Long> map = new HashMap<>();
    
    public static long fibonacci(int i) {
    	if(i <= 1) return i;
    	
    	if(map.containsKey(i)) return map.get(i);
    	
    	long value = (fibonacci(i - 1) + fibonacci(i - 2)) % 1234567;
    	map.put(i, value);
    	
    	return value;
    }
}