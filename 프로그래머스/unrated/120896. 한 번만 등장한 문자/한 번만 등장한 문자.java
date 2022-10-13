import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] answer = Arrays.stream(s.split("")).sorted().toArray(String[]::new);
        String result = "";
        int cnt = 0;
        
        for(int i = 0; i < answer.length; i++){
            for(int j = i + 1; j < answer.length; j++){
                if(answer[i].equals(answer[j])) cnt++;
            }
            if(cnt == 0) result += answer[i];
            i += cnt;
            cnt = 0;
        }
        
        //if(!answer[answer.length - 2].equals(answer[answer.length - 1])) result += answer[answer.length - 1];
        
        return result;
    }
}