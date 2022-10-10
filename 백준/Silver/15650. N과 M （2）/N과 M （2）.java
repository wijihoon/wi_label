/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    static int N, M;
    static int[] intArr;
    static StringBuffer sb = new StringBuffer();
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
	    input();
	    
	    rec_func(0);
	    
	    output();
	}
	
	static void input() throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    String[] strArr = br.readLine().split(" ");
	    
	    N = Integer.parseInt(strArr[0]);
	    M = Integer.parseInt(strArr[1]);
	    
	    intArr = new int[M];
	}
	
	static void output() throws IOException{
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    bw.write(sb.toString());
	    bw.close();
	}
	
	static void rec_func(int k){
	    if(k == M){
	        for(int i = 0; i < M; i++){
	            sb.append(intArr[i]).append(" ");
	        }
	        sb.append("\n");
	    }else{
	        for(int i = 1; i <= N; i++){
	            Boolean used = false;
	            for(int j = 0; j < M; j++){
	                if(intArr[j] >= i){
	                    used = true;
	                }
	            }
	            if(!used){
                    intArr[k] = i;
                    rec_func(k + 1);
                    intArr[k] = 0;
	            }
	        }
	    }
	}
}
