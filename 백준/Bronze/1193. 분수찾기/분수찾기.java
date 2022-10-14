import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int i = Integer.parseInt(br.readLine());
        int num = 0;
        int cnt = 0;
        
        while(i > num){
            cnt++;
            num += cnt;
        }
        if(cnt % 2 == 0){
            bw.write((i - num + cnt) + "/" + (num - i + 1));
        }else{
            bw.write((num - i + 1) + "/" + (i - num + cnt));
        }
        
    	bw.close();
    }
}