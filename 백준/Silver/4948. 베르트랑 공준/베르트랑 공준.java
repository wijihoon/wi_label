import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine()), cnt = 0;
        boolean[] bln = null;
        
        while(num != 0){
            bln = new boolean[2 * num + 1];
            
            bln[0] = bln[1] = true;
        
            // 에라토스테네스의 체 알고리즘
            for(int i = 2; i <= Math.sqrt(bln.length); i++) {
    			if(bln[i]) continue;
    			for(int j = i * i; j < bln.length; j += i) {
    				bln[j] = true;
    			}
    		}
    		
    		for(int i = num + 1; i < bln.length; i++){
                if(!bln[i]) cnt++;
            }
            
            bw.write(cnt + "\n");
            
            num = Integer.parseInt(br.readLine());
            cnt = 0;
        }
        
        bw.close();
    }
}