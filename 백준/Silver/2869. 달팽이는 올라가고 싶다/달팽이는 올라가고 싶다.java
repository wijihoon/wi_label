import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] strArr = br.readLine().split(" ");
        int height = Integer.parseInt(strArr[2]);
        int up = Integer.parseInt(strArr[0]);
        int down = Integer.parseInt(strArr[1]);
        int cnt = (height - down) / (up - down);
        
        bw.write("" + ((height - down) % (up - down) != 0 ? ++cnt : cnt));
    	bw.close();
    }
}