import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(String s) {
        
        s = s.replaceAll("\\{\\{", "").replaceAll("\\}\\}", "");
        
        String[] strArr = s.split("\\},\\{");
        
        strArr = Arrays.stream(strArr).sorted((o1, o2) -> {
                                                return o1.length() - o2.length();
                                            }).toArray(String[]::new);
        
        ArrayList<Integer> answer = new ArrayList<>();
        String[] tuple;
        
        for(String str : strArr){
            tuple = str.split(",");
            
            for(int j = 0; j < tuple.length; j++){
                if(!answer.contains(Integer.parseInt(tuple[j]))){
                    answer.add(Integer.parseInt(tuple[j]));
                    break;
                }
            }
        }
        
        return answer.stream().mapToInt(Integer::valueOf).toArray();
    }
}