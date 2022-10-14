class Solution {
    public String solution(int n) {
        StringBuffer answer = new StringBuffer();
        
        String[] chgStr = {"4", "1", "2"};
        
        while(n > 0){
            answer.insert(0, chgStr[n%3]);
            n = (n-1)/3;  
        }
        
        return answer.toString();
    }
}