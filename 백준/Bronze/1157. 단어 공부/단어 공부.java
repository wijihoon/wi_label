import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	    
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] strCount = new int[26]; //A ~ Z 알파벳 26개
        int max = 0;
        int maxIndex = 0;

        str = str.toUpperCase();
        
        //알파벳 수 계산
        for (int i = 0; i < str.length(); i++) {
            strCount[(int)str.charAt(i) - 65]++; // char A = 65
        }
        
        //가장 많이 사용된 알파벳 찾기
        for (int i = 0; i < strCount.length; i++) {
            if (max < strCount[i]) {
                max = strCount[i];
                maxIndex = i;
            } else if (max == strCount[i]) {
                maxIndex = -1;
            }
        }

        if (maxIndex == -1) {
            System.out.println("?");
        } else {
            System.out.println((char)(maxIndex + 65));
        }
        
	}
}