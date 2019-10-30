

public class Prob4 {
	

	private static boolean isPalindrome(int value) {
		int reverse = 0, temp = value;
		while(value > 0) {
			if(value>0) {
				int rem = value%10;
				reverse = 10*reverse + rem;
				value = value/10;
			}
		}
		if(temp == reverse) 
			return true;
		return false;
	}


	public static void main(String args[]) {
		int retVal = 0;

		for(int i = 999; i>=100; i--) {
			for(int j = 990; j>=100; j -= 11) {
				int tempVal = i*j;
				if(retVal<tempVal && isPalindrome(tempVal)) {
					retVal = tempVal;
					break;
				}
				if(tempVal<retVal) break;
			}
		}
		System.out.println(retVal);

	}


}