
public class Prob6 {

	public static void main(String args[]) {
		int upperLimit = 100;
		long retVal = 0;
		int totalSum = upperLimit*(upperLimit+1)/2;
		for(int i = 1; i<upperLimit; i++) {
			totalSum -= i;
			retVal += 2*i*totalSum;
		}
		System.out.println(retVal);
	}
	


}