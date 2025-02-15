class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int totalLength = toSeconds(video_len);
        int currentPosition = toSeconds(pos);
        int openingStartTime = toSeconds(op_start);
        int openingEndTime = toSeconds(op_end);
        
        for(String command : commands) {
            if(currentPosition >= openingStartTime && currentPosition <= openingEndTime) {
                currentPosition = openingEndTime;
            }
            if("prev".equals(command)){
                currentPosition -= 10;
                if(currentPosition < 0) {
                    currentPosition = 0;
                }
            }
            if("next".equals(command)){
                currentPosition += 10;
                if(currentPosition > totalLength) {
                    currentPosition = totalLength;
                }
            }
        }
        if(currentPosition >= openingStartTime && currentPosition <= openingEndTime) {
            currentPosition = openingEndTime;
        }
        
        String answer = toStringTime(currentPosition);
        return answer;
    }

    private String toStringTime(int currentPosition) {
        int minute = currentPosition / 60;
        int second = currentPosition % 60;
        return String.format("%02d:%02d", minute, second);
    }

    private int toSeconds(String videoLen) {
        String[] arr = videoLen.split(":");
        int minute = Integer.parseInt(arr[0]);
        int second = Integer.parseInt(arr[1]);
        return minute * 60 + second;
        
    }
}