import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String[] strArr = br.readLine().split(" ");
    	String str = "";
    	
    	while(strArr != null){
    	    
    	    bw.write(Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[1]) + "\n");
    	    str = br.readLine();
    	    
    	    if(str != null){
    	       strArr = str.split(" "); 
    	    }else{
    	        strArr = null;
    	    }
    	    
    	}
    	
        bw.close();   //스트림을 닫음
	}

}