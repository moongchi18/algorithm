import java.util.Stack;

class Solution {
	public int solution(String s) {
		char[] target = s.toCharArray();
		
		Stack<Character> result = new Stack<>();
		result.add(target[0]);
		
		for (int i = 1; i < target.length; i++) {
			if(!result.empty() && result.peek().equals(target[i])) {
				result.pop();
			} else {
				result.add(target[i]);
			}
		}
		
		return result.size() == 0 ? 1:0;
	}
}