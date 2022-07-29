import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int num1 = Integer.parseInt(br.readLine());
    	String[] strArr = new String[2];
    	
    	for (int i = 0; i < num1; i++){
    	    strArr = br.readLine().split(" ");
    	    bw.write(Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[1]) + "\n");
    	}
    	
        bw.close();   //스트림을 닫음
	}

}