import java.lang.Math;

class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        while(a != b){
            answer++;
            a = (int) Math.ceil((double) a / 2);
            b = (int) Math.ceil((double) b / 2);
        }
        return answer;
    }
}