class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder builder = new StringBuilder();
        
        // 3진수 변환 
        builder.append(Integer.toString(n, 3));
        // 값 반전
        builder.reverse();
        
        // 10진수 변환
        int a = builder.length()-1;
        for (int i=0;i< builder.length();i++){
            int before = Integer.parseInt(builder.substring(i, i + 1)); 
            answer += before * Math.pow(3,a);
            a--; 
        } 
        
        return answer;
    }
}