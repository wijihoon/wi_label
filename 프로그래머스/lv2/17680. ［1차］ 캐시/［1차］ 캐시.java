import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayList<String> cache = new ArrayList<>();
        
        if(cacheSize == 0) // 캐시크기가 0
            return cities.length * 5;
        
        for(int i=0; i<cities.length; i++) {
            cities[i] = cities[i].toUpperCase(); // 대소문자 구분X
            if(cache.contains(cities[i])) { // cache hit
                cache.remove(cities[i]);
                cache.add(cities[i]);
                answer += 1;
            }
            else { // cache miss
                if(cache.size()==cacheSize) {
                    cache.remove(0);
                    cache.add(cities[i]);
                }
                else
                    cache.add(cities[i]);
                answer += 5;
            }
        }
        return answer;
    }
}