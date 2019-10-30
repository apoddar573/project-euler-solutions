

public class Prob2 {
	

	public static void main(String args[]) {
		int fib0 = 1;
		int fib1 = 1;
		long sum = 0;

		while(true) {
			int next = fib0+fib1;
			if(next>=4000000) 
				break;
			if(next%2 == 0) {
				sum += next;
			}
			fib0 = fib1;
			fib1 = next;
		}

		System.out.println(sum);
	}


}