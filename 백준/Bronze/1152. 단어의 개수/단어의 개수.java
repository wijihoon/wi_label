import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] strArr = br.readLine().split(" ");
        
        strArr = Arrays.stream(strArr).filter(a -> !a.isEmpty()).toArray(String[]::new);
        
        bw.write("" + strArr.length);
    	bw.close();
    }
}