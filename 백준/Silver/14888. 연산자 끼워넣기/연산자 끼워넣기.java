/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    static int N, value;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static int[] intArr;
    static int[] operator = new int[4];
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		input();
		
		rec_func(0, value);
		
		output();
		
	}
	
	static void input() throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    N = Integer.parseInt(br.readLine());
	    intArr = new int[N];
	    
	    String[] strArr = br.readLine().split(" ");
	    for(int i = 0; i < strArr.length; i++) intArr[i] = Integer.parseInt(strArr[i]);
	    
	    value = intArr[0];
	    
	    strArr = br.readLine().split(" ");
	    for(int i = 0; i < strArr.length; i++) operator[i] = Integer.parseInt(strArr[i]);
	}
	
	static void output() throws IOException{
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    bw.write(max + "\n");
	    bw.write(min + "");
	    bw.close();
	}
	
	static void rec_func(int i, int value){
	    if(i == N - 1){
	        max = Math.max(max, value);
	        min = Math.min(min, value);
	    }else{
	        for(int j = 0; j < operator.length; j++){
                if(operator[j] > 0){
                    operator[j]--;
                    rec_func(i + 1, cal(value, j, intArr[i + 1]));
                    operator[j]++;
                }
            }
	    }
	}
	
	static int cal(int val, int operator, int operValue){
	    if(operator == 0){
	        val += operValue;
	    }else if(operator == 1){
	        val -= operValue;
	    }else if(operator == 2){
	        val *= operValue;
	    }else{
	        val /= operValue;
	    }
	    
	    return val;
	}
}
