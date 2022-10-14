import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0) return cities.length * 5;
	    
	    int answer = 0;
        
	    ArrayList<String> arrList = new ArrayList<>();
	    
	    for(int i = 0; i < cities.length; i++){
	        cities[i] = cities[i].toLowerCase();
	        
	        if(arrList.contains(cities[i])){
	            answer++;
	            arrList.remove(cities[i]);
                arrList.add(cities[i]);
	        }else{
	            if(arrList.size() == cacheSize){
    	            arrList.remove(0);
    	            arrList.add(cities[i]);
	                
	            }else{
	                arrList.add(cities[i]);
	            }
	            answer += 5;
	        }
	    }
	    
	    return answer;
    }
}