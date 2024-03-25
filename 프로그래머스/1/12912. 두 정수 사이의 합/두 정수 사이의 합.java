class Solution {
    public long solution(int a, int b) {
        int max = Integer.max(a, b);
        int min = Integer.min(a, b);
        
        long answer = 0;
        for (int i = min; i <= max; i++) {
        	answer += i;
		}
        return answer;
    }
}