import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        int numCom = 1;
        int result = 0;
        
        while(num > numCom){
            numCom += result*6;
            result++;
        }
        
        bw.write("" + (result == 0 ? 1 : result));
        
    	bw.close();
    }
}