class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int blow = 0;
        int beforeBlow = 0;
        
        for(int i = 0; i < dartResult.length(); i++){
            //대문자
            //System.out.println(dartResult.charAt(i) + " = " + (int)dartResult.charAt(i));
            if((int)dartResult.charAt(i) > 67){
                if((int)dartResult.charAt(i) == 68){//D
                    blow = (int)Math.pow(blow, 2);
                }else if((int)dartResult.charAt(i) == 84){//T
                    blow = (int)Math.pow(blow, 3);
                }
                answer += blow;
            }
            //숫자
            else if((int)dartResult.charAt(i) > 47){
                beforeBlow = blow;
                if(i > 0 && (int)dartResult.charAt(i-1) > 47
                  && (int)dartResult.charAt(i-1) < 57){
                    blow = Integer.parseInt(blow + dartResult.substring(i, i+1));
                }else{
                    blow = Integer.parseInt(dartResult.substring(i, i+1));
                }
            }
            //특수문자
            else{
                if((int)dartResult.charAt(i) == 35){//#
                    blow *= -1;
                    answer += 2 * blow;
                }else{//*
                    answer += beforeBlow;
                    answer += blow;
                    blow *= 2;
                }
            }
        }
        return answer;
    }
}