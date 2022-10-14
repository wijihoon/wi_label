function solution(arr){
    var answer = [];
    let trust = true;
    for(let i = 0; i < arr.length - 1; i++){
        if(arr[i] != arr[i+1]){
            answer.push(arr[i]);
            trust = true;
        }else{
            trust = false;
        }
    }
    answer.push(arr[arr.length - 1]);
    
    return answer;
}