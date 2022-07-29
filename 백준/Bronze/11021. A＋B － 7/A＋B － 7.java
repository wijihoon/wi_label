import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int num1 = Integer.parseInt(br.readLine());
    	String[] strArr = new String[2];
    	
    	for (int i = 1; i < num1 + 1; i++){
    	    //ex) Case #1: 2
    	    strArr = br.readLine().split(" ");
    	    bw.write("Case #" + i + ": " + (Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[1])) + "\n");
    	}
    	
        bw.close();   //스트림을 닫음
	}

}