import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	br.readLine();
    	
    	Integer[] numArr = Arrays.stream(br.readLine().split(" "))
    	                        .map(Integer::parseInt)
    	                        .sorted()
    	                        .toArray(Integer[]::new);
    	double result = 0;
    	
    	for(int i = 0; i < numArr.length; i++){
    	    result += (double) numArr[i] / numArr[numArr.length - 1] * 100;
    	}
    	
    	bw.write("" + result/numArr.length);
    	bw.close();
    	
	}

}