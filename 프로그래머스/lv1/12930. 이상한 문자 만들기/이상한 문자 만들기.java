class Solution {
    public String solution(String s) {
        String answer = "";
        String[] bowl = s.split("");
        boolean trust = true;
        for(int i = 0; i < bowl.length; i++){
            if(!" ".equals(bowl[i])){
                if(trust){
                    bowl[i] = bowl[i].toUpperCase();
                    trust = false;
                }else{
                    bowl[i] = bowl[i].toLowerCase();
                    trust = true;
                }
            }else{
                trust = true;
            }
        }
        return answer = String.join("", bowl);
    }
}