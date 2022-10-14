class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int bowl = 0;
        for(int i = 1; i < n + 1; i++){
            if(n%i == 0 && m%i == 0){
                answer[0] = i;
            }
        }
        answer[1] = n*m/answer[0];
        return answer;
    }
}