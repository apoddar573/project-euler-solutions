

public class Prob3 {
	

	public static void main(String args[]) {
		long value = 600851475143L;
		int reqd = 0;
		for(int i = 2; ; ) {
			if(value%i == 0) {
				reqd = i;
				value = value/i;
			}
			else
				i++;
			if(value == 1) break;
		}

		System.out.println(reqd);

	}


}