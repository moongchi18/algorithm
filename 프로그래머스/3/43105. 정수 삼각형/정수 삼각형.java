class Solution {
    public int solution(int[][] triangle) {
        int y = triangle.length;
        for (int yi = y - 1; yi > 0; yi--) {
			int xSize = triangle[yi].length - 1;
			int xIndex = 0;
			while(xIndex < xSize) {
				triangle[yi-1][xIndex] += Math.max(triangle[yi][xIndex], triangle[yi][xIndex + 1]);
				xIndex++;
			}
		}
    	return triangle[0][0];
    }
}