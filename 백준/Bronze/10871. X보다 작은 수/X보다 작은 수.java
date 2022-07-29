import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String[] strArr = br.readLine().split(" ");
    	int cnt = Integer.parseInt(strArr[0]);
    	int cpr = Integer.parseInt(strArr[1]);
    	strArr = br.readLine().split(" ");
    	String str = "";
    	
    	for (int i = 0; i < cnt; i++){
    	    if(Integer.parseInt(strArr[i]) < cpr){
    	        str += strArr[i] + " ";
    	    }
    	}
    	bw.write(str.trim());
        bw.close();   //스트림을 닫음
	}

}