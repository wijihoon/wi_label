import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int i = 2;
        ArrayList<Integer> arrList = new ArrayList<>();
        
        while(n > 1){
            if(n % i == 0){
                arrList.add(i);
                n /= i;
            }else{
                i++;
            }
        }
        
        return arrList.stream().sorted().distinct().mapToInt(Integer::valueOf).toArray();
    }
}