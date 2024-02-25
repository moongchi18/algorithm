import java.util.*;

class Solution {
public int solution(int[] A, int[] B) {
		Arrays.sort(A);
		Arrays.sort(B);
		
		Deque<Integer> queA = new LinkedList<>();
		Deque<Integer> queB = new LinkedList<>();

		for (int i = 0; i < A.length; i++) {
			queA.add(A[i]);
			queB.add(B[i]);
		}
		
		int answer = 0;
		for (int i = 0; i < A.length; i++) {
			answer += queA.pollFirst() * queB.pollLast();
		}
		
		return answer;
	}
}