import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
	public int[] solution(String[] operations) {
		PriorityQueue<Integer> ascQue = new PriorityQueue<>();
		PriorityQueue<Integer> descQue = new PriorityQueue<>(Comparator.reverseOrder());

		for (String op : operations) {
			if (op.startsWith("I")) {
				int num = Integer.parseInt(op.substring(2));
				ascQue.add(num);
				descQue.add(num);
			} else {
				if (op.equals("D 1")) {
					ascQue.remove(descQue.poll());
				} else if (op.equals("D -1")) {
					descQue.remove(ascQue.poll());
				}
			}
		}
		int[] result = new int[] { 0, 0 };
		if (ascQue.size() > 1) {
			result[0] = descQue.poll();
			result[1] = ascQue.poll();
		}
		return result;
	}
}