class Solution {
    public int solution(int n) {
        int answer = 0, cnt = 0;
        
        while (answer <= n){
            answer = factorial(++cnt);
        }
        
        return --cnt;
    }
    
    private int factorial(int n) {
        
        int result = 1;
        for(int i = n; i > 1; i--){
            result *= i;
        }
        
        return result;
    }
}