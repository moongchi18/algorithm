class Solution {
    public String solution(int n) {
        String su="";
        for(int i=0;i<n;i++){
            if(i%2==0){
                su = su+"수";
            }
            else if(i%2!=0){
                su = su+"박";
            }
        }
        return su;
    }
}