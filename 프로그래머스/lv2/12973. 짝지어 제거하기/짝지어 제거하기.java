import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stc = new Stack();
        stc.push(s.charAt(0));
        
        for(int i = 1; i < s.length(); i++){
            if(stc.size() > 0 && s.charAt(i) == stc.peek()){
                stc.pop();
            }else{
                stc.push(s.charAt(i));
            }
            
        }
        return stc.size() == 0 ? 1 : 0;
    }
}

