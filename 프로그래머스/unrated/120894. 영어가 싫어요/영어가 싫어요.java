class Solution {
    public long solution(String numbers) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < strArr.length; i++){
            numbers = numbers.replaceAll(strArr[i], String.valueOf(i));
        }
        
        return Long.parseLong(numbers);
    }
}