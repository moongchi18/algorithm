import java.util.*;

class Solution {
	public int solution(String s) {
		int length = s.length();
		char[] charArray = s.toCharArray();

		Stack<Character> stack = new Stack<>();

		int count = 0;
		int rotation = 0;
		int success = 0;
		while (count != length && rotation <= length) {
			char now = charArray[count];
			if (stack.isEmpty()) {
				stack.add(now);
			} else if (stack.peek() == '(' && now == ')') {
				stack.pop();
			} else if (stack.peek() == '{' && now == '}') {
				stack.pop();
			} else if (stack.peek() == '[' && now == ']') {
				stack.pop();
			} else {
				stack.add(now);
			}
			count++;

			if (count == length) {
				if (stack.size() == 0) {
					success++;
				}
				count = 0;
				rotation++;
				char temp = charArray[0];
				System.arraycopy(charArray, 1, charArray, 0, length - 1);
				charArray[length - 1] = temp;
				if (rotation < length) {
					stack.clear();
				}
			}
		}
		return success;
	}
}