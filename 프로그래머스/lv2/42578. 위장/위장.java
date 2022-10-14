import java.util.Arrays;
//((한 종류의 이름의 수 + 1(해당 옷을 입지않을 경우의 수)) * (각 종류의 이름의 수 + 1)) -1 (반드시 한 개의 의상은 입어야함)
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        int sameKindOfClothesCnt = 1; // 한 종류의 이름의 수
        clothesSort(clothes); // 다차원 배열 sort
        for(int i = 0; i < clothes.length - 1; i++){
            if(clothes[i][1].equals(clothes[i+1][1])) sameKindOfClothesCnt++;
            else {
                if(sameKindOfClothesCnt != 1){
                    answer *= sameKindOfClothesCnt + 1;
                    sameKindOfClothesCnt = 1;
                }else{
                    answer *= sameKindOfClothesCnt + 1;
                }
            }
        }
        answer *= sameKindOfClothesCnt + 1;
        return answer - 1;
    }
    public String[][] clothesSort(String[][] clothes){
        Arrays.sort(clothes, (num1, num2) -> {
            return num1[1].compareTo(num2[1]);
		});
        return clothes;
    }
}