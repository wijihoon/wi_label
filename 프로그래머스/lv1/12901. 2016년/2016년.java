class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int bowl = b - 1;
        String[] dayOfTheWeek = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        for(int i = 0; i < a - 1; i++){
            bowl += day[i];
        }
        System.out.println("bowl = " + bowl);
        System.out.println("bowl % 7 = " + (bowl % 7));
        return answer = dayOfTheWeek[(bowl % 7)];
    }
}