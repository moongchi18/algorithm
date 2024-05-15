import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String msg) {
    	List<Integer> list = new ArrayList<>();
    	Map<String, Integer> map = new HashMap<>();
    	for (int i = 0; i < 26; i++) {
			map.put(String.valueOf((char) (65 + i)), i + 1);
		}
    	int index = 27;
    	for (int i = 0; i < msg.length();) {
			String cur = msg.substring(i, i + 1);
			String next = null;
			if(i != msg.length() - 1) {
				for (int j = i + 1; j < msg.length() + 1; j++) {
					cur = msg.substring(i, j);
					if(!map.containsKey(cur)) {
						next = new String(cur);
						cur = msg.substring(i, j - 1);
						break;
					} 
				}
				if(next != null) {
					map.put(next, index++);
				}
			}
			list.add(map.get(cur));
			i += cur.length();
		}
    	
        return list.stream()
        			.mapToInt(Integer::intValue)
        			.toArray();
    }
}