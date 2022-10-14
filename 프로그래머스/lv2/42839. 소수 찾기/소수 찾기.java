import java.util.*;
import java.util.stream.*;
class Solution {
    static boolean[] search           = new boolean[7];
    static ArrayList<Integer> arrList = new ArrayList<>();
    
    public int solution(String numbers) {
        int answer = 0;
        
        for(int i = 0; i < numbers.length(); i++){
            dfs(numbers, "", i+1);
        }
        
        answer = (int)arrList.stream().filter(a -> a > 1)
                                      .filter(a -> IntStream.range(2, a).allMatch(i -> a%i != 0))
                                      .count();
            
        return answer;
    }
    
    public void dfs(String numbers, String temp, int len){
        
        if(temp.length() == len){
            if(!arrList.contains(Integer.parseInt(temp))){
                arrList.add(Integer.parseInt(temp));
            }
        }else{
            for(int i = 0; i < numbers.length(); i++){
                if(!search[i]){
                    search[i] = true;
                    temp += numbers.charAt(i);
                    dfs(numbers, temp, len);
                    search[i] = false;
                    temp = temp.substring(0, temp.length()-1);
                }
            }
        }
    }
}