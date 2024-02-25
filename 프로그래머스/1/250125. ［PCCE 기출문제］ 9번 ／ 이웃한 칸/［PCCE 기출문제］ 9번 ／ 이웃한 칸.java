class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        String target = board[h][w];
        
        if(h > 0) {
        	answer = target.equals(board[h-1][w]) ? ++answer:answer;
        }
        if(h < board.length-1) {
        	answer = target.equals(board[h+1][w]) ? ++answer:answer;
        }
        
        if(w > 0) {
        	answer = target.equals(board[h][w-1]) ? ++answer:answer;
        }
        
        if(w < board[0].length-1) {
        	answer = target.equals(board[h][w+1]) ? ++answer:answer;
        }
        
        
        return answer;
    }
}