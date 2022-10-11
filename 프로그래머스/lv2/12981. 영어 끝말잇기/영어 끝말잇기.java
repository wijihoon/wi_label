import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        list.add(words[0]);
        for(int idx=1; idx<words.length; idx++){
            String last = list.get(list.size()-1);
            String now = words[idx];
            if(!list.contains(now) && last.charAt(last.length()-1) == now.charAt(0)){
                list.add(now);
            }else{
                answer[0] = idx % n + 1;
                answer[1] = idx / n + 1;
                break;
            }
        }

        return answer;
    }
}