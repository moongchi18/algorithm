import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, List<String>> map = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++) {
        	String wear = clothes[i][1];
        	String item = clothes[i][0];
        	
        	if(map.get(wear) == null) {
        		List<String> temp = new ArrayList<>();
        		temp.add(item);
        		map.put(wear, temp);
        	} else {
        		map.get(wear).add(item);
        	}
		}
        
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			String key = entry.getKey();
			List<String> val = entry.getValue();
			
			answer *= (val.size() + 1);
		}
        
        return answer - 1;
    }
}