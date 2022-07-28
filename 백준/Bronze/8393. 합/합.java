import java.util.*;

public class Main {

	public static void main(String[] args) {
	    
    	Scanner sc = new Scanner(System.in);
    	
    	int num1 = sc.nextInt();
    	int bowl = 0;
    	
    	for (int i = 1; i < num1 + 1; i++){
    	    bowl += i;
    	}
    	
    	System.out.println(bowl);
    	
	}

}