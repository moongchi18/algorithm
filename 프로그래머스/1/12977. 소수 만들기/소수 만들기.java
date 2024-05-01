import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> sumList = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i+1; j < nums.length - 1; j++) {
				for (int k = j+1; k < nums.length; k++) {
					sumList.add(nums[i] + nums[j] + nums[k]);
				}
			}
		}
        System.out.println(sumList.toString());
        for (Integer i : sumList) {
        	double sqrt = Math.sqrt(i);
        	if(sqrt % 1 == 0) {
        		continue;
        	}
			int count = 0;
        	for (int j = 1; j <= sqrt; j++) {
				if(i % j == 0) {
					count++;
					if(count > 1) {
						break;
					}
				}
			}
        	if(count == 1) {
        		answer++;
        	}
		}

        return answer;
    }
}