class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int blow = 0;
        int cnt = 0;
        
        for(int i = 0; i < right - left + 1; i++){
            cnt = 0;
            blow = left + i;
            
            for(int j = 1; j <= blow; j ++){
                if(blow % j == 0) cnt++;
            }
            
            if(cnt % 2 == 0) answer += blow;
            else answer -= blow;
        }
        
        return answer;
    }
}