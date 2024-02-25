class Solution {
    public int[] solution(int brown, int yellow) {
    	int sum = brown + yellow;
    	
    	int x = 1;
    	int y = 1;
    	
    	for (y = 1; y <= (int) Math.sqrt(sum); y++) {
			if(sum % y == 0) {
				x = sum / y;
				if(((x-2) * (y-2)) == yellow) {
					break;
				}
			}
		}
    	return new int[] {x, y};
    }
}