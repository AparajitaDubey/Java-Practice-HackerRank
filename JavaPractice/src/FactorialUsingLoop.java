import java.util.Scanner;

public class FactorialUsingLoop {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Input number");
		int num = in.nextInt();
		System.out.println(" Number entered is " + num);
		
		
		int fact = 1;
		
		while(num>1) {
			fact = fact * num;
			
			num--;
			
		
		}
		
		System.out.println("Factorial : " + fact);
		
		
	}

}
