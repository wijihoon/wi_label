import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine()), cnt = 0;
        
        String str = "";
        
        boolean[] bln = null;
        
        while(num != 0){
           
            if(num > 3){
            
                bln = new boolean[num + 1];
                
                bln[0] = bln[1] = true;
            
                // 에라토스테네스의 체 알고리즘
                for(int i = 2; i <= Math.sqrt(bln.length); i++) {
        			if(bln[i]) continue;
        			for(int j = i * i; j < bln.length; j += i) {
        				bln[j] = true;
        			}
        		}
        		
        		for(int i = 2; i <= bln.length / 2; i++){
                    if(!bln[i] && !bln[num - i]){
                        str = i + " " + (num - i);
                    }
                }
                
                if(str != ""){
                    bw.write(str + "\n");
                }
                
            }
            
            str = br.readLine();
            num = Integer.parseInt(str == null ? "0" : str);
            str = "";
            cnt = 0;
        }
        
        bw.close();
    }
}