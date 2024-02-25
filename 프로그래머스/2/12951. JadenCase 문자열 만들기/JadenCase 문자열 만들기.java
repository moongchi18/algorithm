class Solution {
    public String solution(String s) {
        String[] array = s.split(" ");
        
        for (String string : array) {
			System.out.println(string + ", " + string.equals(""));
		}
        
        StringBuilder sb = new StringBuilder();
        for(String target : array) {
        	if(target.equals("")) {
        		sb.append(" ");
        		continue;
        	}
        	char[] temp = target.toLowerCase().toCharArray();
        	if(Character.isLetter(target.charAt(0))) {
        		temp[0] = Character.toUpperCase(temp[0]);
        	}
        	sb.append(String.valueOf(temp));
        	sb.append(" ");
        }
        
        return String.valueOf(sb.toString().substring(0, s.length()));
    }
}