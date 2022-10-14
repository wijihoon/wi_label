class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCnt = 0;
        
        for(int i = 0; i < lottos.length; i++){
            if(lottos[i] == 0){
                zeroCnt++; 
            }else{
                for(int j = 0; j < win_nums.length; j++){
                    if(lottos[i] == win_nums[j]){
                        answer[0]++;
                        break;
                    }
                }
            }
        }
        
        answer[1] = answer[0];
        answer[0] = answer[0] + zeroCnt >= 6 ? 6 : answer[0] + zeroCnt;
        
        switch (answer[0]){
            case 6:
                answer[0] = 1;
                break;
            case 5:
                answer[0] = 2;
                break;
            case 4:
                answer[0] = 3;
                break;
            case 3:
                answer[0] = 4;
                break;
            case 2:
                answer[0] = 5;
                break;
            default:
                answer[0] = 6;
        }
        
        switch (answer[1]){
            case 6:
                answer[1] = 1;
                break;
            case 5:
                answer[1] = 2;
                break;
            case 4:
                answer[1] = 3;
                break;
            case 3:
                answer[1] = 4;
                break;
            case 2:
                answer[1] = 5;
                break;
            default:
                answer[1] = 6;
        }
        
        return answer;
    }
}