import java.util.*;

public class Solution {
	public int solution(int n) {
		int ans = 0;

		while (n != 0) {
			ans += n % 2;
			n /= 2;
		}

		return ans;
	}
	
	public int solution(int[] A) {
		int answer = 1;
		

		int[] result = new int[101];
		for (int i = 0; i < A.length; i++) {
			Map<Integer, Integer> map = new HashMap<>();
			int target = A[i];
			int mod = 2;
			while(target != 1 && mod <= target) {
				if(target % mod == 0) {
					if(map.containsKey(mod)) {
						map.put(mod, map.get(mod) + 1);
					} else {
						map.put(mod, 1);
					}
					target /= mod;
				} else {
					mod++;
				}
			}
			
			for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
				int key = entry.getKey();
				int val = entry.getValue();
				
				if(result[key] < val) {
					result[key] = val;
				}
			}
		}
		
		for (int i = 0; i < result.length; i++) {
			if(result[i] != 0) {
				answer *= Math.pow(i, result[i]);
			}
		}
		
		return answer;
	}
}