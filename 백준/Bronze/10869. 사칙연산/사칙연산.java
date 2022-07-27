import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
		Scanner Scan = new Scanner(System.in);
		
		int num1 = Scan.nextInt();
		int num2 = Scan.nextInt();
		
		//A+B, A-B, A*B, A/B(몫), A%B
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
			
	}

}