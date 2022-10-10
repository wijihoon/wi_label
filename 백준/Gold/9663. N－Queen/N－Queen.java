/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    static int N, answer;
    static int[] intArr;
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		input();
		
		rec_func(0);
		
		output();
	}
	
	static void input() throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    N = Integer.parseInt(br.readLine());
	    intArr = new int[N];
	}
	
	static void output() throws IOException{
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    bw.write("" + answer);
	    bw.close();
	}
	
	static void rec_func(int row){
	    if(row == N){
	        answer++;
	    }else{
	        for(int i = 0; i < N; i++){
	            Boolean possible = true;
	            
	            for(int j = 0; j < row; j++){
	                if(attackable(row, i, j, intArr[j])){
    	                possible = false;
    	                break;
	                } 
	            }
	            
	            if(possible){
	                intArr[row] = i;
	                rec_func(row + 1);
	            }
	        }
	    }
	}
	
	static Boolean attackable(int row, int col, int comRow, int comCol){
	    
	    if(comRow - comCol == row - col) return true;
	    if(comRow + comCol == row + col) return true;
	    if(comCol == col) return true;
	    
	    return false;
	}
}
