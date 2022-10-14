import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int num1 = Integer.parseInt(br.readLine());
    	String str = "";
    	
    	for (int i = 0; i < num1; i++){
    	    str += "*";
    	    bw.write(str + "\n");
    	}
    	
        bw.close();   //스트림을 닫음
	}

}