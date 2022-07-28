import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
		Scanner Scan = new Scanner(System.in);
		
		int num1 = Scan.nextInt();
		int num2 = Scan.nextInt();
		
        //A가 B보다 큰 경우에는 '>'를 출력한다.
        if(num1 > num2){
	    	System.out.println(">");
        }
        //A가 B보다 작은 경우에는 '<'를 출력한다.
        else if(num1 < num2){
	    	System.out.println("<");
        }
        //A와 B가 같은 경우에는 '=='를 출력한다.
        else if(num1 == num2){
	    	System.out.println("==");
        }
			
	}

}