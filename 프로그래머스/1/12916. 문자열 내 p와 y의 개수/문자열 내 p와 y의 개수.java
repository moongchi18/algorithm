class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        String temp = s.toLowerCase();
        if(!temp.contains("y") 
        		&& !temp.contains("p")) {
        	return true;
        }
        
        char[] arr = temp.toCharArray();
        int pCount = 0;
        int yCount = 0;
        for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 'p') {
				pCount++;
			} else if(arr[i] == 'y') {
				yCount++;
			}
		}

        return pCount == yCount;
    }
}