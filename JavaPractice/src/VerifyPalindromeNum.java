import java.util.Scanner;

public class VerifyPalindromeNum {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int actNum = in.nextInt();
		int originalNum = actNum;
		int reversed = 0 ;
		
		while(actNum!=0) {
			int digit = actNum % 10;
			reversed = reversed * 10 + digit;
			actNum/= 10;
		}
		
		System.out.println("Reversed num : " + reversed);	
		System.out.println("original  Num : " + originalNum);
		if(originalNum == reversed) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}

	}
	
	

}
