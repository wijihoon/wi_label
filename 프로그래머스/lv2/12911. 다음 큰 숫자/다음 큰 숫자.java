class Solution {
    public int solution(int n) {
        int answer = n;
        int length = Integer.bitCount(n);
        
        while(true){
            answer++;
            if(length == Integer.bitCount(answer)){
                break;
            }
        }
        
        return answer;
    }
}