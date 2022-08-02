import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int iCnt = Integer.parseInt(br.readLine());
    	int jCnt = 0;
    	double result = 0;
    	int num = 0;
    	String[] strArr = new String[iCnt];
    	
    	for(int i = 0; i < iCnt; i++){
    	    
    	    strArr = br.readLine().split(" ");
    	    jCnt = Integer.parseInt(strArr[0]);
    	    
        	for(int j = 1; j <= jCnt; j++){
	            result += Integer.parseInt(strArr[j]);
        	}
        	
        	result /= jCnt;
        	
        	for(int k = 1; k <= jCnt; k++){
	            if(result < Integer.parseInt(strArr[k])){
	                num++;
	            }
        	}
         	
        	result = (double) num / jCnt * 100;
        	
        	bw.write(String.format("%.3f", result) + "%\n");
        	result = 0;
        	num = 0;
        	
	    }
    	
    	bw.close();
    	
	}

}