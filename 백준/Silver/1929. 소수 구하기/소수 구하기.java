import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] strArr = br.readLine().split(" ");
        int num = 0;
        boolean[] bln = new boolean[Integer.parseInt(strArr[1]) + 1];
        
        bln[0] = bln[1] = true;
        
        // 에라토스테네스의 체 알고리즘
        for(int i = 2; i <= Math.sqrt(bln.length); i++) {
			if(bln[i]) continue;
			for(int j = i * i; j < bln.length; j += i) {
				bln[j] = true;
			}
		}
		
        for(int i = Integer.parseInt(strArr[0]); i < bln.length; i++){
            if(!bln[i]) bw.write(i + "\n");
        }
        
        bw.close();
    }
}