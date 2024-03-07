import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String s) {
        Queue<Integer> que = new LinkedList<>();
        
		String temp = s.replaceAll("\\{\\{", "")
						.replaceAll("\\}\\}", "");
		String[] stringTypeIntArray = temp.split("\\},\\{");
        List<List<Integer>> listList = Arrays.stream(stringTypeIntArray)
						                .map(str -> Arrays.stream(str.split(","))
						                        .map(Integer::parseInt)
						                        .collect(Collectors.toList()))
						                .sorted(Comparator.comparingInt(List::size))
						                .collect(Collectors.toList());

		for (List<Integer> list : listList) {
			for (int q : que) {
				int index = list.indexOf(q);
				if(index != -1) {
					list.remove(index);
				}
			}
			for (int l : list) {
				que.add(l);
			}
		}
        return que.stream()
        			.mapToInt(Integer::intValue)
        			.toArray();
    }
}
