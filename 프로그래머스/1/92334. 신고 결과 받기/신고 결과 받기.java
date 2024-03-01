import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] mailedCount = new int[id_list.length];
        
        Map<String, List<String>> reported = new HashMap<>();
        Map<String, Integer> index = new HashMap<>();
        
        for (int i = 0; i < id_list.length; i++) {
			index.put(id_list[i], i);
			reported.put(id_list[i], new ArrayList<>());
		}
        
        for (String r : report) {
			String[] temp = r.split(" ");
			String reporter = temp[0];
			String fireTarget = temp[1];
			
			if(!reported.get(fireTarget).contains(reporter)) {
				reported.get(fireTarget).add(reporter);
			}
		}
        
        for (int i = 0; i < id_list.length; i++) {
			List<String> temp = reported.get(id_list[i]);
			if(temp != null
					&& temp.size() >= k) {
				temp.forEach(
						r -> mailedCount[index.get(r)]++
					);
			}
		}
        
        return mailedCount;
    }
}