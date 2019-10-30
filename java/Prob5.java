
import java.util.*;
import java.lang.Math;

public class Prob5 {

	public static List<Integer> returnPrimes(int upperLimit) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		boolean isPrime = true;

		for(int i = 3; i<=upperLimit; i+=2) {
			isPrime = true;
			int j = 0;
			while(list.get(j)*list.get(j)<=i) {
				if(i%list.get(j) == 0) {
					isPrime = false;
					break;
				}
				else j++;
			}
			if(isPrime) {
				list.add(i);
			}
		}
		return list;
	}


	public static void main(String args[]) {
		int upperLimit = 20;
		List<Integer> primeList= returnPrimes(upperLimit);
		long retVal = 1;
		for(int i = 0; i<primeList.size(); i++) {
			System.out.println(primeList.get(i));
			int a = (int)Math.floor(Math.log(upperLimit)/Math.log(primeList.get(i)));
			retVal = retVal*(long)(Math.pow(primeList.get(i), a));
		}
		System.out.println(retVal);
	}
	


}