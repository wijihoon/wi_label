import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Integer[] citationss = Arrays.stream(citations).boxed().toArray(Integer[]::new); // int형 -> Integer형변환
        Arrays.sort(citationss, (a,b) -> b - a); // 배열 내림차순 정렬 시 int(x) Integer(o)
        for(int i = 0; i < citationss.length; i++){
            if((i + 1) > citationss[i]){
                return i;
            }
        }
        return answer == 0 ? citationss.length : answer;
    }
}