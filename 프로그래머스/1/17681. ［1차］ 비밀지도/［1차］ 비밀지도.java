import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        List<String> bineryArr1 = Arrays.stream(arr1)
	        							.boxed()
	        							.map(Integer::toBinaryString)
	        							.collect(Collectors.toList());
        List<String> bineryArr2 = Arrays.stream(arr2)
										.boxed()
										.map(Integer::toBinaryString)
										.collect(Collectors.toList());
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
        	String target1 = bineryArr1.get(i);
        	String target2 = bineryArr2.get(i);
        	StringBuilder sb = new StringBuilder();
        	if(target1.length() != n) {
        		char[] add = new char[n - target1.length()];
        		Arrays.fill(add, '0');
        		target1 = String.valueOf(add) + target1;
        	}
        	if(target2.length() != n) {
        		char[] add = new char[n - target2.length()];
        		Arrays.fill(add, '0');
        		target2 = String.valueOf(add) + target2;
        	}
        	
        	for (int j = 0; j < n; j++) {
				if (target1.charAt(j) == '0'
						&& target1.charAt(j) == target2.charAt(j)) {
					sb.append(' ');
				} else {
					sb.append('#');
				}
			}
        	result[i] = sb.toString();
		}
    	return result;
    }
}