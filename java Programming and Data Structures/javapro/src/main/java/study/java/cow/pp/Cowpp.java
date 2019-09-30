package study.java.cow.pp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cowpp {

	public static void main(String[] args) throws Exception {
		
		
		//所有牛的集合
		List<Integer> cowAgeList = new ArrayList<Integer>();
		
		cowAgeList.add(5);
		
		for(int i = 0; i < 20; i++) {
			
			int count_new = 0;
			
			int count_dead = 0;
			
			
			List<Integer> cowchild = new ArrayList<Integer>();
			
			
			for(int index = 0; index < cowAgeList.size(); index++) {
				
				
				int age = cowAgeList.get(index) + 1;
				
				cowAgeList.set(index,age);
				
				if(age > 15) {
					count_dead++;
					continue;
				}
				
				Integer cowNew = produce(age);
				
				if(cowNew != null) {
					count_new++;
					cowchild.add(cowNew);
				}		
			}
			cowAgeList.addAll(cowchild);
			
			System.out.println("第" + i + "年，出生 " + count_new + " 只牛, 死亡 " + count_dead + " 只牛。");
		
			
					
		}
		
		Iterator<Integer> iterator = cowAgeList.iterator();
		
		while(iterator.hasNext()) {
			if(iterator.next().intValue() > 15) {
				iterator.remove();
			}
		}
		System.out.println(String.format("20年后有%d只牛", cowAgeList.size()));
	}
	
	private static Integer produce(int age) {
		if(age <= 15 && age >= 5) {
			return 0;
		}
		return null;
	}
	
	
}

/**
 * for(第几年){
 * 	for(第几只牛){
 * 		这只牛死不死？
 * 		这只牛生不生小牛？
 * 		牛的年龄+1；
 * 
 */




