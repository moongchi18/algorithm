class Solution {
    public String solution(String[] seoul) {
        String start = "김서방은 ";
        String end = "에 있다";
        for (int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				end = i + end;
			}
		}
        
        return start.concat(end);
    }
}