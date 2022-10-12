import java.util.Arrays;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] answer = my_string.split("");
        String str = "";
        
        for(int i = 0; i < answer.length; i++){
            
            if(i == num1){
                str = str == "" ? answer[i] : str;
                answer[i] = answer[num2].equals(answer[i]) ? str : answer[num2];
            }else if(i == num2){
                str = str == "" ? answer[i] : str;
                answer[i] = answer[num1].equals(answer[i]) ? str : answer[num1];
            }
            
        }
        
        return String.join("", answer);
    }
}