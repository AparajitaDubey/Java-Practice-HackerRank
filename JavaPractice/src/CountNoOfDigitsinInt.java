import java.util.Scanner;

public class CountNoOfDigitsinInt {

	public static void main(String[] args) {
		
		//Approach1
//			Scanner in = new Scanner(System.in);
//			System.out.println(" Enter integer : ");
//			int num = in.nextInt();
//			
//			char[] ch = ("" + num).toCharArray();
//			
//			int len =ch.length;
//			
//			System.out.println(len);

		
		//Approach 2
		int count = 0, num =123;
		
		while(num!=0) {
			num = num/10;
			count++;
		}
		System.out.println(count);
	}

}
