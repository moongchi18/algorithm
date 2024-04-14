class Solution {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
        	char temp = arr[i];
        	if(Character.isUpperCase(temp)) {
        		int alpIndex = (temp - 'A' + n) % 26;
        		arr[i] = (char) (alpIndex + 'A');
        	} else if(Character.isLowerCase(temp)) {
        		int alpIndex = (temp - 'a' + n) % 26;
        		arr[i] = (char) (alpIndex + 'a');
        	}
		}
        
        return String.valueOf(arr);
    }
}