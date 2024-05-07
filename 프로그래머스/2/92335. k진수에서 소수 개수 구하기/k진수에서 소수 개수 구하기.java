class Solution {
	public int solution(int n, int k) {
		int answer = 0;
		String str = Integer.toString(n, k);

		String[] arr = str.split("0");
		
		Target : for (String s : arr) {
			if(s.isBlank()
					|| s.equals("1")) {
				continue;
			}
			long num = Long.parseLong(s);
			
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					continue Target;
				}
			}
			answer++;
		}
		return answer;
	}
}