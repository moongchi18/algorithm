import java.util.*;

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();
        
        for (int i = 1; i <= food.length - 1; i++) {
			int count = food[i] / 2;
			if(count > 0) {
				char[] arr = new char[count];
				Arrays.fill(arr, Character.forDigit(i, 10));
				String val = String.valueOf(arr);
				sb.append(val);
				stack.add(val);
			}
		}
        sb.append('0');
        
        while(!stack.isEmpty()) {
        	sb.append(stack.pop());
        }
        return sb.toString();
    }
}