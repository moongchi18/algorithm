class Solution {
    public int[] solution(String s) {
        int transformTimes = 0;
        int deleteCount = 0;
        
        while(s.length() != 1) {
        	int prevLength = s.length();
        	
        	transformTimes++;
        	
        	s = s.replaceAll("0", "");
        	
        	int afterLength = s.length();
        	deleteCount += prevLength - afterLength;
        	
        	s = Integer.toBinaryString(s.length());
        }
        
        return new int[] {transformTimes, deleteCount};
    }
}