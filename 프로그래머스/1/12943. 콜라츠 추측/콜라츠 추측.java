class Solution {
    public int solution(int num) {
    	int count = 0;
    	while(num != 1 && count < 500) {
    		boolean isEven = (num % 2 == 0); 
    		boolean isOdd = (num % 2 == 1); 
    		if(isEven) {
    			num /= 2;
    		} else if(isOdd) {
    			num = (num * 3) + 1;
    		}
    		count++;
    	}
        return count == 500 ? -1:count;
    }
}