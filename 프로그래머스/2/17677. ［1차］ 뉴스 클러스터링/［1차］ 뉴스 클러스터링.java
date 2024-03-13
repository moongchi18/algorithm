import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        
        for (int i = 0; i < str1.length() - 1; i++) {
        	String temp = str1.substring(i, i+2);
        	if(temp.matches("^[a-zA-Z]*$")) {
        		list1.add(temp.toLowerCase());
        	}
		}
        for (int i = 0; i < str2.length() - 1; i++) {
        	String temp = str2.substring(i, i+2);
        	if(temp.matches("^[a-zA-Z]*$")) {
        		list2.add(temp.toLowerCase());
        	}
        }
        List<String> intersection = new ArrayList<>();
        List<String> union = new ArrayList<>();
        
        for(String value : list1){
            if(list2.contains(value)){
                intersection.add(value);
                list2.remove(value);
            }
            union.add(value);
        }

        for(String value : list2){
            union.add(value);
        }
        
        if(union.size() == 0) {
        	return 65536;
        }
        
        return (int)((double) intersection.size() / union.size() * 65536);
    }
}