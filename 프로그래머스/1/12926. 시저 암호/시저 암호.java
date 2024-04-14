class Solution {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
        	char temp = arr[i];
        	if(Character.isUpperCase(temp)) {
        		int num = (temp - 65 + n) % 26;
        		arr[i] = (char) (num + 65);
        	} else if(Character.isLowerCase(temp)) {
        		int num = (temp - 97 + n) % 26;
        		arr[i] = (char) (num +97);
        	}
		}
        
        return String.valueOf(arr);
    }
}