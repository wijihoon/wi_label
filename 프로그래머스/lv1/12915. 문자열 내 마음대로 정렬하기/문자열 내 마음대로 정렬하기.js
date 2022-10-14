function solution(strings, n) {
    var answer = [];
    return strings.sort().sort((a, b) => {
        a = a.substr(n, 1);
        b = b.substr(n, 1);
        console.log("a = " + a + " b = " + b);
        if(a > b) return 1;
        else if(a < b) return -1;
        else return 0;
    });
}