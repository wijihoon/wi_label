import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        br.readLine();
        
        String[] strArr = br.readLine().split(" ");
        int result = 0, num = 0, cnt = 0;
        
        for(int i = 0; i < strArr.length; i++){
            
            num = Integer.parseInt(strArr[i]);
            
            for(int j = 2; j < num; j++){
                if(num % j == 0){
                    cnt++;
                    break;   
                }
            }
            
            if(cnt == 0 && num != 1) result++;
            
            cnt = 0;
        }
        
        bw.write(result + "\n");
    	
        bw.close();
    }
}