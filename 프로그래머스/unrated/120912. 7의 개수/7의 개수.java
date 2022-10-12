class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i : array){
            for(String str : Integer.toString(i).split("")){
                if("7".equals(str)) answer++;
            }
        }
        
        return answer;
    }
}