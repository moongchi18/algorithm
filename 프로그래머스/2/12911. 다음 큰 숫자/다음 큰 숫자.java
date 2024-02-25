class Solution {
	public int solution(int n) {
		int oneCount = Integer.bitCount(n);
		
		int temp = n;
		while(true) {
			temp++;
			if(Integer.bitCount(temp) == oneCount) return temp;
		}
    }
}