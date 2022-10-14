function solution(a, b) {
    let answer = '';
    let day = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    let bowl = b - 1;
    let dayOfTheWeek = ["FRI","SAT","SUN","MON","TUE","WED","THU"];
        for(let i = 0; i < a - 1; i++){
            bowl += day[i];
        }
    return answer = dayOfTheWeek[(bowl % 7)];
}