import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int cnt = Integer.parseInt(br.readLine());
        int height = 0;
        int width = 0;
        int order = 0;
        
        String[] strArr = new String[3];
        //호텔의 층 수, 각 층의 방 수, 몇 번째 손님
        for(int i = 0; i < cnt; i++){
            strArr = br.readLine().split(" ");
            
            if(Integer.parseInt(strArr[2]) % Integer.parseInt(strArr[0]) == 0){
                height = Integer.parseInt(strArr[0]);
                width = Integer.parseInt(strArr[2]) / Integer.parseInt(strArr[0]);
            }else{
                height = Integer.parseInt(strArr[2]) % Integer.parseInt(strArr[0]);
                width = Integer.parseInt(strArr[2]) / Integer.parseInt(strArr[0]) + 1;
            }
            bw.write("" + height + (Integer.toString(width).length() == 1 ? "0" + width : width) + "\n");
        }
    	
        bw.close();
    }
}