class Solution {
	boolean solution(String s) {
		char[] target = s.toCharArray();
		int sum = 0;
		for (int i = 0; i < target.length; i++) {
			if(sum < 0) {
				return false;
			}
			if(target[i] == '(') {
				sum++;
			} else if(target[i] == ')') {
				sum--;
			}
		}
		if(sum != 0) {
			return false;
		}
	
		return true;
	}
}