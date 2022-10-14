import java.lang.Math;

class Solution {
    static int N, SUM;
    
    public int solution(int[][] triangle) {
        int answer = triangle[0][0];
        int[] depth; 
        
        //depth 별 처음 컬럼 합산, 마지막 컬럼 합산
        for(int i = 1; i < triangle.length; i++){
            triangle[i][0] += triangle[i - 1][0];
            triangle[i][triangle[i].length - 1] += triangle[i - 1][triangle[i - 1].length - 1];
        }
        
        for(int i = 1; i < triangle.length; i++){
            for(int j = 1; j < triangle[i].length - 1; j++){
                triangle[i][j] = Math.max(triangle[i][j] + triangle[i - 1][j - 1]
                                        , triangle[i][j] + triangle[i - 1][j]);
                
                answer = Math.max(answer, triangle[i][j]);
            }
        }
        
        return answer;
    }
}