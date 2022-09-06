import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] strArr = br.readLine().split(" ");
        BigDecimal a = new BigDecimal(strArr[0]);
        BigDecimal b = new BigDecimal(strArr[1]);
        
        bw.write(a.add(b) + "\n");
    	
        bw.close();
    }
}