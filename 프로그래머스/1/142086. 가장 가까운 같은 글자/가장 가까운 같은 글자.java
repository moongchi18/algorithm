import java.util.*;

class Solution {
    public int[] solution(String s) {
        List<Character> list = new ArrayList<>();
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
			int index = list.lastIndexOf(s.charAt(i));
			if(index == -1) {
				arr[i] = index;
			} else {
				arr[i] = i - index;
			}
			list.add(s.charAt(i));
		}
        return arr;
    }
}