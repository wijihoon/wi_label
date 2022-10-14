class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String strAnswer = "";
        String strArr1 = "";
        String strArr2 = "";
        for(int i = 0; i < n; i++){
            strArr1 = Integer.toBinaryString(arr1[i]);
            while(strArr1.length() != n){
                strArr1 = "0" + strArr1;
            }
            strArr2 = Integer.toBinaryString(arr2[i]);
            while(strArr2.length() != n){
                strArr2 = "0" + strArr2;
            }
            // System.out.println("strArr1 = " + strArr1 + " strArr2 = " + strArr2);
            
            for(int j = 0; j < n; j++){
                // System.out.println(strArr1.substring(j, j+1).compareTo(strArr2.substring(j, j+1)));
                strAnswer += strArr1.substring(j, j+1).compareTo(strArr2.substring(j, j+1)) > 0 ? strArr1.substring(j, j+1) : strArr2.substring(j, j+1);
            }
            //System.out.println("strAnswer = " + strAnswer);
            
            answer[i] = strAnswer.replaceAll("1", "#").replaceAll("0", " ");
            
            strAnswer = "";
        }
        return answer;
    }
}