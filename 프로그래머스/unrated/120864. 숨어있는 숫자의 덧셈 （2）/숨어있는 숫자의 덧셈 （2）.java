class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        my_string = my_string.replaceAll("[a-z|A-Z]", " ").trim();
        
        for(String str : my_string.split(" ")){
            if(!"".equals(str)){
                answer += Integer.parseInt(str);
            }
        }
        
        return answer;
    }
}