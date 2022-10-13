class Solution {
    public int[] solution(int n, int s) {
        if(n > s)
            return new int[]{-1};
        int[] answer = new int[n];
        int t = s / n;
        int sum = s - (t * n);
        for(int i = 0; i < n; i++){
            if(i >= n - sum)
                answer[i] = t + 1;
            else
                answer[i] = t;
        }
        return answer;
    }
}