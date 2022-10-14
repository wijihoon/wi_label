class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        int cnt = 0;
        
        for(int i = 0; i < dic.length; i++){
            for(int j = 0; j < spell.length; j++){
                if(dic[i].indexOf(spell[j]) > -1){
                    cnt++;
                }else{
                    break;
                }
            }
            if(cnt == spell.length) answer++;
            cnt = 0;
        }
        return answer == 0 ? 2 : answer;
    }
}