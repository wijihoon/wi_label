import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int[] numArr = new int[10001];
    	int num = 0;
    	
    	for(int i = 1; i <= 10000; i++){
    	    num = dfs(i);
    	    if(num <= 10000){
                numArr[num]++; 
    	    }
    	}
    	
    	for(int i = 1; i <= 10000; i++){
    	  if(numArr[i] == 0){
    	      bw.write(i + "\n");
    	  }
    	}
    	
    	bw.close();
	}
	
	public static int dfs(int num){
	    
	    int result = num;
	    String str = Integer.toString(result);
	    String[] strArr = str.split("");
	    
	    return result + Arrays.stream(strArr).map(Integer::parseInt).mapToInt(i -> i).sum();
	}

}