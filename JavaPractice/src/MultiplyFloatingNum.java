import java.util.Scanner;

public class MultiplyFloatingNum {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first floating num : ");
		float f1 = in.nextFloat();
		
		System.out.println("Enter second floating num : ");
		float f2 = in.nextFloat();
		
		float multiply = f1 * f2;
		
		System.out.println(" Addition is : " + multiply);
		
	}

}
