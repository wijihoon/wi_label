import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int num1 = Integer.parseInt(br.readLine());
    	String[] strArr = br.readLine().split(" ");
    	
    	int max = Integer.parseInt(strArr[0]);
    	int min = Integer.parseInt(strArr[0]);
    	
    	for(int i = 1; i < num1; i++){
    	    if(max < Integer.parseInt(strArr[i])){
    	        max = Integer.parseInt(strArr[i]);
    	    }
    	    if(min > Integer.parseInt(strArr[i])){
    	        min = Integer.parseInt(strArr[i]);
    	    }        
    	}
    	
    	bw.write(min + " " + max);
    	bw.close();
    	
	}

}