import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
    	return s.chars()
        		.boxed()
        		.sorted(Comparator.reverseOrder())
        		.map(i -> Character.toString((char) i.intValue()))
        		.collect(Collectors.joining());
        		
    }
}