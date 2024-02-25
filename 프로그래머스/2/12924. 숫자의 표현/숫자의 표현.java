class Solution {
    public int solution(int n) {
        int answer = 1;
        
        int i = 1;
        int j = 1;
        int sum = 1;
        while(j < n) {
        	if(sum > n) {
        		sum -= i;
        		i++;
        	} else if(sum < n) {
        		j++;
        		sum += j;
        	} else if(sum == n) {
        		answer++;
        		sum -= i;
        		i++;
        	}
        }
        
        return answer;
    }
}