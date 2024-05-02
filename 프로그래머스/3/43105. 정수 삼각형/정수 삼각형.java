class Solution {
    public int solution(int[][] triangle) {
        int y = triangle.length;
        for (int yi = y - 1; yi > 0; yi--) {
			int xSize = triangle[yi].length - 1;
			int xi = 0;
			while(xi < xSize) {
				triangle[yi-1][xi] += Math.max(triangle[yi][xi], triangle[yi][xi + 1]);
				xi++;
			}
		}
    	return triangle[0][0];
    }
}