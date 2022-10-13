import java.util.Arrays;

class Solution {
    
    public String solution(String letter) {
        String[] strArr = letter.split(" ");
        String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String answer = "";
        
        for(int i = 0; i < strArr.length; i++){
            for(int j = 0; j < mos.length; j++){
                if(strArr[i].equals(mos[j])){
                    answer += (char)(j + 97) + "";
                }
            }    
        }
        
        return answer;
    }
}