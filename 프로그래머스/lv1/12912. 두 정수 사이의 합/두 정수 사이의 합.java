class Solution {

    public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    public long sumAtoB(long min, long max) {
        return (max - min + 1) * (max + min) / 2;
    }
}