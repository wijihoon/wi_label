import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int minRan = Integer.parseInt(br.readLine()), maxRan = Integer.parseInt(br.readLine());
        int sum = 0, num = 0, min = 0, cnt = 0;
        
        for(int i = minRan; i <= maxRan; i++){
            
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    cnt++;
                    break;   
                }
            }
            
            if(cnt == 0 && i != 1){
                if(min == 0) min = i;
                sum += i;
            }
            
            cnt = 0;
        }
        
        if(min == 0) bw.write(-1 + "\n");
        else bw.write(sum + "\n" + min + "\n");
    	
        bw.close();
    }
}