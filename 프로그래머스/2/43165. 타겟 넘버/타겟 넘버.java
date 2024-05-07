import java.util.Arrays;

class Solution {
    int n;
    int[] result;
    int answer;

    public int solution(int[] numbers, int target) {
        answer = 0;
        n = numbers.length;
        result = new int[n];
        dfs(0, numbers, target);

        return answer;
    }

    private void dfs(int depth, int[] numbers, int target) {
        if (n == depth) {
            if (Arrays.stream(result).sum() == target)
                answer++;
            return;
        }

        result[depth] = numbers[depth];
        dfs(depth + 1, numbers, target);

        result[depth] = -numbers[depth];
        dfs(depth + 1, numbers, target);
    }
}