import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int[] numArr = new int[1001];
    	String str = br.readLine();
                            	   
        while(str != null){
            numArr[Integer.parseInt(str) % 42]++;
            str = br.readLine();
        }
        
        System.out.println(Arrays.stream(numArr).filter(a -> a > 0).count());
    //     bw.write((int)Arrays.stream(numArr).filter(a -> a > 0).count());
    // 	bw.close();
    	
	}

}