
public class ForLoopString {

	public static void main(String[] args) {
		
		String s = "Aparajita Dubey";
		
		int len =s.length();
		
		System.out.println(len);
		
		for(int i=len-1 ; i>=0 ;i--) {
			
			System.out.print(s.charAt(i));
			
			len--;
			
		}
	}

}
