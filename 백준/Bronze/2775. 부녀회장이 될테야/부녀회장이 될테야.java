import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int cnt = Integer.parseInt(br.readLine());
        int k, n = 0;
        
		// 아파트 생성 
		int[][] APT = new int[15][15];
 
		for(int i = 0; i < 15; i++) {
			APT[i][1] = 1;	// i층 1호
			APT[0][i] = i;	// 0층 i호
		}
 
		for(int i = 1; i < 15; i ++) {	// 1층부터 14층까지
			for(int j = 2; j < 15; j++) {	// 2호부터 14호까지
				APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
			}
		}
		
        for(int i = 0; i < cnt; i++){
            k = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
            
            bw.write(APT[k][n]+"\n");
        }
    	
        bw.close();
    }
}