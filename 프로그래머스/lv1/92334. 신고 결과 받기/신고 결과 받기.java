import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        // 중복값 제거 및 [신고한ID, count] 
        Map<String, Long> blow 
            = Arrays.stream(report)
                    .distinct()
                    .collect(
                             Collectors.groupingBy(
                                                   s -> s.substring(s.indexOf(" ") + 1, s.length())
                                                   , Collectors.counting()
                                                  )
                            );
        
        // 정지 기준이 되는 신고 횟수 보단 작은 수 제거
        blow.values().removeIf(value -> value < k);
        blow.forEach((key, value) -> System.out.println(key + " : " + value));
        
        // 정지된 ID를 신고한 ID를 찾아 answer 결과 메일 횟수 증가
        String strReportKey = "";
        Arrays.stream(report).distinct().forEach(s -> {
            if(blow.containsKey(s.substring(s.indexOf(" ") + 1, s.length()))){
                answer[Arrays.asList(id_list).indexOf(s.substring(0, s.indexOf(" ")))]++;
            }
        });
        
        return answer;
    }
}