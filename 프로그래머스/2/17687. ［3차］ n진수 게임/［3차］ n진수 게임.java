import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder result = new StringBuilder();
        Queue<Character> que = new LinkedList<>();
        int num = 0;
        for (int i = 0; i < t; i++) {
			for (int j = 1; j <= m; j++) {
				if (que.isEmpty()) {
					String numString = Integer.toString(num++, n).toUpperCase();
					for (int k = 0; k < numString.length(); k++) {
						que.add(numString.charAt(k));
					}
				}
				char temp2 = que.poll();
				if(j == p) {
					result.append(temp2);
				}
			}
		}
        return result.toString();
    }
}