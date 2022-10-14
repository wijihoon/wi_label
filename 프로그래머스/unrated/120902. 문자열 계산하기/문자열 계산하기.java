class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String operator = "";
        String[] strArr = my_string.split(" ");
        answer = Integer.parseInt(strArr[0]);
        
        for(int i = 1; i < strArr.length; i++){
            if(i % 2 == 0){
                if("+".equals(operator)){
                    answer += Integer.parseInt(strArr[i]);
                }else{
                    answer -= Integer.parseInt(strArr[i]);
                }
            }else{
               operator = strArr[i]; 
            }
        }
        return answer;
    }
}