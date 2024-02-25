import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        Map<String, Integer> place = new HashMap<>();
    	place.put("code", 0);
    	place.put("date", 1);
    	place.put("maximum", 2);
    	place.put("remain", 3);
    	
        int filterTargetPlace = place.get(ext);
        int sortTargetPlace = place.get(sort_by);
        

        List<int[]> temp = new ArrayList<>();
        for(int[] dataArray : data) {
        	if(dataArray[filterTargetPlace] < val_ext) {
        		temp.add(dataArray);
        	}
        }
        
        
        temp.sort(Comparator.comparingInt(row -> row[sortTargetPlace]));
        
        
        return temp.toArray(new int[0][]);
    }
}