import java.util.ArrayList;

class Solution {
    public int solution(String s) {
        int index = 0;
        int answer = 0;
        ArrayList<String> arrList = new ArrayList();
        
        while(index < s.length()){
            
            arrList = new ArrayList();
            
            for(String str : s.split("")) arrList.add(str);
            
            for(int i = 0; i < arrList.size(); i++){
                s = s.replaceAll("\\(\\)", "");
                s = s.replaceAll("\\{\\}", "");
                s = s.replaceAll("\\[\\]", "");
                
                if("".equals(s)){
                    answer++;
                    break;
                }
            }
            
            arrList.add(arrList.remove(0));
            
            s = String.join("", arrList);
            
            index++;
        }
        return answer;
    }
}