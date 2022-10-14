function solution(nums) {
    var answer = nums.length/2;
    nums = [...new Set(nums)];
    return answer > nums.length ? nums.length : answer;
}