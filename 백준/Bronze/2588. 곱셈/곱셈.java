import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
		Scanner Scan = new Scanner(System.in);
		
		int num1 = Integer.parseInt(Scan.nextLine()); //(1) 위치
		String num2 = Scan.nextLine(); //(2) 위치
		
        //(3) 위치
		System.out.println(num1 * Integer.parseInt(num2.substring(2, 3)));
		
        //(4) 위치
		System.out.println(num1 * Integer.parseInt(num2.substring(1, 2)));
		
        //(5) 위치
		System.out.println(num1 * Integer.parseInt(num2.substring(0, 1)));
		
        //(6) 위치
		System.out.println(num1 * Integer.parseInt(num2));
			
	}

}