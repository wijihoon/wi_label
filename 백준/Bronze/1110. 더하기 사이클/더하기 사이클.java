import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String str = br.readLine();
    	
    	if(str.length() == 1) str = "0" + str;
    	
    	String[] strArr = str.split("");
    	String bowl = "";
    	int cnt = 1;
    	
    	while(true){
    	    
            bowl = Integer.toString(Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[1]));
            bowl = bowl.substring(bowl.length() - 1, bowl.length());
            
            strArr[0] = strArr[1];
            strArr[1] = bowl;
            
            if(String.join("", strArr).equals(str)){
                bw.write(Integer.toString(cnt));
                break;
            }else{
                cnt++;
            }
    	    
    	}
    	
    	bw.close();
    	
	}

}