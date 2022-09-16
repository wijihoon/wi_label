import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int sum = Integer.parseInt(br.readLine());
        int cnt = Integer.parseInt(br.readLine());
        String[] strArr = null;
        
        for(int i = 0; i < cnt; i++){
            strArr = br.readLine().split(" ");
            sum -= Integer.parseInt(strArr[0]) * Integer.parseInt(strArr[1]);
        }
        bw.write(sum == 0 ? "Yes" : "No");
        bw.close();
    }
}