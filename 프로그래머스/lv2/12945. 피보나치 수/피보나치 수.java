import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        
        //F(n) = F(n-1) + F(n-2)
        //자바의 int, long, bigint 등 범위를 월등히 초과함으로 매 계산마다 나눈 값을 보관
        for(int i = 2; i < n+1; i++){
            arr[i] = (arr[i-2] + arr[i-1])%1234567;
        }
        return answer = arr[n];
    }
}