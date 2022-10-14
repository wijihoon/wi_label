class Solution {
    public int solution(String name) {
        int answer  = 0;                    //result
        int index   = 0;                    //다음 알파벳 A 카운트 활용  
        int moveCnt = name.length() - 1;    //실제 커서를 이동하는 횟수 Count (최대 = 알파벳 길이 - 1)
        
        for(int i = 0; i < name.length(); i++){
            //알파벳이 N보다 작으면 Base = A, N보다 크거나 같으면 Base = [ 기준
            answer += (int)name.charAt(i) < 78 ? (int)name.charAt(i) - (int) 'A' : (int)'[' - (int)name.charAt(i);
            
            //다음에 A가 오는지 확인을 위해 +1
            index = i + 1;  
            
            //다음 알파벳이 A라면 반복되는 A는 몇개인지 갯수 Count
            while(index < name.length() && name.charAt(index) == 'A'){
                index++;
            }
            
            //커서 이동이 왼쪽 or 오른쪽 유리한 곳 검증
            //i*2 = 뒤로 돌아가는 횟수
            //name.length() - index = 뒤로 돌아가고 A를 검너뛴 횟수
            moveCnt = Math.min(moveCnt, i * 2 + name.length() - index);
            
            //처음부터 왼쪽으로 돌아가는게 빠를 수 있기에 추가 검증
            moveCnt = Math.min(moveCnt, (name.length() - index) * 2 + i);
        }
        
        return answer + moveCnt;
    }
}