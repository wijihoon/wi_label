import java.util.Collections;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for(int i = 0; i < emergency.length; i++) arrList.add(emergency[i]);
        
        Collections.sort(arrList, Collections.reverseOrder());
        
        for(int i = 0; i < emergency.length; i++){
            answer[i] = arrList.indexOf(emergency[i]) + 1;
        }
        
        return answer;
    }
}