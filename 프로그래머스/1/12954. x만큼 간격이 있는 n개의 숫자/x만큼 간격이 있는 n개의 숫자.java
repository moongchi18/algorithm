class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long val = Long.valueOf(x);
        
        for (int i = 0; i < n; i++) {
			answer[i] = val * (i + 1);
		}
        
        return answer;
    }
}