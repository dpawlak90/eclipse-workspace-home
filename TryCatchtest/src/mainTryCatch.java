
import java.util.*;

public class mainTryCatch {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		 // int a = 5;
		 // int b = 0;
		  
		System.out.println("enter a value: ");
		
		int i = GetAnInteger();
		
		System.out.println("you entered " + i);
	
	}
	
	
	public static int GetAnInteger() {
		while(true){
			
			try {
				
				return sc.nextInt();
				
			}catch(InputMismatchException e) {
				
				sc.next();
				
				System.out.print("thats not an integer. try again ");
				
			}
			
			
		}
		
	}
	
}
