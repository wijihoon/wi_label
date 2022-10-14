import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int cnt = Integer.parseInt(br.readLine());
    	int result = 0;
    	
    	for(int i = 1; i <= cnt; i++){
    	    if(i < 100){
    	       result++; 
    	    }else{
    	       result += compare(i);
    	    }
    	}
    	
    	bw.write(result + "");
    	bw.close();
	}
    
    public static int compare(int num){
        
        String[] strArr = Integer.toString(num).split("");
        int numCom = Integer.parseInt(strArr[1]) - Integer.parseInt(strArr[0]);
        
        for(int i = 2; i < strArr.length; i++){
            if(Integer.parseInt(strArr[i]) - Integer.parseInt(strArr[i-1]) != numCom){
                return 0;
            }
        }
        
        return 1;
    }
}