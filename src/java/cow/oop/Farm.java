package cow.oop;
/**
 * 这是一个农场
 * @author 10598
 *
 */

import java.util.ArrayList;
import java.util.List;

public class Farm {

	private List<Cow> cowList = new ArrayList<Cow>();
	
	public Farm() {
		
	}
	
	public List<Cow> getCowList(){
		return cowList;
	}
	
	public void setCowList(List<Cow> cowList) {
		this.cowList = cowList;
	}
	
	
}
