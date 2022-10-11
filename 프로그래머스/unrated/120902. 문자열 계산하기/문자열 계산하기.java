class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String operator = "";
        String[] strArr = my_string.split(" ");
        
        for(String str : strArr){
            if("+".equals(str) || "-".equals(str)){
                operator = str;
            }else{
                if("+".equals(operator)){
                    answer += Integer.parseInt(str);
                }else if("-".equals(operator)){
                    answer -= Integer.parseInt(str);
                }else{
                    answer = Integer.parseInt(str);
                }
            }
        }
        return answer;
    }
}