import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int maxNum = Integer.parseInt(br.readLine());
    	int baseNum = maxNum;
    	int pos    = 1;
    	for(int i = 0; i < 8; i++){
    	    
    	    baseNum = Integer.parseInt(br.readLine());
    	    
    	    if(maxNum < baseNum){
    	        maxNum = baseNum;
    	        pos = i + 2;
    	    }
    	    
    	}
    	
    	bw.write(maxNum + "\n" + pos);
    	bw.close();
    	
	}

}