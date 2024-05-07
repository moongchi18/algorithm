class Solution {
	public int solution(int n, int k) {
		int answer = 0;
		String str = decimalToBase(n, k);

		String[] arr = str.split("0");
		
		for (String s : arr) {
			if(s.isBlank()
					|| s.equals("1")) {
				continue;
			}
			long num = Long.parseLong(s);
			
			int modCount = 0;
			for (int i = 1; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					modCount++;
				}
			}
			if (modCount == 1) {
				answer++;
			}
		}
		return answer;
	}

	public static String decimalToBase(int decimal, int mod) {
		StringBuilder result = new StringBuilder();
		while (decimal > 0) {
			result.insert(0, decimal % mod);
			decimal /= mod; // 몫을 새로운 값으로 갱신
		}

		return result.toString();
	}
}