import java.lang.Math;
import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0], num = n;
        
        Arrays.sort(array);
        
        for(int i = array.length - 1; i >= 0; i--){
            if(num >= Math.abs(array[i] - n)){
                num = Math.abs(array[i] - n);
                answer = array[i];
            }   
        }
        
        return answer;
    }
}