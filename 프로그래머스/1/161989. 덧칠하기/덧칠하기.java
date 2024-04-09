class Solution {
    public int solution(int n, int m, int[] section) {
        int current = section[0] + m;
        int count = 1;
        for (int i = 1; i < section.length; i++) {
			if(current <= section[i]) {
				count++;
				current = section[i] + m;
			}
		}
    	return count;
    }
}