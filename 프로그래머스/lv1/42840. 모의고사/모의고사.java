import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer ={};
        int [] A = {1,2,3,4,5}; //1번 수포자
        int [] B = {2,1,2,3,2,4,2,5}; //2번 수포자
        int [] C = {3,3,1,1,2,2,4,4,5,5}; //3번 수포자
        int[] ans ={0,0,0};
        int i;

        ArrayList<Integer> fin = new ArrayList<Integer>();

        //채점 단계
        for(i=0;i<answers.length;i++){
            if(answers[i] == A[i % 5]) ans[0]++;
        }
        for(i=0;i<answers.length;i++){
            if(answers[i] == B[i % 8]) ans[1]++;
        }
        for(i=0;i<answers.length;i++){
            if(answers[i] == C[i % 10]) ans[2]++;
        }

        //max는 가장 많이 문제를 맞춘 사람의 맞춘 개수?    
        int max=ans[0];
        if(ans[0]<ans[1]) max= ans[1];
        if(ans[1]<ans[2]){
            if(ans[0]<ans[2]) max= ans[2];
            else{}
        } 

        //max 가지고 있는 개수 
        for(i=0;i<3;i++) {
            if(ans[i] == max) fin.add(i+1);
        }

        int t=0;
        answer = new int[fin.size()];
        if(ans[0]== max) answer[t++]=1;
        if(ans[1]== max) answer[t++]=2;
        if(ans[2]== max) answer[t++]=3;
        return answer;
    }
}