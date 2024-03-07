import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String s) {
        Queue<Integer> que = new LinkedList<>();
        
		String element = s.replaceAll("\\{\\{", "")
						.replaceAll("\\}\\}", "");
		String[] elements = element.split("\\},\\{");
		int[][] array = Arrays.stream(elements)
							.map(str -> str.split(","))
							.map(temp -> Arrays.stream(temp)
													.mapToInt(Integer::parseInt)
													.toArray())
							.sorted(Comparator.comparingInt(intArr -> intArr.length))
							.toArray(int[][]::new);

		for (int[] is : array) {
			List<Integer> temp = Arrays.stream(is)
										.boxed()
										.collect(Collectors.toList());
			for (int q : que) {
				int index = temp.indexOf(q);
				if(index != -1) {
					temp.remove(index);
				}
			}
			for (int t : temp) {
				que.add(t);
			}
		}
        return que.stream().mapToInt(Integer::intValue).toArray();
    }
}