import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] strArr = br.readLine().split(" ");
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i < strArr.length; i++){
            sb = new StringBuffer(strArr[i]);
            strArr[i] = sb.reverse().toString();
        }
        
        Integer[] numArr = Arrays.stream(strArr).map(Integer::parseInt).sorted().toArray(Integer[]::new);
        
        bw.write("" + numArr[1]);
    	bw.close();
    }
}