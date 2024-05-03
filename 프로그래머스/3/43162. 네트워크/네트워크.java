class Solution {
	public static int count = 0;
	public static boolean[] visited;

	public int solution(int n, int[][] computers) {
		visited = new boolean[computers[0].length];
		for (int i = 0; i < computers.length; i++) {
			if(!visited[i]) {
				count++;
				dfs(computers, i);
			}
		}

		return count;
	}

	private void dfs(int[][] computers, int i) {
		if (visited[i]) {
			return;
		}
		visited[i] = true;
		for (int j = 0; j < computers[i].length; j++) {
			if(computers[i][j] == 1 && i != j) {
				dfs(computers, j);
			}
		}
	}
}