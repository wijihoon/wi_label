import java.lang.Math;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = 0, min = 0;
        for(int i = 0; i < sizes.length; i++){
            max = max < Math.max(sizes[i][0], sizes[i][1]) ? Math.max(sizes[i][0], sizes[i][1]) : max;
            min = min < Math.min(sizes[i][0], sizes[i][1]) ? Math.min(sizes[i][0], sizes[i][1]) : min;
        }
        return max * min;
    }
}