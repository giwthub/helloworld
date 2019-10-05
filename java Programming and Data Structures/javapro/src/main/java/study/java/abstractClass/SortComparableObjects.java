package study.java.abstractClass;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class SortComparableObjects {

	public static void main(String[] args) throws Exception {
		String[] cities = {"abc","bcd","acb","cde"
				
		};
		Arrays.sort(cities);
		for (String city : cities) {
			System.out.print(city + " ");
			
		}
		System.out.println();
		
		BigInteger[] hugeNumbers = {
				new BigInteger("234298732498732897498"),
				new BigInteger("230193480294753092802123"),
				new BigInteger("098098309289034780931712990"),
				new BigInteger("888382919020139012")
				
		};
		Arrays.sort(hugeNumbers);
		for (BigInteger bigInteger : hugeNumbers) {
			System.out.println(bigInteger + " ");
		}
	}
}
