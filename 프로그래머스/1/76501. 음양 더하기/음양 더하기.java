class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < signs.length; i++) {
        	Abs abs = new Abs(absolutes[i], signs[i]);
			answer += abs.abs();
		}
        return answer;
    }
    
    static class Abs {
    	private int num;
    	private boolean isPlus;
    	
    	public Abs(int v, boolean b) {
    		this.num = v;
    		this.isPlus = b;
    	}
    	
    	public int abs() {
        	if(!isPlus) {
        		num = num * (-1);
        	}
        	return num;
        }
    }
}