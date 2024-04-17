class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
    	String[] str = new String[n];
    	String regex = "%" + n + "s";
    	for (int i = 0; i < n; i++) {
			String temp = Integer.toBinaryString(arr1[i] | arr2[i]);
			temp = String.format(regex, temp);
			temp = temp.replaceAll("1", "#");
			temp = temp.replaceAll("0", " ");
			str[i] = temp;
		}
    	return str;
    }
}