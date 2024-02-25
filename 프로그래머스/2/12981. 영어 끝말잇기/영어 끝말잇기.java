import java.util.Stack;

class Solution {
    public int[] solution(int n, String[] words) {
    	Stack<String> stack = new Stack<>();
    	
    	int index = 0;
    	int count = 0;
    	for (String s : words) {
    		if(stack.isEmpty()) {
    			stack.add(words[0]);
    		}else if(!validate(stack, stack.peek(), s)) {
				index = (stack.size() + 1) % n == 0 ?
							n : (stack.size() + 1) % n;
				count = (stack.size() + 1) % n == 0 ?
							(stack.size() + 1) / n
							:((stack.size() + 1) / n)+1;
				break;
			}
		}
    	
    	if(stack.size() == words.length) {
    		return new int[] {0, 0};
    	}
    	

        return new int[]{index, count};
    }
    public boolean validate(Stack<String> stack, String prev, String next) {
    	if(prev.charAt(prev.length() - 1) == next.charAt(0)) {
    		if(!stack.contains(next)) {
    			stack.add(next);
    			return true;
    		} 
    	}
		return false;
    }
}