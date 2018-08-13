import java.util.Scanner;

public class mainParameters {

	
	public static void main(String[] args) {

		int min ;
		int max ;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a min value:");
		
		min = sc.nextInt();
		
		System.out.println("enter a max value:");
		
		max = sc.nextInt();
		
		
		
		int number = getRandomNumber(min,max);
		
		System.out.print(number);
		
	}
	
	public static int getRandomNumber(int min, int max) {
	return(int) (Math.random() * (max - min + 1)) + min;	
	}
	
	
	
}
