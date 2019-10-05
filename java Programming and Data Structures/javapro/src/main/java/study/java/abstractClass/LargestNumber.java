package study.java.abstractClass;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 * 找到一个Number对象列表中的最大数
 *
 */
public class LargestNumber {

	public static void main(String[] args) throws Exception {
		ArrayList<Number> list = new ArrayList<Number>();
		
		list.add(45);
		list.add(294.1423);
		
		list.add(new BigInteger("2430927309423890528139043209"));
		
		list.add(new BigDecimal("21242.3298401348939841891289312281934893893284213"));
		
		System.out.println("" + getLargestNumber(list));
		
		
	}
	
	public static Number getLargestNumber(ArrayList<Number> list) {
		if(list == null || list.size() == 0)
			return null;
		
		Number number = list.get(0);
		for(int i = 0; i < list.size(); i++)
			if(number.doubleValue() < list.get(i).doubleValue())
				number = list.get(i);
		
		return number;
	}
}
