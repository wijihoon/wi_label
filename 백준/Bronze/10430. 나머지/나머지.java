import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
		Scanner Scan = new Scanner(System.in);
		
		int num1 = Scan.nextInt();
		int num2 = Scan.nextInt();
		int num3 = Scan.nextInt();
		
        //(A+B)%C
		System.out.println((num1 + num2) % num3);
		
        //((A%C) + (B%C))%C
		System.out.println(((num1 % num3) + (num2 % num3)) % num3);
		
        //(A×B)%C,
		System.out.println((num1 * num2) % num3);
		
        //((A%C) × (B%C))%C
		System.out.println(((num1 % num3) * (num2 % num3)) % num3);
			
	}

}