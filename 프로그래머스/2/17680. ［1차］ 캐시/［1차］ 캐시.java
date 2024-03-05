import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        Deque<String> cache = new LinkedList<>();
        
        for (String city : cities) {
        	String lowerCity = city.toLowerCase();
			if(cache.contains(lowerCity)) {
				answer++;
				cache.remove(lowerCity);
			} else {
				answer += 5;
			}
			cache.addFirst(lowerCity);
			
			if(cache.size() > cacheSize) {
				cache.pollLast();
			} 
		}
        
        return answer;
    }
}