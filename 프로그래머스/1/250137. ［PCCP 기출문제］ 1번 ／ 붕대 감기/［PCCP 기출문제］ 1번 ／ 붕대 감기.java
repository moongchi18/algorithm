class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        
        int lastAttackTime = attacks[attacks.length-1][0];
        int attackTimes = 0;
        int healTimes = 0;
        
        int nowHealth = health;
        for(int i = 1; i <= lastAttackTime; i++) {
        	if(i == attacks[attackTimes][0]) {
        		nowHealth -= attacks[attackTimes++][1];
        		healTimes = 0;
        	} else {
        		nowHealth += bandage[1];
        		healTimes++;
        		if(healTimes == bandage[0]) {
        			nowHealth += bandage[2];
        			healTimes = 0;
        		}
        		
        		if(nowHealth > health) {
        			nowHealth = health;
        		}
        	}
            if(nowHealth <= 0) {
        		return -1;
        	}
        }
        
        return nowHealth <= 0 ? -1:nowHealth;
    }
}