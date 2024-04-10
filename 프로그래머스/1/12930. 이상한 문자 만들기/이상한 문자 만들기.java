import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ", -1);
        for (String str : arr) {
			char[] charArr = str.toCharArray();
			for (int i = 0; i < charArr.length; i++) {
				if(i % 2 == 0) {
					charArr[i] = Character.toUpperCase(charArr[i]);
				} else {
					charArr[i] = Character.toLowerCase(charArr[i]);
				}
			}
			sb.append(String.valueOf(charArr)).append(" ");
		}
        String result = sb.toString();
    	return result.substring(0, result.length()-1);
    }
}