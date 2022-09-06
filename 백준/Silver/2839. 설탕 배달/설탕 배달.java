import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int blow = Integer.parseInt(br.readLine());
        int result = blow / 5;
        blow = blow % 5;
        
        while(result >= 0){
            if(blow % 3 == 0){
                result += blow / 3; 
                break;
            }else{
                blow += 5;
                result--;
            }
        }
        
        bw.write(result + "\n");
    	
        bw.close();
    }
}