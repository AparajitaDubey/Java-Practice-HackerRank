import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String : ");
		in.next();
		
		String s = "Aparajita Dubey";
		
		int len = s.length();
		
		System.out.println(len);
		
		for (int i = len-1 ; i>= 0; i--) {
			
			System.out.print(s.charAt(i));
		}
	}
	
}