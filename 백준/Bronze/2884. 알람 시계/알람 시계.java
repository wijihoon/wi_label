import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
		Scanner Scan = new Scanner(System.in);
		
		int num1 = Scan.nextInt();
		int num2 = Scan.nextInt() - 45;
		
	    if(num2 < 0){
	        num1--;
	        if(num1 < 0){
	            num1 += 24;
	        }
	        num2 += 60;
	    }
	    
	    System.out.println(num1 + " " + num2);
	}

}