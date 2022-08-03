import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] strArr = br.readLine().split("");
        int num = 0;
        
        for(int i = 0; i < strArr.length; i++){
            if("ABC".contains(strArr[i])){
                num += 3;
            }else if("DEF".contains(strArr[i])){
                num += 4;
            }else if("GHI".contains(strArr[i])){
                num += 5;
            }else if("JKL".contains(strArr[i])){
                num += 6;
            }else if("MNO".contains(strArr[i])){
                num += 7;
            }else if("PQRS".contains(strArr[i])){
                num += 8;
            }else if("TUV".contains(strArr[i])){
                num += 9;
            }else if("WXYZ".contains(strArr[i])){
                num += 10;
            }
        }
        
        bw.write("" + num);
    	bw.close();
    }
}