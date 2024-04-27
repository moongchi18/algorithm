import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] A = new int[] {1, 2, 3, 4, 5};
        int[] B = new int[] {2, 1, 2, 3, 2, 4, 2, 5};
        int[] C = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int aSize = A.length;
        int bSize = B.length;
        int cSize = C.length;

        int a = 0;
        int b = 0;
        int c = 0;
        
        for (int i = 0; i < answers.length; i++) {
			if(answers[i] == A[i % aSize]) a++;
			if(answers[i] == B[i % bSize]) b++;
			if(answers[i] == C[i % cSize]) c++;
		}
        answer.add(a);
        answer.add(b);
        answer.add(c);
        int max = Math.max(Math.max(a, b), c);
        for (int j = 0; j < answer.size(); j++) {
			if(answer.get(j) == max) {
				answer.set(j, j+1);
			} else {
				answer.set(j, 0);
			}
		}
        return answer.stream()
        			.filter(i -> i > 0)
        			.mapToInt(Integer::intValue)
        			.toArray();
    }
}