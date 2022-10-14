function solution(numbers) {
    let answer = [];
    for(let i = 0; i < numbers.length; i++){
        for(let j = i + 1; j < numbers.length; j++){
            answer.push(numbers[i] + numbers[j]);
        }
    }
    answer.sort((a,b) => {
        if(a > b) return 1;
        else if(a < b) return -1;
        else return 0;
    });
    return answer.filter((element, index) => {
        return answer.indexOf(element) === index;
    });
}