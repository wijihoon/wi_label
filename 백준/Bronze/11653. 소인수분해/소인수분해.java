import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int input = Integer.parseInt(br.readLine());
        int div = 2; // 1은 제외
    	
    	if(input != 1){
        	while(input != div){
        	    if(input % div == 0){
        	        input /= div;
        	        bw.write(div + "\n");
        	        div = 2; //초기화
        	    }else div++;
        	}
        	
        	bw.write(div + "\n");
    	}
    	
        bw.close();
    }
}