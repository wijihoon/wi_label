import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
		Scanner Scan = new Scanner(System.in);
		
		int num1 = Scan.nextInt();
		int num2 = Scan.nextInt();
		
		// num1, num2 둘다 양수 시 제1사분면
		if(num1 > 0 
		&& num2 > 0){
		    System.out.println(1);   
		}
		// num1만 음수일 시 제2사분면
		else if(num1 < 0 
		     && num2 > 0){
		    System.out.println(2);
		}
		// num1, num2 둘다 음수 시 제3사분면
		else if(num1 < 0 
		     && num2 < 0){
		    System.out.println(3);
		}
		//제4사분면
		else{
		    System.out.println(4);
		}
	}

}