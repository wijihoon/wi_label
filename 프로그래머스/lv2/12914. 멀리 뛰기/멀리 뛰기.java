class Solution {
    public long solution(int n) {
        long[] longArr = new long[2001];
        longArr[1] = 1;
        longArr[2] = 2;

        for (int i = 3; i <= n; i++) {
            longArr[i] = (longArr[i - 1] + longArr[i - 2]) % 1234567;
        }

        return longArr[n];
    }
}