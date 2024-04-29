class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
        	int count = 0;
        	double sqrt = Math.sqrt(i);
        	if(sqrt % 1 == 0) {
        		continue;
        	}
			for (int j = 1; j <= sqrt; j++) {
				if(i % j == 0) {
					count++;
					if(count > 1) {
						break;
					}
				}
			}
			if(count == 1) {
				answer++;
			}
		}
        return answer;
    }
}