class Solution {
    public String solution(int n) {
    	char[] ref = new char[] {'수','박'};
    	char[] result = new char[n];
    	for (int i = 0; i < result.length; i++) {
			result[i] = ref[i % 2];
		}
    	return String.valueOf(result);
    }
}