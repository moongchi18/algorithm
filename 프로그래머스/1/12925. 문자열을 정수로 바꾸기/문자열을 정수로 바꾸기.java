class Solution {
    public int solution(String s) {
        return toInt(s);
    }
    
    public int toInt(String target) {
    	if(target.startsWith("-")) {
    		return Integer.parseInt(target.substring(1)) * -1;
    	} else {
    		return Integer.parseInt(target);
    	}
    }
    
}