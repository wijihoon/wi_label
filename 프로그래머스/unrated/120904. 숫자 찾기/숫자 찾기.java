class Solution {
    public int solution(int num, int k) {
        int answer = Integer.toString(num)
                      .indexOf(Integer.toString(k));
        
        return answer > -1 ? ++answer : answer;
    }
}