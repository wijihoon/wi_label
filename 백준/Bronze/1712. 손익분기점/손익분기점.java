import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] strArr = br.readLine().split(" ");
        int a = Integer.parseInt(strArr[0]);
        int b = Integer.parseInt(strArr[1]);
        int c = Integer.parseInt(strArr[2]);
        
        if(c-b <= 0){
            bw.write("" + -1);
        }else{
            bw.write("" + ((int)(a/(c-b)) + 1));
        }
        
    	bw.close();
    }
}