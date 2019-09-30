package cow.oop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		Farm farm = new Farm();
		Cow cow = new Cow(5);
		
		farm.getCowList().add(cow);
		for(int year = 0; year < 20; year++) {
			
			int count_dead = 0; 
			
			
			List<Cow> cowChilds = new ArrayList<Cow>();
			
			
			for(Cow cowTemp : farm.getCowList()) {
				cowTemp.addAge();
				Cow child = cowTemp.produceCow();
				if(child != null) {
					cowChilds.add(child);
				}
				if(!cowTemp.isalive()) {
					count_dead++;
				}
			}
			
			farm.getCowList().addAll(cowChilds);
			System.out.println(
					String.format("第%d年，出生：%d，死亡：。%d", year, cowChilds.size(),count_dead)
					);		
			
		}
		
		Iterator<Cow> iterator = farm.getCowList().iterator();
		while(iterator.hasNext()) {
			if(!iterator.next().isalive()) {
				iterator.remove();
			}
		}
		
		System.out.println(
				String.format("20年后，有%d只牛。", farm.getCowList().size())
				);
		
	}
}
