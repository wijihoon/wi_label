import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String[] strArr = br.readLine().split(" ");
    	
    	while(Integer.parseInt(strArr[0]) > 0){
    	    
    	    bw.write(Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[1]) + "\n");
    	    
    	    strArr = br.readLine().split(" ");
    	    
    	}
    	
        bw.close();   //스트림을 닫음
	}

}