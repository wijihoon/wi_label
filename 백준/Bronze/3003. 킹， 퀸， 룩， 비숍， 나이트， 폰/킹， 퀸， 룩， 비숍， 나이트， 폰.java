import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] strArr = br.readLine().split(" ");
        int[] intArr = {1, 1, 2, 2, 2, 8};
        StringBuffer sb = new StringBuffer();
        
        //킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
        for(int i = 0; i < intArr.length; i++){
            if(i == intArr.length - 1){
                sb.append(intArr[i] - Integer.parseInt(strArr[i]));
            }else{
                sb.append(intArr[i] - Integer.parseInt(strArr[i]));
                sb.append(" ");
            }
        }
        bw.write(sb.toString());
        bw.close();
    }
}