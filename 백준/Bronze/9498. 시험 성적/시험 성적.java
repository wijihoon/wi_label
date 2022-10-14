import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
		Scanner Scan = new Scanner(System.in);
		
		int num1 = Scan.nextInt();
		
        //90 ~ 100점은 A,
        if(num1 >= 90){
	    	System.out.println("A");
        }
        //80 ~ 89점은 B
        else if(num1 >= 80){
	    	System.out.println("B");
        }
        //70 ~ 79점은 C
        else if(num1 >= 70){
	    	System.out.println("C");
        }
        //60 ~ 69점은 D
        else if(num1 >= 60){
	    	System.out.println("D");
        }
        //나머지 점수는 F
        else{
	    	System.out.println("F");
        }
			
	}

}