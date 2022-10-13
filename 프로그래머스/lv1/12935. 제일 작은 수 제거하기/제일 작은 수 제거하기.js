function solution(arr) {
    if(arr.length == 1) return [-1];
    
    let min = Math.min.apply(null, arr);
    let answer = arr.filter(a => a != min);
    
    return answer;
}