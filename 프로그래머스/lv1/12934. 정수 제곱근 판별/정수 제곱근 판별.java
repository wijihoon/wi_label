class Solution {
    public long solution(long n) {
        long answer = n == Math.pow((int)Math.sqrt(n), 2) ? (long)Math.pow((int)Math.sqrt(n) + 1, 2) : -1;
        return answer;
    }
}