import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int cnt = Integer.parseInt(br.readLine());
        int num = 0;
        int result = 0;
        String[] strArr = null;

        for(int i = 0; i < cnt; i++){
            strArr = br.readLine().split("");
            
            for(int j = 0; j < strArr.length - 1; j++){
                if(strArr[j].equals(strArr[j+1])){
                    num++;
                }
            }
            
            if(strArr.length == (int) Arrays.stream(strArr).distinct().count() + num){
                result++; 
            }
            
            num = 0;
        }
        
        bw.write("" + result);
    	bw.close();
    }
}