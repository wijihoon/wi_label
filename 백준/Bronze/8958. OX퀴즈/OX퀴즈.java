import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int cnt = Integer.parseInt(br.readLine());
    	int result = 0;
    	int num = 0;
    	String[] strArr = new String[cnt];
    	
    	for(int i = 0; i < cnt; i++){
    	    strArr = br.readLine().split("");
        	for(int j = 0; j < strArr.length; j++){
        	    if("O".equals(strArr[j])){
        	        num++;
        	        result += num;
        	    }else{
        	        num = 0;
        	    }
        	}
        	bw.write(result + "\n");
        	result = 0;
        	num = 0;
	    }
    	
    	bw.close();
    	
	}

}