import java.util.Arrays;

class Solution {
    public String solution(String s) {
        int[] array = Arrays.stream(s.split(" "))
        		.mapToInt(Integer::parseInt)
        		.sorted()
        		.toArray();
        
        for(int i : array){
            System.out.println(i);
        }
        
        return String.format("%d %d", array[0], array[array.length-1]);
    }
}