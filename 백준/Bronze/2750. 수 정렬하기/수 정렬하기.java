import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int cnt = Integer.parseInt(br.readLine());
        int[] intArr = new int[cnt];
        
        for(int i = 0; i < cnt; i++){
            intArr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.stream(intArr).sorted().forEach(a -> System.out.println(a));
        // bw.write(sum == 0 ? "Yes" : "No");
        // bw.close();
    }
}