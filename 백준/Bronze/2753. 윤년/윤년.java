import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
		Scanner Scan = new Scanner(System.in);
		
		int num1 = Scan.nextInt();
		
        //연도가 4의 배수이면서
        //100의 배수가 아닐 때 또는 400의 배수일 때 = 1
        if(num1%4 == 0
        &&(num1%100 != 0 || num1%400 == 0)){
	    	System.out.println("1");
        }
        // 0
        else{
	    	System.out.println("0");
        }
			
	}

}