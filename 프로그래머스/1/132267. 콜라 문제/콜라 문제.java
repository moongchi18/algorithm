class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a) {
        	int mul = (n / a) * b;
        	answer += mul;
        	n = mul + (n % a);
        }
        return answer;
    }
}