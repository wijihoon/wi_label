import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int cnt = Integer.parseInt(br.readLine());
        String[] fsStrArr;
        String[] scStrArr;
        
        for(int i = 0; i < cnt; i++){
            fsStrArr = br.readLine().split(" ");
            scStrArr = fsStrArr[1].split("");
            
            for(String s : scStrArr){
                for(int j = 0; j < Integer.parseInt(fsStrArr[0]); j++){
                    bw.write(s);
                }
            }
            bw.write("\n");
        }
        
    	bw.close();
    }
}