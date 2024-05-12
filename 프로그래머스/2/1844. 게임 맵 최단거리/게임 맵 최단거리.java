import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int answer = -1;

        // bfs
        Queue<Coordinate> q = new LinkedList<>();
        q.add(new Coordinate(0, 0, 1));
        maps[0][0] = 0;

        while (!q.isEmpty()) {
            Coordinate cur = q.poll();
            int x = cur.getX();
            int y = cur.getY();
            int moves = cur.getMoves();

            if (x == n - 1 && y == m - 1) {
                answer = moves;
                break;
            }

            for (int d = 0; d < 4; d++) {
                int px = x + dx[d];
                int py = y + dy[d];
                if (0 <= px && px < n && 0 <= py && py < m) {
                    if (maps[px][py] == 1) {
                        maps[px][py] = 0; // visited 
                        q.add(new Coordinate(px, py, moves + 1));
                    }
                }
            }
        }
        return answer;
    }

    class Coordinate {
        int x;
        int y;
        int moves;

        public Coordinate(int x, int y, int moves) {
            this.x = x;
            this.y = y;
            this.moves = moves;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getMoves() {
            return moves;
        }
    }
}