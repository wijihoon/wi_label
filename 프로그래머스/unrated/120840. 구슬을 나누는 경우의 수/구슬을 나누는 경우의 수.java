class Solution {
    static int[] intArr;
    static int N;
    static int answer;
    
    public int solution(int balls, int share) {
        intArr = new int[balls];
        N = share;
        
        rec_func(0, 0);
        return answer;
    }
    static void rec_func(int n, int k){
        if(n == N){
            answer++;
        }else{
            for(int i = k; i < intArr.length; i++){
                if(intArr[i] != 1){
                    intArr[i] = 1;
                    rec_func(n + 1, i);
                    intArr[i] = 0;
                }
            }
        }
    }
}