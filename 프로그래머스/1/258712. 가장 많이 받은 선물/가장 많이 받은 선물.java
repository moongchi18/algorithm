import java.util.HashMap;
import java.util.Map;

class Solution {
    	public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        Map<String, People> result = new HashMap<>();
        
        for(String s : friends) {
        	int point = 0;
        	People temp = new People(s);
        	
        	for(String g : gifts) {
        		String[] history = g.split(" ");
        		if(s.equalsIgnoreCase(history[0])) {
        			point++;
        			if(temp.giftFriends.get(history[1]) == null) {
        				temp.giftFriends.put(history[1], 1);
        			} else {
        				temp.giftFriends.put(history[1], temp.giftFriends.get(history[1])+1);
        			}
        		} else if(s.equalsIgnoreCase(history[1])) {
        			point--;
        			if(temp.giftFriends.get(history[0]) == null) {
        				temp.giftFriends.put(history[0], -1);
        			} else {
        				temp.giftFriends.put(history[0], temp.giftFriends.get(history[0])-1);
        			}
        		}
        	}
        	temp.totalGiftPoint=point;
        	result.put(s, temp);
        }
        
        int max = 0;
        for(String f : friends) {
        	People first = result.get(f);
        	for(String s : friends) {
        		if(f.equalsIgnoreCase(s)) {
        			continue;
        		}
        		People second = result.get(s);
        		
        		if(first.giftFriends.get(s) == null) {
        			if(first.totalGiftPoint > second.totalGiftPoint) {
        				first.nextGiftPoint++;
        			}
        		} else if(first.giftFriends.get(s) == 0) {
        			if(first.totalGiftPoint > second.totalGiftPoint) {
        				first.nextGiftPoint++;
        			}
        		} else if(first.giftFriends.get(s) > 0) {
        			first.nextGiftPoint++;
        		}
        	}
        	
        	if(first.nextGiftPoint > max) {
        		max = first.nextGiftPoint;
        		System.out.println(first.name);
        	}
        }
        
        return max;
    }
	
	class People{
		private String name;
		private int totalGiftPoint;
		private int nextGiftPoint;
		private Map<String, Integer> giftFriends;

		public People(String name) {
			this.name = name;
			this.totalGiftPoint = 0;
			this.nextGiftPoint = 0;
			this.giftFriends = new HashMap<>();
		}
	}
}