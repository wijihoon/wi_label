class Solution {
    public String solution(String rsp) {
        String[] answer = rsp.split("");
        
        for(int i = 0; i < answer.length; i++){
           answer[i] = "2".equals(answer[i]) ? "0"
                     : "0".equals(answer[i]) ? "5"
                     : "2"; 
        }
        
        return String.join("", answer);
    }
}