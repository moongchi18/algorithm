import java.util.*;

class Solution {
    public int solution(String t, String p) {
    	int targetLength = p.length();
    	Long target = Long.parseLong(p);
    	List<Long> list = new ArrayList<>();
    	
    	for (int i = 0; i <= t.length() - targetLength; i++) {
			list.add(Long.parseLong(t.substring(i, i+targetLength)));
		}
        return (int)list.stream()
	        			.filter(i -> i <= target)
	        			.count();
    }
}