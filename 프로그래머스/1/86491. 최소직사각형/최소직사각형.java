import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int max0 = 0;
        int max1 = 0;
        for (int[] is : sizes) {
			Arrays.sort(is);
			if(max0 < is[0]) max0 = is[0];
			if(max1 < is[1]) max1 = is[1];
		}
        return max0 * max1;
    }
}