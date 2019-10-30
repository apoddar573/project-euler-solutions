
import java.lang.Math;

public class Prob7 {

	public static boolean isPrime(int value) {
		for(int i = 2; i<=Math.sqrt(value); i++) {
			if(value%i == 0) return false;
		}
		return true;
	}

	public static void main(String args[]) {
		int reqd = 10001;
		int n = 0, i = 1;
		while(n<reqd) {
			i++;
			if(isPrime(i)) {
				n++;
			}
		}
		System.out.println(i);
	}
	


}