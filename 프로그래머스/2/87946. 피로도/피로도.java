class Solution {
	boolean[] isVisit;
	int[][] dungeons;
	public int solution(int k, int[][] dungeons) {
		isVisit = new boolean[dungeons.length];
		this.dungeons = dungeons;

		return bruteForce(k);
	}

	private int bruteForce(int k) {
		int ans = 0;

		for (int i = 0; i < dungeons.length; i++) {
			if (!isVisit[i] && k >= dungeons[i][0]) {
				isVisit[i] = true;
				ans = Math.max(ans, bruteForce(k - dungeons[i][1]));
				isVisit[i] = false;
			}
		}

		return Math.max(ans, countAdventure());
	}

	private int countAdventure() {
		int count = 0;
		for (boolean visit : isVisit) {
			if (visit) {
				count++;
			}
		}
		return count;
	}
}