class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;
        for(int i = 1; i <= count; i++){
            sum += price * i;
        }
        long result = sum - money;
        return (result < 0) ? 0 : result;
    }
}