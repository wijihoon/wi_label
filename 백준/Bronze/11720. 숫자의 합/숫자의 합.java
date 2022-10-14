import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        br.readLine();
        String[] strArr = br.readLine().split("");
        int result = 0;
        
        for(String s : strArr){
            result += Integer.parseInt(s);    
        }
        
    	bw.write("" + result);
    	bw.close();
    }
}