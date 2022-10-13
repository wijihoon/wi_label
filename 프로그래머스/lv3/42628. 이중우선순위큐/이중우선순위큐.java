import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
	    String[] strArr;
	    ArrayList<Integer> arrList = new ArrayList<>();
	    
	    for(String str : operations){
	        strArr = str.split(" ");
	        
	        if(strArr[0].equals("I")){
	            arrList.add(Integer.parseInt(strArr[1]));
	        }else{
	            if(Integer.parseInt(strArr[1]) > 0){
	                //최대값 제거
	                if(arrList.size() > 0){
	                    arrList.remove(arrList.size() - 1);
	                }
	            }else{
	                //최소값 제거
	                if(arrList.size() > 0){
	                    arrList.remove(0);
	                }
	            }
	        }
	        
	        Collections.sort(arrList);
	    }
	    
	    
        int[] answer = new int[2];
        
        if(arrList.size() > 1){
            answer[0] = arrList.get(arrList.size() - 1);
            answer[1] = arrList.get(0);
        }
        
        return answer;
    }
}