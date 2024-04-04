import java.util.*;

class Solution {
    public String solution(String s) {
    	char[] temp = s.toCharArray();
    	Arrays.sort(temp);
    	StringBuilder sb = new StringBuilder(String.valueOf(temp));
    	return sb.reverse()
        		.toString();
    }
}