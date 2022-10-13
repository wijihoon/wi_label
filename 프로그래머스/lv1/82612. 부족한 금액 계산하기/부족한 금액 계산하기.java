class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        for(int i = 1; i < count + 1; i++){
            answer += i*price;
        }
        return answer - money + 1 <= 0 ? 0 : answer - money + 1; 
    }
}