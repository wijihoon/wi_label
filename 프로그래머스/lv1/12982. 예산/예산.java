import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int blow = 0;
        Arrays.sort(d);
        for(int i = 0; i < d.length; i++){
            blow += d[i];
            if(blow == budget){
                return answer = ++i;
            }else if(blow > budget){
                return answer = i;
            }else{
                answer = i + 1;
            }
        }
        return answer;
    }
}