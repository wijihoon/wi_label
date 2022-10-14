import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int[] numArr = new int[10];
    	String str = Integer.toString(
                        	             Integer.parseInt(br.readLine())
                            	       * Integer.parseInt(br.readLine())
                            	       * Integer.parseInt(br.readLine())
                            	     );
                            	   
        
        
        for(String s : str.split("")){
            numArr[Integer.parseInt(s)]++;
        }
        
        for(int i : numArr){
          	bw.write(i + "\n");
        }
    	bw.close();
    	
	}

}