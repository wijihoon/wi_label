class Solution {
    public int solution(long num) {
        int answer = -1;
        for(int i = 0; i < 500; i++){
            if(num != 1){
                if(num%2 == 0) num /= 2;
                else num = (num * 3) + 1;
            }else return i;
        }
        return answer;
    }
}