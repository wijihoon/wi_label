class Solution {
    public int solution(int n) {
        int answer = 0;
        int bowl = (int)Math.sqrt(n);
        if(n > 0){
            for(int i = 1; i <= bowl; i++){
                if(n%i == 0){
                    if(i == n/i) answer += i;
                    else answer += i + (n/i);
                }
            }    
        }
        return answer;
    }
}