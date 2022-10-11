import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] strArr = s.split(" ");
        Stack<String> stack = new Stack();
        for(int i = 0; i < strArr.length; i++){
            stack.push(strArr[i]);
            
            if("Z".equals(stack.peek())){
                
                stack.pop();
                
                if(stack.size() > 0){
                    answer -= Integer.parseInt(stack.pop());
                }
                
            }else{
                answer += Integer.parseInt(strArr[i]);
            }
        }
        
        return answer;
    }
}