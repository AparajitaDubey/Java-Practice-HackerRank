
public class PowOfNum {

	public static void main(String[] args) {
	  
		int base = 2 , exponent = 4 , result =1;
		
		while(exponent!=0) {
			result = result * base;
			--exponent;
		}
		
		System.out.println(result);

}
}